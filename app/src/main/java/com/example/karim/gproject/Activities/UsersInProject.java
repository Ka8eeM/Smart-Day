package com.example.karim.gproject.Activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.karim.gproject.Adapters.InflateUserAdapter;
import com.example.karim.gproject.Models.UserToView;
import com.example.karim.gproject.R;

import java.util.ArrayList;

public class UsersInProject extends AppCompatActivity {

    ArrayList<UserToView> usersInProjects;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_in_project);
        getSupportActionBar().setTitle("All users in Project");
        listView = (ListView) findViewById(R.id.root_view_for_user_in_project);
        usersInProjects = new ArrayList<>();
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
        InflateUserAdapter userAdapter = new InflateUserAdapter(this, 0, usersInProjects);
        listView.setAdapter(userAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(UsersInProject.this, TaskDetails.class));
            }
        });
    }
}