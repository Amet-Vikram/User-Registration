package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static String[] formArray(){
        String inValidEMail = "abc, abc@.com.my, abc123@gmail.a, abc123@.com, abc123@.com.com, .abc@abc.com, abc()*@gmail.com, abc@%*.com, abc..2002@gmail.com, abc.@gmail.com, abc@abc@gmail.com, abc@gmail.com.1a";
        return inValidEMail.split(", ");
    }

    static String[] formValidArray(){
        String validEmail = "abc@yahoo.com, abc-100@yahoo.com, abc.100@yahoo.com, abc111@abc.com, abc-100@abc.net, abc.100@abc.com.au, abc@1.com, abc@gmail.com.com, abc+100@gmail.com";
        return validEmail.split(", ");
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        Validate validator = new Validate();

        String[] invalidID = formArray();
        String[] validID = formValidArray();


        System.out.println("Invalid but passed: ");
        for(String id: invalidID){
            if(validator.isValidEmail(id)){
                System.out.println(id);
            }
        }

        System.out.println("Valid but did not pass: ");
        for(String id: validID){
            if(!validator.isValidEmail(id)){
                System.out.println(id);
            }
        }
    }
}
