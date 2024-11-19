package com.ps;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfnights;
    private boolean isWeekend;


    public Reservation(boolean isWeekend, int numberOfnights, double price, String roomType) {
        this.isWeekend = isWeekend;
        this.numberOfnights = numberOfnights;
        this.price = price;
        this.roomType = roomType;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public int getNumberOfnights() {
        return numberOfnights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice() {
        return price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getReservationTotal() {
        return price * numberOfnights;
    }
}
