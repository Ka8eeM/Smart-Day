package com.example.karim.gproject.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.karim.gproject.Models.UserToView;
import com.example.karim.gproject.R;

import java.util.ArrayList;

/**
 * Created by KARIM on 3/20/2018.
 */

public class InflateUserAdapter extends ArrayAdapter<UserToView> {
    public InflateUserAdapter(@NonNull Context context, int resource, @NonNull ArrayList<UserToView> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parrent) {
        View listProjects = convertView;
        if (listProjects == null) {
            listProjects = LayoutInflater.from(getContext()).inflate(R.layout.user_item, parrent, false);
            UserToView userToView = getItem(position);
            TextView tv = listProjects.findViewById(R.id.user_name_in_project);
            tv.setText(userToView.getUserName());
            ImageView imv = listProjects.findViewById(R.id.user_photo_in_project);
            imv.setImageBitmap(userToView.getBitmap());
            imv = listProjects.findViewById(R.id.remove);
            imv.setImageBitmap(userToView.getBitmap1());
        }
        return listProjects;
    }
}
