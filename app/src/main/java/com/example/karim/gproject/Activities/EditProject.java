package com.example.karim.gproject.Activities;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.karim.gproject.Interfaces.PassDataBetweenDialogAndActivities;
import com.example.karim.gproject.R;

public class EditProject extends AppCompatActivity implements PassDataBetweenDialogAndActivities {

    private Dialog dialog;
    private EditText editText;
    private Button done, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_project);
        getSupportActionBar().setTitle("Edit Project");
        dialog = new Dialog(this);
    }

    public void onClickInsideEditProject(View view) {
        if (view.getId() == R.id.edit_desc) {
            openDialogForEditDes();
        } else if (view.getId() == R.id.edit_tasks) {

        } else if (view.getId() == R.id.edit_users) {

        } else if (view.getId() == R.id.delete_projec) {

        } else if (view.getId() == R.id.save) {

        }
    }

    private void openDialogForEditDes() {

        dialog.setContentView(R.layout.dialog_for_edit_description);
        done = (Button) dialog.findViewById(R.id.done_edit_desc);
        cancel = (Button) dialog.findViewById(R.id.cancel_edit_desc);
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

    @Override
    public void applyChange(String s1, String s2) {
        Toast.makeText(this, "It is ok  " + s1 + "   " + s2, Toast.LENGTH_LONG).show();
    }
}