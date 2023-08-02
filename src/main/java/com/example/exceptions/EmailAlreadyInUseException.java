package com.example.exceptions;

public class EmailAlreadyInUseException extends Exception{

    private static final String EMAIL_ALREADY_IN_USE_EXCEPTION = "This email is already signed up in our system! Try to log in.";

    public EmailAlreadyInUseException(){
        super(EMAIL_ALREADY_IN_USE_EXCEPTION);
    }
}
