package com.example.rmp5;

import java.io.Serializable;
import java.util.ArrayList;

public class MegaClass implements Serializable {
    String name;
    int type, image;
    ArrayList<MicroClass> podClass;

    public MegaClass(String name, ArrayList<MicroClass> microClasses, int type, int image){
        this.name = name;
        podClass = microClasses;
        this.type = type;
        this.image = image;
    }
}
