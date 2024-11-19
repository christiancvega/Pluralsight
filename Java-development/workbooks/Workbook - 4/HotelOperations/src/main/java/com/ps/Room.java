package com.ps;

public class Room {
    private int numberOFBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room (int numberOfBeds,
                 double price,
                 boolean isOccupied,
                 boolean isDirty) {
        this.numberOFBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public int getNumberOFBeds() {
        return numberOFBeds;
    }

    public void setNumberOFBeds(int numberOFBeds) {
        this.numberOFBeds = numberOFBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
