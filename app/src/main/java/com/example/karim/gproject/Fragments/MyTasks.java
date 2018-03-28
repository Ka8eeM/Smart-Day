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
        tasks.add(new Task("task1", "Mohamed Emad", "02:05:20:06"));
        tasks.add(new Task("task2", "Mohamed Emad", "02:05:20:06"));
        tasks.add(new Task("task3", "Mohamed Emad", "02:05:20:06"));
        tasks.add(new Task("task4", "Mohamed Emad", "02:05:20:06"));
        tasks.add(new Task("task5", "Mohamed Emad", "02:05:20:06"));
        tasks.add(new Task("task6", "Mohamed Emad", "02:05:20:06"));
        tasks.add(new Task("task7", "Mohamed Emad", "02:05:20:06"));
        tasks.add(new Task("task8", "Mohamed Emad", "02:05:20:06"));
        tasks.add(new Task("task9", "Mohamed Emad", "02:05:20:06"));
        tasks.add(new Task("task10", "Mohamed Emad", "02:05:20:06"));
        tasks.add(new Task("task11", "Mohamed Emad", "02:05:20:06"));
        tasks.add(new Task("task12", "Mohamed Emad", "02:05:20:06"));
        tasks.add(new Task("task13", "Mohamed Emad", "02:05:20:06"));
        tasks.add(new Task("task14", "Mohamed Emad", "02:05:20:06"));
        tasks.add(new Task("task15", "Mohamed Emad", "02:05:20:06"));
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
