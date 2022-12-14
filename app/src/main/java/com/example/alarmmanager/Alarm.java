package com.example.alarmmanager;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Alarm implements Serializable {

    private int id;
    private int hour;
    private int minute;
    private boolean status;
    private String name;

    public Alarm(int hour, int minute, boolean status, String name) {

        this.hour = hour;
        this.minute = minute;
        this.status = status;
        this.name = name;
    }

    public Alarm() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public boolean getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }





    @NonNull
    @Override
    public String toString(){

        String hourString, minuteString, format;

        if (hour>12){
            hourString = (hour - 12) + "";
            format = " PM";

        }else if (hour == 0){
         hourString = "12";
         format = " AM";
        }else if (hour == 12) {
            hourString = "12";
            format = " pM";
        }else {
            hourString = hour + "";
            format = " AM";
        }

        if (minute < 10){
            minuteString = "0" + minute;

        }else {
            minuteString = ""+minute;
        }



    return hourString+":"+minuteString +format;
    }


}
