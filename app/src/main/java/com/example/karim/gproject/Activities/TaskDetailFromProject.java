package com.example.karim.gproject.Activities;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.karim.gproject.R;

public class TaskDetailFromProject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail_from_project);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().setTitle("Add Project");
    }
    public void gotoComments(View view) {
        Toast.makeText(this, "it is ok", Toast.LENGTH_LONG).show();
        startActivity(new Intent(this, Comments.class));
    }
}