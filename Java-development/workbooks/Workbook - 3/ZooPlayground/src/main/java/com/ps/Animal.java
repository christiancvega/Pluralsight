package com.ps;

public class Animal {

    private String name;
    private String type;
    private int age;
    private String origin;
    private boolean isPubliclyAvailable;

    public Animal(String name, String type, int age, String origin, boolean isPubliclyAvailable){
        this.name = name;
        this.type = type;
        this.age = age;
        this.origin = origin;
        this.isPubliclyAvailable = isPubliclyAvailable;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPubliclyAvailable() {
        return isPubliclyAvailable;
    }

    public void setPubliclyAvailable(boolean publiclyAvailable) {
        isPubliclyAvailable = publiclyAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", origin='" + origin + '\'' +
                ", isPubliclyAvailable=" + isPubliclyAvailable +
                '}';
    }
}





