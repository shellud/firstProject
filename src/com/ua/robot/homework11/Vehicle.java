package com.ua.robot.homework11;

public class Vehicle {
    String type;
    String manufacturer;
    String color;
    int productionYear;

    public Vehicle(String type, String manufacturer, String color, int productionYear) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.color = color;
        this.productionYear = productionYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void toDrive(){
        System.out.println("Fast and furious");
    }

    public String typeInfo (){
        return "It's a " + type;
    }

    @Override
    public String toString() {
        return "{It's a " + manufacturer +
                " " + type +
                " of " + color +
                " color produced in " + productionYear +
                "}\n";
    }
}
