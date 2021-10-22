package com.example.toolsshop;

import androidx.annotation.NonNull;

public class Drill {

    private String title;
    private String info;
    private int imageResourseId;

    public Drill(String title, String info, int imageResourseId) {
        this.title = title;
        this.info = info;
        this.imageResourseId = imageResourseId;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResourseId() {
        return imageResourseId;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
