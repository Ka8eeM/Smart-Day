package com.example.karim.gproject.Models;

import android.graphics.Bitmap;
import android.widget.Button;

/**
 * Created by KARIM on 3/21/2018.
 */

public class TaskToView {
    private Button btn;
    private Bitmap bitmap;
    public TaskToView(Button btn)
    {
        this.btn=btn;
    }
    public TaskToView(Button btn, Bitmap bitmap) {
        this.btn = btn;
        this.bitmap = bitmap;
    }
    public Button getBtn()
    {
        return this.btn;
    }
    public Bitmap getBitmap()
    {
        return this.bitmap;
    }
}
