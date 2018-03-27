package com.example.karim.gproject.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.karim.gproject.R;

public class MainActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {

        intent = new Intent(this, HomeTasks.class);
        startActivity(intent);
    }

    public void createNewProject(View view) {
        intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}