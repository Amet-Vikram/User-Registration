package com.bridgelabz;

import java.util.regex.*;

public class Validate {
    static Regexes regex = Regexes.getInstance();

    public boolean isValidFirstName(String str){
        Pattern p = Pattern.compile(regex.validateFirstName);
        if (str == null) {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public boolean isValidLastName(String str){
        Pattern p = Pattern.compile(regex.validateLastName);
        if (str == null) {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public boolean isValidEmail(String str){
        Pattern p = Pattern.compile(regex.validateEmail);
        if (str == null) {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public boolean isValidPhone(String str){
        Pattern p = Pattern.compile(regex.validatePhone);
        if (str == null) {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }

}
