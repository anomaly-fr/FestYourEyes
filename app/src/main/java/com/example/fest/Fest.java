package com.example.fest;

public class Fest {
    private String title,by;
    private String content1;
    private String content2;
    private int image;

    Fest(){}

    public Fest(String title, String content1, String content2, int image, String by) {
        this.title = title;
        this.content1 = content1;
        this.content2 = content2;
        this.image = image;
        this.by=by;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1;
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
