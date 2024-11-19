package com.ps;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(double payRate, String name, double hoursWorked, int employeeID, String department) {
        this.payRate = payRate;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.employeeID = employeeID;
        this.department = department;

    }
    
}
