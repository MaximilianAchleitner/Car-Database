package model;

public class Vehicle {
    String owner;
    String manufacturer;
    String model;
    String licensePlate;
    String color;

    public Vehicle(String color, String owner, String manufacturer, String model, String licensePlate){
        this.color = color;
        this.owner=owner;
        this.manufacturer=manufacturer;
        this.model=model;
        this.licensePlate=licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "color: '" + color + "'\n" +
                "owner: '" + owner + "'\n" +
                "manufacturer: '" + manufacturer + "'\n" +
                "model: '" + model + "'" +
                "licensePlate: '" + licensePlate + "'";
    }



}
