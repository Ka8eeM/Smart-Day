package com.example.karim.gproject.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.karim.gproject.Models.CommentModel;
import com.example.karim.gproject.R;

import java.util.ArrayList;

/**
 * Created by KARIM on 3/26/2018.
 */

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    ArrayList<CommentModel> list;

    public CommentAdapter(Context context, ArrayList<CommentModel> list) {
        this.list = list;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //getItemViewType(0);
        View view = inflater.inflate(R.layout.template_for_comment_rec_item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        CommentModel model = list.get(position);
        holder.imageView.setImageBitmap(model.getPhoto());
        holder.nameReciever.setText(model.getName());
        holder.messageReciever.setText(model.getMessage());
        holder.timeReciever.setText(model.getTimeDate());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView nameReciever, messageReciever, timeReciever;
        private ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image_receiver);
            nameReciever = (TextView) itemView.findViewById(R.id.tv_reciever_name);
            messageReciever = (TextView) itemView.findViewById(R.id.message_reciver);
            timeReciever = (TextView) itemView.findViewById(R.id.time_reciever);
        }
    }
}
