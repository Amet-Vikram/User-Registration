package com.bridgelabz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validate validator = new Validate();

        System.out.print("Enter Password: ");
        String password = scan.nextLine();

        if(validator.isValidPassword(password)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
