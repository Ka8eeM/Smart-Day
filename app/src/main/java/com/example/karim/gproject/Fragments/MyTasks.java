package com.example.karim.gproject.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.karim.gproject.Activities.AddTask;
import com.example.karim.gproject.Activities.HomeTasks;
import com.example.karim.gproject.Activities.TaskDetails;
import com.example.karim.gproject.Adapters.TaskAdapter;
import com.example.karim.gproject.Models.Task;
import com.example.karim.gproject.R;

import java.util.ArrayList;

public class MyTasks extends Fragment {
    private ArrayList<Task> tasks;
    private FloatingActionButton fab;
    public MyTasks() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((HomeTasks) getActivity()).setActionBarTitle("My Tasks");
        View view = inflater.inflate(R.layout.tasks_list, container, false);
        fab = (FloatingActionButton) view.findViewById(R.id.add_new_task_to_mytasks);
        ListView listView = (ListView) view.findViewById(R.id.root_view);
        tasks = new ArrayList<>();
        tasks.add(new Task("Task1", "asd1", "02:05:20:06"));
        tasks.add(new Task("Task2", "asd2", "02:05:20:06"));
        tasks.add(new Task("Task3", "asd3", "02:05:20:06"));
        tasks.add(new Task("Task4", "asd4", "02:05:20:06"));
        tasks.add(new Task("Task5", "asd5", "02:05:20:06"));
        tasks.add(new Task("Task6", "asd6", "02:05:20:06"));
        tasks.add(new Task("Task7", "asd7", "02:05:20:06"));
        tasks.add(new Task("Task8", "asd8", "02:05:20:06"));
        tasks.add(new Task("Task9", "asd9", "02:05:20:06"));
        tasks.add(new Task("Task10", "asd10", "02:05:20:06"));
        tasks.add(new Task("Task11", "asd11", "02:05:20:06"));
        tasks.add(new Task("Task12", "asd12", "02:05:20:06"));
        tasks.add(new Task("Task13", "asd13", "02:05:20:06"));
        tasks.add(new Task("Task14", "asd14", "02:05:20:06"));
        tasks.add(new Task("Task15", "asd15", "02:05:20:06"));
        TaskAdapter tasksAdapter = new TaskAdapter(getContext(), 0, tasks);
        listView.setAdapter(tasksAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getContext(), TaskDetails.class));
            }
        });
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), AddTask.class));
            }
        });
        return view;
    }
}
