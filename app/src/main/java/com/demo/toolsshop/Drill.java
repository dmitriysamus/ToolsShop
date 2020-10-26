package com.demo.toolsshop;

import androidx.annotation.NonNull;

public class Drill {

    private String title;
    private String info;
    private int imageResourseID;

    public Drill(String title, String info, int imageResourseID) {
        this.title = title;
        this.info = info;
        this.imageResourseID = imageResourseID;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResourseID() {
        return imageResourseID;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
