package com.example.rmp5;

import java.io.Serializable;

public class MicroClass implements Serializable {
    String name;
    int image;

    public MicroClass(String name, int image){
        this.name = name;
        this.image = image;
    }
}
