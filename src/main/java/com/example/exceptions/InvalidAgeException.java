package com.example.exceptions;

public class InvalidAgeException extends Exception{

    private static final String INVALID_AGE_EXCEPTION_MESSAGE = "You must be over 18 to register!";
    public InvalidAgeException(){
        super(INVALID_AGE_EXCEPTION_MESSAGE);
    }
}
