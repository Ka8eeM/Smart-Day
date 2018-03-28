package com.example.karim.gproject.Activities;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.karim.gproject.Fragments.MessageDialog;
import com.example.karim.gproject.R;

public class AddTask extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        getSupportActionBar().setTitle("Add Task");
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void ConfirmAddTask(View view) {
        if (view.getId() == R.id.save_add_task_in_project) {
            showAlertDialog();
        } else if (view.getId() == R.id.cancel_add_task_in_project) {
            showAlertDialog();
        }
    }
    private void showAlertDialog() {
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.show(manager, "Message");
    }
}
