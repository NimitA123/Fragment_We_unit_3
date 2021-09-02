package com.example.fragment_lyold_unit3;

import android.widget.ImageView;
import android.widget.TextView;

public class AnimalModel {
    private int imageView;
    private String tv;

    public AnimalModel(int imageView, String tv) {
        this.imageView = imageView;
        this.tv = tv;
    }

    public int getImageView() {
        return imageView;
    }

    public String getTv() {
        return tv;
    }
}
