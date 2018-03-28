package com.example.karim.gproject.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.karim.gproject.Fragments.MessageDialog;
import com.example.karim.gproject.R;

public class EditTask extends AppCompatActivity {
    private android.support.design.widget.FloatingActionButton btnFloat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_task);
        getSupportActionBar().setTitle("Edit Task");
        btnFloat = (android.support.design.widget.FloatingActionButton) findViewById(R.id.fb_add_task_in_project);
        btnFloat.setClickable(false);
        btnFloat.setVisibility(View.INVISIBLE);
    }

    public void makeActionOnTask(View view) {
        if (R.id.save_edit_task == view.getId()) {
            showAlertDialog();
        } else if (view.getId() == R.id.cancel_edit_task) {
            showAlertDialog();
        } else if (view.getId() == R.id.delete_edit_task) {
            showAlertDialog();
        }
    }

    private void showAlertDialog() {
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.show(manager, "Message");
    }
}

