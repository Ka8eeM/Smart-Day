package com.example.karim.gproject.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.karim.gproject.Activities.OtherProfiles;
import com.example.karim.gproject.Models.UserToView;
import com.example.karim.gproject.R;

import java.util.ArrayList;

/**
 * Created by KARIM on 3/20/2018.
 */

public class InflateUserAdapter extends RecyclerView.Adapter<InflateUserAdapter.MyVHolder> {
    private LayoutInflater inflater;
    ArrayList<UserToView> list;
    Context context;

    public InflateUserAdapter(Context context, ArrayList<UserToView> list) {
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyVHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.user_item, parent, false);
        MyVHolder myViewHolder = new MyVHolder(view, context, list);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyVHolder holder, int position) {

        UserToView toView = list.get(position);
        holder.userName.setText(toView.getUserName());
        holder.userPhoto.setImageBitmap(toView.getBitmap());
        holder.closeIcon.setImageBitmap(toView.getBitmap1());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

     class MyVHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView userPhoto, closeIcon;
        TextView userName;
        Context context;
        ArrayList<UserToView> list;

        private void fun() {
           /* android.support.v4.app.FragmentManager manager = this.context.getSupportFragmentManager();
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.show(manager, "Message");*/
            Toast.makeText(context, "ok, it is deleted!", Toast.LENGTH_SHORT).show();
        }

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fun();
            }
        };
        public MyVHolder(View itemView, Context context, ArrayList<UserToView> list) {
            super(itemView);
            itemView.setOnClickListener(this);
            this.list = list;
            this.context = context;
            userPhoto = itemView.findViewById(R.id.user_photo_in_project);
            closeIcon = itemView.findViewById(R.id.remove);
            closeIcon.setOnClickListener(listener);
            userName = itemView.findViewById(R.id.user_name_in_project);
        }
        @Override
        public void onClick(View view) {
            this.context.startActivity(new Intent(this.context, OtherProfiles.class));
        }
    }
}
