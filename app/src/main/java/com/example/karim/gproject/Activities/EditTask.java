package com.example.karim.gproject.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.karim.gproject.R;

public class EditTask extends AppCompatActivity {
    private android.support.design.widget.FloatingActionButton btnFloat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_task);
        getSupportActionBar().setTitle("Edit Task");
        btnFloat = (android.support.design.widget.FloatingActionButton) findViewById(R.id.add_task_in_project);
        btnFloat.setClickable(false);
        btnFloat.setVisibility(View.INVISIBLE);
    }

}
