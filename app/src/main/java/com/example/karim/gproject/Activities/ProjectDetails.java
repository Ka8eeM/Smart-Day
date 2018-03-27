package com.example.karim.gproject.Activities;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.karim.gproject.R;

public class ProjectDetails extends AppCompatActivity {
    private Dialog dialog;
    private Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prject_details);
        getSupportActionBar().setTitle("Project Details");
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        dialog = new Dialog(this);

    }

    public void click(View view) {
        if (view.getId() == R.id.view_desc) {
            viewDesc();
        } else if (view.getId() == R.id.view_tasks) {
            startActivity(new Intent(this, TasksInProject.class));
        } else {
            Toast.makeText(this, "This users  activity", Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, UsersInProject.class));
        }
    }

    private void viewDesc() {
        dialog.setContentView(R.layout.dialog_view_desc);
        cancel = (Button) dialog.findViewById(R.id.cancel_view_desc);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "It canceled", Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    public void goToEditProject(View view) {
        startActivity(new Intent(this, EditProject.class));
    }
}
