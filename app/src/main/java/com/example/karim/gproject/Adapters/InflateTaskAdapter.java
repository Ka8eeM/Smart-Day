package com.example.karim.gproject.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;

import com.example.karim.gproject.Models.TaskToView;
import com.example.karim.gproject.R;

import java.util.ArrayList;

/**
 * Created by KARIM on 3/21/2018.
 */

public class InflateTaskAdapter extends ArrayAdapter<TaskToView> {
    public InflateTaskAdapter(@NonNull Context context, int resource, @NonNull ArrayList<TaskToView> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parrent) {
        View listProjects = convertView;
        if (listProjects == null) {
            listProjects = LayoutInflater.from(getContext()).inflate(R.layout.task_view_item, parrent, false);
            TaskToView taskToView = getItem(position);
            Button btn = listProjects.findViewById(R.id.button_view_task);
        }
        return listProjects;
    }
}
