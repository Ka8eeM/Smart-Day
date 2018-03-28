package com.example.karim.gproject.Activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.karim.gproject.Adapters.InflateTaskAdapter;
import com.example.karim.gproject.Models.TaskToView;
import com.example.karim.gproject.R;

import java.util.ArrayList;

public class TasksInProject extends AppCompatActivity {
    ArrayList<TaskToView> taskToViews;
    FloatingActionButton actionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks_in_project);
        getSupportActionBar().setTitle("All tasks in Project");
        taskToViews = new ArrayList<>();
        actionButton = findViewById(R.id.fb_add_task_in_project);
        ListView listView = findViewById(R.id.root_view_for_task_in_project);
        Drawable myDrawable = getResources().getDrawable(R.drawable.close_);
        Bitmap myLogo = ((BitmapDrawable) myDrawable).getBitmap();
        taskToViews.add(new TaskToView("task1"));
        taskToViews.add(new TaskToView("task2"));
        taskToViews.add(new TaskToView("task3"));
        taskToViews.add(new TaskToView("task4"));
        taskToViews.add(new TaskToView("task5"));
        taskToViews.add(new TaskToView("task6"));
        taskToViews.add(new TaskToView("task7"));
        taskToViews.add(new TaskToView("task8"));
        taskToViews.add(new TaskToView("task9"));
        taskToViews.add(new TaskToView("task10"));
        taskToViews.add(new TaskToView("task11"));
        taskToViews.add(new TaskToView("task12"));
        InflateTaskAdapter taskAdapter = new InflateTaskAdapter(this, 0, taskToViews);
        listView.setAdapter(taskAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(TasksInProject.this, TaskDetailFromProject.class));
            }
        });
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TasksInProject.this, AddTask.class));
            }
        });
    }
}