package com.ps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    CellPhone myPhone = new CellPhone();
    Scanner scanner = new Scanner(System.in);

        System.out.println("What is the Serial Number? ");
        int serialNumber = scanner.nextInt();
        myPhone.setSerialNumber(serialNumber);
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        myPhone.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        myPhone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        myPhone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        myPhone.setOwner(owner);

        System.out.println("\nHere are the details of the phone:");
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());
    }
}
