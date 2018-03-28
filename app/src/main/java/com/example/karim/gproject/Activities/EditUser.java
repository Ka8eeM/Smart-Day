package com.example.karim.gproject.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.karim.gproject.R;

public class EditUser extends AppCompatActivity {

    private android.support.design.widget.FloatingActionButton btnFloat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_in_project);
        btnFloat = (android.support.design.widget.FloatingActionButton) findViewById(R.id.fb_add_user_in_project);
        btnFloat.setClickable(true);
        btnFloat.setVisibility(View.VISIBLE);
    }
}
