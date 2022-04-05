package com.bridgelabz;

public class Regexes {
    private static Regexes instance = null;
    String validateFirstName = "^[A-Z]\\w{2,12}$";
    String validateEmail = "\\A[a-z0-9!#$%&'*+/=?^_‘{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_‘{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z](?:[a-z0-9-]*[a-z0-9])$";
    String validatePhone = "^(\\+\\d{1,3}[- ]?)?\\d{10}$ ";   //  ^(\+\d{1,3}[- ]?)?\d{10}$
    String validatePassword;
    String validateLastName = "^[A-Z]\\w{2,11}$";

//(?:(?=[a-z0-9-]{1,63}\.)[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+(?=[a-z0-9-]{1,63}\z)[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\z
    private Regexes(){}

    public static Regexes getInstance(){
        if (instance == null) {
            instance = new Regexes();
        }
        return instance;
    }
}
