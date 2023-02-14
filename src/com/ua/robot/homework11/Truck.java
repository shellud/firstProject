package com.ua.robot.homework11;

public class Truck extends Vehicle{
    int loadCapacity;

    public Truck(String type, String manufacturer, String color, int productionYear, int loadCapacity) {
        super(type, manufacturer, color, productionYear);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void toUnload(){
        System.out.println("Oh f*ck, it was glass");
    }

    public String typeInfo (){
        return "The type of a vehicle is " + type;
    }

    @Override
    public String toString() {
        return "{It's a " + manufacturer +
                " " + type +
                " of " + color +
                " color produced in " + productionYear +
                " with load capacity " + loadCapacity +
                " tons}\n";
    }
}
