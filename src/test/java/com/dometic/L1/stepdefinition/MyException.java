package com.dometic.L1.stepdefinition;

public class MyException extends Exception{

    @Override
    public String getMessage(){
        String message="Because of the time delay";
        return message;
    }
}
