package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarDatabase {

    HashMap<String, Vehicle> db = new HashMap<>();

    public CarDatabase(){
        for(int i = 0; i <1000;i++){
            String manufacturer = MagicGenerator.getRandomManufacturer();
            String licensePlate = MagicGenerator.getRandomLicencePlate();
            Vehicle v = new Vehicle(MagicGenerator.getRandomColor(), MagicGenerator.getRandomName(), manufacturer, MagicGenerator.getRandomModel(manufacturer), licensePlate);
            db.put(licensePlate,v);
            System.out.println("Created vehicle with license "+ licensePlate);
        }
    }

    public  void initDB(){
        for(int i = 0; i <1000;i++){
            String manufacturer = MagicGenerator.getRandomManufacturer();
            String licensePlate = MagicGenerator.getRandomLicencePlate();
            Vehicle v = new Vehicle(MagicGenerator.getRandomColor(), MagicGenerator.getRandomName(), manufacturer, MagicGenerator.getRandomModel(manufacturer), licensePlate);
            db.put(licensePlate,v);
            System.out.println("Created vehicle with license"+ licensePlate);
        }
    }


    public ArrayList<Vehicle> search(String licensePlate, boolean exact){
        ArrayList<Vehicle> listOfVehicles = new ArrayList<>();
        if(exact) {
            listOfVehicles.add(db.get(licensePlate));
        }
        else{
            for(Map.Entry m:db.entrySet()){
                if(m.getKey().toString().contains(licensePlate))
                    listOfVehicles.add(db.get(m.getKey()));
            }
        }
        return listOfVehicles;
    }
}
