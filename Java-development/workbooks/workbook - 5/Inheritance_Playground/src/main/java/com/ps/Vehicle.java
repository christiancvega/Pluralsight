package com.ps;

public class Vehicle {
    private String make;
    private String model;
    private int numOfWheels;

    public Vehicle(String make, String model, int numOfWheels) {
        this.make = make;
        this.model = model;
        this.numOfWheels = numOfWheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numOfWheels=" + numOfWheels +
                '}';
    }
}
