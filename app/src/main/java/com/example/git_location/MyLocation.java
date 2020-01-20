package com.example.git_location;

public class MyLocation {

    String longitude;
    String latitude;
    String date;
    String time;

    public MyLocation() {
    }

    public MyLocation(String longitude, String latitude, String date, String time) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.date = date;
        this.time = time;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
