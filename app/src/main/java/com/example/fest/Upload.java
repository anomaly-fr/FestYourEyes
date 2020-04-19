package com.example.fest;

public class Upload {
    private String imageURL;

    public Upload(){}

    public Upload(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
