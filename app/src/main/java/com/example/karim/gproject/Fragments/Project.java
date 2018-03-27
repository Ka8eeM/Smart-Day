package com.example.karim.gproject.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.karim.gproject.Activities.AddProject;
import com.example.karim.gproject.Activities.HomeTasks;
import com.example.karim.gproject.Activities.ProjectDetails;
import com.example.karim.gproject.Adapters.ProjectAdapter;
import com.example.karim.gproject.Models.ProjectModel;
import com.example.karim.gproject.R;

import java.util.ArrayList;

public class Project extends Fragment {
    private ArrayList<ProjectModel> projectModels;
    private FloatingActionButton fab;

    public Project() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((HomeTasks) getActivity()).setActionBarTitle("Projects");
        View view = inflater.inflate(R.layout.projects_list, container, false);
        fab = (FloatingActionButton) view.findViewById(R.id.add_project_to_myproject);
        ListView listView = (ListView) view.findViewById(R.id.root_view_project);
        projectModels = new ArrayList<>();
        projectModels.add(new ProjectModel("project1", "02:05:20:06"));
        projectModels.add(new ProjectModel("project2", "02:05:20:06"));
        projectModels.add(new ProjectModel("project3", "02:05:20:06"));
        projectModels.add(new ProjectModel("project4", "02:05:20:06"));
        projectModels.add(new ProjectModel("project5", "02:05:20:06"));
        projectModels.add(new ProjectModel("project6", "02:05:20:06"));
        projectModels.add(new ProjectModel("project7", "02:05:20:06"));
        projectModels.add(new ProjectModel("project8", "02:05:20:06"));
        projectModels.add(new ProjectModel("project9", "02:05:20:06"));
        projectModels.add(new ProjectModel("project10", "02:05:20:06"));
        projectModels.add(new ProjectModel("project11", "02:05:20:06"));
        projectModels.add(new ProjectModel("project12", "02:05:20:06"));
        projectModels.add(new ProjectModel("project13", "02:05:20:06"));
        projectModels.add(new ProjectModel("project14", "02:05:20:06"));
        projectModels.add(new ProjectModel("project15", "02:05:20:06"));
        ProjectAdapter tasksAdapter = new ProjectAdapter(getContext(), 0, projectModels);
        listView.setAdapter(tasksAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getContext(), ProjectDetails.class));
            }
        });

        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), AddProject.class));
            }
        });
        return view;
    }

}
