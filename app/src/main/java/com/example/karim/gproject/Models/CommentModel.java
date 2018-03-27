package com.example.karim.gproject.Models;

import android.graphics.Bitmap;

/**
 * Created by KARIM on 3/26/2018.
 */

public class CommentModel {
    private Bitmap photo;
    private String message;
    private String name;
    private String timeDate;

    public CommentModel(String name, String message, String timeDate, Bitmap photo) {
        this.name = name;
        this.message = message;
        this.timeDate = timeDate;
        this.photo = photo;
    }

    public String getName() {
        return this.name;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTimeDate() {
        return this.timeDate;
    }

    public Bitmap getPhoto() {
        return this.photo;
    }
}