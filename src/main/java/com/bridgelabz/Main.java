package com.bridgelabz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validate validator = new Validate();

        System.out.print("Enter Phone Number: ");
        String number = scan.nextLine();

        if(validator.isValidPhone(number)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
