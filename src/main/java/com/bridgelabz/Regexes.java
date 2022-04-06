package com.bridgelabz;

public class Regexes {
    private static Regexes instance = null;
    String validateFirstName = "^[A-Z]\\w{2,12}$";
    String validateEmail = "^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$";
    String validatePhone = "^(91)\\s\\d{10}";
    String validatePassword = "([A-Z0-9]){8}";
    String validateLastName = "^[A-Z]\\w{2,11}$";
    private Regexes(){}

    public static Regexes getInstance(){
        if (instance == null) {
            instance = new Regexes();
        }
        return instance;
    }
}
