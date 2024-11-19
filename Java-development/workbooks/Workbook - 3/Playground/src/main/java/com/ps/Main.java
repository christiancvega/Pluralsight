package com.ps;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        // Steps to import a file:

            // Create file to import (Done Student.txt)


            try{
                // Create instance of buffered reader(with instance FileReader)
            BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"));
// Create variable to store the first line
            String header = bufferedReader.readLine();
                System.out.println(header);

            String input;
// Iterate through each line of the file (while)
            while((input = bufferedReader.readLine())!= null) {
                System.out.println(input);
            }    // do stuff

                // Close the BufferedReader instance
                bufferedReader.close();
            } catch(Exception e){
                e.printStackTrace();
            }

        System.out.println("End of code");










    }
}