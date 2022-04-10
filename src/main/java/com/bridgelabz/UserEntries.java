package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface ValidateUserEntry {
    boolean validate(String userInput);
}

public class UserEntries {

    public boolean validateLambda(String pattern, String entry) {
        ValidateUserEntry isValid = userInput -> Pattern.compile(pattern).matcher(userInput).matches();
        return isValid.validate(entry);
    }


    boolean verifyFirstName(String entry) throws InvalidEntryExceptions{
        Regexes regex = Regexes.getInstance();
        if(!validateLambda(regex.validateFirstName,entry)){
            throw new InvalidEntryExceptions(InvalidEntryExceptions.ExceptionType.INVALID_NAME,"Invalid Name");
        }
        else {
            return true;
        }
    }

    boolean verifyLastName(String entry) throws InvalidEntryExceptions{
        Validate validate = new Validate();
        if(!validate.isValidLastName(entry)){
            throw new InvalidEntryExceptions(InvalidEntryExceptions.ExceptionType.INVALID_NAME,"Invalid Name");
        }
        else {
            return validate.isValidLastName(entry);
        }
    }

    boolean verifyMobile(String entry) throws InvalidEntryExceptions{
        Validate validate = new Validate();
        if(!validate.isValidPhone(entry)){
            throw new InvalidEntryExceptions(InvalidEntryExceptions.ExceptionType.INVALID_MOBILE,"Invalid Phone");
        }
        else {
            return validate.isValidPhone(entry);
        }
    }

    boolean verifyEMail(String entry) throws InvalidEntryExceptions{
        Validate validate = new Validate();
        if(!validate.isValidEmail(entry)){
            throw new InvalidEntryExceptions(InvalidEntryExceptions.ExceptionType.INVALID_EMAIL,"Invalid E-Mail");
        }
        else {
            return validate.isValidEmail(entry);
        }
    }

    boolean verifyPassword(String entry) throws InvalidEntryExceptions{
        Validate validate = new Validate();
        if(validate.isValidPassword(entry)){
            return validate.isValidPassword(entry);
        }
        else {
            throw new InvalidEntryExceptions(InvalidEntryExceptions.ExceptionType.INVALID_PASSWORD,"Invalid Password");
        }
    }
}
