package com.example.karim.gproject.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.karim.gproject.R;

public class LogIn extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void logWithFacebook(View view) {
        intent = new Intent(this, TaskToday.class);
        startActivity(intent);
    }

    public void logWithAccount(View view) {

    }

    public void logWithGoogle(View view) {

    }
}
