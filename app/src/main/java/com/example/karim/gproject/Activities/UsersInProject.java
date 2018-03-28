package com.example.karim.gproject.Activities;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.karim.gproject.Adapters.InflateUserAdapter;
import com.example.karim.gproject.Models.UserToView;
import com.example.karim.gproject.R;

import java.util.ArrayList;

public class UsersInProject extends AppCompatActivity {

    ArrayList<UserToView> usersInProjects;
    private RecyclerView listView;
    FloatingActionButton actionButton;
    Dialog dialog;
    Button done,cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_in_project);
        getSupportActionBar().setTitle("All users in Project");
        listView = (RecyclerView) findViewById(R.id.root_view_for_user_in_project);
        usersInProjects = new ArrayList<>();
        dialog = new Dialog(this);
        actionButton = findViewById(R.id.fb_add_user_in_project);
        Drawable myDrawable = getResources().getDrawable(R.drawable.profile_photo);
        Bitmap myLogo = ((BitmapDrawable) myDrawable).getBitmap();
        myDrawable = getResources().getDrawable(R.drawable.close_);
        Bitmap bitmap = ((BitmapDrawable) myDrawable).getBitmap();
        usersInProjects.add(new UserToView("user 1", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 2", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 3", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 4", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 5", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 6", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 7", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 8", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 9", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 10", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 11", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 12", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 13", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 14", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 15", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 16", myLogo, bitmap));
        usersInProjects.add(new UserToView("user 17", myLogo, bitmap));
        InflateUserAdapter userAdapter = new InflateUserAdapter(this, usersInProjects);
        listView.setAdapter(userAdapter);
        listView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUserForProject();
            }
        });
    }

    private void addUserForProject() {

        dialog.setContentView(R.layout.dialog_add_user_in_project);
        done = (Button) dialog.findViewById(R.id.done_add_user);
        cancel = (Button) dialog.findViewById(R.id.cancel_add_user);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "It is ok it works now", Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "It canceled", Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}