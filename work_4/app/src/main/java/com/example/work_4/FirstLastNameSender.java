package com.example.work_4;

import java.io.Serializable;

public class FirstLastNameSender implements Serializable {
    String first_name, last_name;

    public FirstLastNameSender(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }
}
