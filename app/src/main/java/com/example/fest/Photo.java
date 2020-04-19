package com.example.fest;

public class Photo {
    private int picture;
    private int number;

    public Photo(int picture, int number) {
        this.picture = picture;
        this.number = number;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
