package com.example.karim.gproject.Models;

import android.graphics.Bitmap;

/**
 * Created by KARIM on 3/11/2018.
 */

public class Task {
    private String taskName;
    private String ownerName;
    private String leftTime;
    private Bitmap image;

    public Task() {

    }

    public Task(String tn, String on, String lt) {
        this.taskName = tn;
        this.ownerName = on;
        this.leftTime = lt;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getLeftTime() {
        return this.leftTime;
    }

    public Bitmap getImage() {
        return this.image;
    }
}
