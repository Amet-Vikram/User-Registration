package com.bridgelabz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validate validator = new Validate();

        System.out.println("Enter Last Name: ");
        String name = scan.nextLine();

        if(validator.isValidLastName(name)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
