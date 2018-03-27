package com.example.karim.gproject.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.karim.gproject.Models.ProjectModel;
import com.example.karim.gproject.Models.Task;
import com.example.karim.gproject.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KARIM on 3/16/2018.
 */

public class ProjectAdapter extends ArrayAdapter<ProjectModel> {
    public ProjectAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ProjectModel> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parrent) {
        View listProjects = convertView;
        if (listProjects == null) {
            listProjects = LayoutInflater.from(getContext()).inflate(R.layout.project_item, parrent, false);
            ProjectModel projectModel = getItem(position);
            TextView tv = listProjects.findViewById(R.id.project_name);
            tv.setText(projectModel.getProjectName());
            tv = listProjects.findViewById(R.id.timer_left_for_project);
            tv.setText(projectModel.getEndDate());
        }
        return listProjects;
    }
}
