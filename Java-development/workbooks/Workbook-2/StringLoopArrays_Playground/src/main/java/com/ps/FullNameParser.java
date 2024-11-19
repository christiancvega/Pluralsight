package com.ps;
import java.util.Scanner;

public class FullNameParser {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is your name: ");
        String fullName = scanner.nextLine();

        String[] names = fullName.split(" ");
        int numberOfName = names.length;

        System.out.println("First name: " + names[0]);

        if (numberOfName == 2) {
            System.out.println("Middle Name: (none)");
            System.out.println("Last name: " + names[1]);
        } else {
            System.out.println("Middle name: " + names[1]);
            System.out.println("Last name: " + names[2]);


        }

    }
}
