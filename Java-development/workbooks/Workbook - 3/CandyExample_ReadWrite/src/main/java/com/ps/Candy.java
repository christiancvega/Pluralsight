package com.ps;

public class Candy {
    // write the properties as private
    private String name;
    private float price;
    private String flavor;
    private short quantity;

    // generate constructor
    public Candy(String name, float price, String flavor, short quantity) {
        this.name = name;
        this.price = price;
        this.flavor = flavor;
        this.quantity = quantity;
    }
    // generate getters and setters
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }
    // generate to string
    @Override
    public String toString() {
        return "Candy{" +
                "flavor='" + flavor + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }




}

