package com.dometic.Apollo.stepdefinition;

public class MyException extends Exception{

    @Override
    public String getMessage(){
        String message="Because of the time delay of GUI Test script got failed";
        return message;
    }
}
