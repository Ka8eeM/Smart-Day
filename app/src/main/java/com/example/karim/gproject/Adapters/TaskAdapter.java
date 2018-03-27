package com.example.karim.gproject.Adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.karim.gproject.Fragments.MyTasks;
import com.example.karim.gproject.Models.Task;
import com.example.karim.gproject.R;

import java.util.ArrayList;

/**
 * Created by KARIM on 3/11/2018.
 */

public class TaskAdapter extends ArrayAdapter<Task> {
    public TaskAdapter(@NonNull Context context, int resource, ArrayList<Task> tasks) {
        super(context, 0, tasks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parrent) {
        View listTasks = convertView;
        if (listTasks == null) {
            listTasks = LayoutInflater.from(getContext()).inflate(R.layout.task_item, parrent, false);
            Task task = getItem(position);
            TextView tv = listTasks.findViewById(R.id.task_name);
            tv.setText(task.getTaskName());
            tv = listTasks.findViewById(R.id.tv_name_owner);
            tv.setText(task.getOwnerName());
            tv = listTasks.findViewById(R.id.timer_left);
            tv.setText(task.getLeftTime());
            ImageView iv = listTasks.findViewById(R.id.image_task_name);
            iv.setImageResource(R.drawable.profile_photo);
        }
        return listTasks;
    }
}
