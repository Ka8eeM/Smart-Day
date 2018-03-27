package com.example.karim.gproject.Models;

import android.graphics.Bitmap;

/**
 * Created by KARIM on 3/20/2018.
 */

public class UserToView {
    private String userName;
    private Bitmap bitmap, bitmap1;

    public UserToView(String userName, Bitmap bitmap, Bitmap bitmap1) {
        this.userName = userName;
        this.bitmap = bitmap;
        this.bitmap1 = bitmap1;
    }

    public String getUserName() {
        return this.userName;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public Bitmap getBitmap1() {
        return this.bitmap1;
    }
}
