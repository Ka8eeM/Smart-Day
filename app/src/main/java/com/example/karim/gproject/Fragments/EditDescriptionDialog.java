package com.example.karim.gproject.Fragments;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.karim.gproject.Interfaces.PassDataBetweenDialogAndActivities;
import com.example.karim.gproject.R;

/**
 * Created by KARIM on 3/23/2018.
 */

public class EditDescriptionDialog extends AppCompatDialogFragment {
    private Button done, cancel;
    private PassDataBetweenDialogAndActivities passData;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.dialog_for_edit_description, null);
        done = view.findViewById(R.id.done_edit_desc);
        cancel = view.findViewById(R.id.cancel_edit_desc);
        builder.setView(view).setTitle("Edit Description");
        return builder.create();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.done_edit_desc) {

            passData.applyChange("Done Edit", "Dialog");
        } else {
            passData.applyChange("Cancel Edit", "Dialog");
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            passData = (PassDataBetweenDialogAndActivities) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " Must implement Pass Data Interface");
        }
    }
}
