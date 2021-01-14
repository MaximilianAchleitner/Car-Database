package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.CarDatabase;
import model.Vehicle;

import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
    private Stage stage;
    private CarDatabase db = new CarDatabase();


    @FXML TextField input_tf;
    @FXML TextArea output_ta;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}

    void setDb(){
        db.initDB();
    }

    void setStage(Stage stage){
        this.stage=stage;
    }
    public static void show(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(Controller.class.getResource("sample.fxml"));
            Parent root = loader.load();

            Controller c=loader.getController();

            c.setStage(stage);
            c.setDb();
            stage.setTitle("Car Database");
            stage.setScene(new Scene(root));
            stage.show();

        }catch(Exception ignored){

        }
    }

    public void doSearch(){
        output_ta.setText("");
        ArrayList<Vehicle> list = db.search(input_tf.getText(), false);
        for (Vehicle v:list) {
            output_ta.appendText(v.toString() + "\n\n");
        }
    }

    public void doExactSearch(){
        output_ta.setText("");
        ArrayList<Vehicle> list = db.search(input_tf.getText(), true);
        for (Vehicle v:list) {
            output_ta.appendText(v.toString() + "\n\n");
        }
    }
}
