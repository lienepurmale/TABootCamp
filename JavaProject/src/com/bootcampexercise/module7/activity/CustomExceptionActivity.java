package com.bootcampexercise.module7.activity;

public class CustomExceptionActivity extends Exception{
    public String getMessage(){
        return "You are not allowed to use the program";
    }
}
