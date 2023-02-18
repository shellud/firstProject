package com.ua.robot.homework11;

public class Car extends Vehicle{
    private String model;
    private int horsepower;

    public Car(String type, String manufacturer, String color, int productionYear, String model, int horsepower) {
        super(type, manufacturer, color, productionYear);
        this.model = model;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void toDrift(){
        System.out.println("Eee - ron - don - don");
    }

    public String typeInfo (){
        return "The type of a vehicle is " + type;
    }

    @Override
    public String toString() {
        return "{It's a " + manufacturer +
                " " + model +
                " " + type +
                " of " + color +
                " color produced in " + productionYear +
                " with " + horsepower +
                " HP engine}\n";
    }
}
