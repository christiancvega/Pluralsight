package com.ps;

import java.util.Scanner;

public class Main {

    static Scanner commandScanner = new Scanner(System.in);

    public static void main(String[] args) {

        int mainCommand;

        do {
            System.out.println("please select an option: ");
            System.out.println("1) option 1");
            System.out.println("2) option 2(nested)");
            System.out.println("0) Exit");

            System.out.println("Command: ");
            mainCommand = commandScanner.nextInt();

            switch(mainCommand) {
                case 1:
                    handleOption1();
                    break;
                case 2:
                    handleOption2();
                    break;
                case 0:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Command not found. Try Again.");
            }
        }
        while (mainCommand != 0);

    }
    public static void handleOption1() {
        System.out.println("You picked option 1");
    }
    public static void handleOption2() {
        int option2Command;

        do{
            System.out.println("Please select asn option from option 2");
            System.out.println("1) option2 >> NestedOption1");
            System.out.println("2) option2 >> NestedOption2(Nested)");
            System.out.println("0) Exit");

            System.out.println("Option2 >> Command: ");
            option2Command = commandScanner.nextInt();

            switch(option2Command){
                case 1: handleNestedOption1();
                    break;
                case 2:
                    handleNestedOption2();
                    break;
                case 0:
                    System.out.println("Going back...");
                default:
                    System.out.println("nested command not found, try again");
            }
        }while(option2Command != 0);
        

        }
        public static void handleNestedOption1() {
            System.out.println("You picked nested option 1");
        }
        public static void handleNestedOption2() {
            System.out.println("You picked nested option 2");
    }
}
