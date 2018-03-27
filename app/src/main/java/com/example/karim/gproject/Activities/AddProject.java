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

public class AddProject extends AppCompatActivity {

    private Dialog dialog;
    private Button done, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_project);
        getSupportActionBar().setTitle("Add Project");
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        dialog = new Dialog(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.add_desc_for_project) {
            addDescForProject();
        } else if (view.getId() == R.id.add_task_for_project) {
            addTaskToProject();
        } else if (view.getId() == R.id.add_user_for_project) {
            addUserForProject();
        } else if (view.getId() == R.id.assign_task_for_project) {
            assignTask();
        } else if (view.getId() == R.id.save_for_project) {
            Toast.makeText(getBaseContext(), "It is ok it works now", Toast.LENGTH_LONG).show();

        } else if (view.getId() == R.id.cancel_for_project) {
            Toast.makeText(getBaseContext(), "It canceled", Toast.LENGTH_LONG).show();
        }
    }

    private void addDescForProject() {

        dialog.setContentView(R.layout.dialog_for_add_description_in_project);
        done = (Button) dialog.findViewById(R.id.done_add_desc);
        cancel = (Button) dialog.findViewById(R.id.cancel_ad_desc);
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

    private void addTaskToProject() {
        Intent intent = new Intent(this, AddTaskFromProject.class);
        startActivity(intent);
    }

    private void assignTask() {
        dialog.setContentView(R.layout.dialog_assign_task_in_project);
        done = (Button) dialog.findViewById(R.id.done_assign_task);
        cancel = (Button) dialog.findViewById(R.id.cancel_cancel_assign_task);
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
