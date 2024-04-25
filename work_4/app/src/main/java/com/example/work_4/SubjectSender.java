package com.example.work_4;

import java.io.Serializable;

public class SubjectSender implements Serializable{
    String day, time, comment;

    public SubjectSender(String day, String time, String comment) {
        this.day = day;
        this.time = time;
        this.comment = comment;
    }
}
