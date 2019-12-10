package com.restservice.springboot.restapp;

public class FancyWriter implements TextWriter {

    public String WriteText(String s){
        return s + " fancy Text";
    }
}
