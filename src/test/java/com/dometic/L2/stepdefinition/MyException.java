package com.dometic.L2.stepdefinition;

public class MyException extends Exception{

    @Override
    public String getMessage(){
        String message="Because of the time delay of GUI Test script got failed";
        return message;
    }
}
