package com.example.karim.gproject.Activities;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.karim.gproject.Adapters.CommentAdapter;
import com.example.karim.gproject.Models.CommentModel;
import com.example.karim.gproject.R;

import java.util.ArrayList;

public class Comments extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<CommentModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);
        getSupportActionBar().setTitle("Comments");
        recyclerView = (RecyclerView) findViewById(R.id.recycle_view_for_comment);
        Drawable myDrawable = getResources().getDrawable(R.drawable.profile_photo);
        Bitmap bitmap = ((BitmapDrawable) myDrawable).getBitmap();
        list = new ArrayList<>();
        list.add(new CommentModel("Ahmed1", "this is message", "01:08 AM, 14/3/2018", bitmap));
        list.add(new CommentModel("Ahmed2", "this is message", "01:08 AM, 14/3/2018", bitmap));
        list.add(new CommentModel("Ahmed3", "this is message", "01:08 AM, 14/3/2018", bitmap));
        list.add(new CommentModel("Ahmed4", "this is message", "01:08 AM, 14/3/2018", bitmap));
        list.add(new CommentModel("Ahmed5", "this is message", "01:08 AM, 14/3/2018", bitmap));
        list.add(new CommentModel("Ahmed6", "this is message", "01:08 AM, 14/3/2018", bitmap));
        list.add(new CommentModel("Ahmed7", "this is message", "01:08 AM, 14/3/2018", bitmap));
        list.add(new CommentModel("Ahmed8", "this is message", "01:08 AM, 14/3/2018", bitmap));
        list.add(new CommentModel("Ahmed9", "this is message", "01:08 AM, 14/3/2018", bitmap));
        list.add(new CommentModel("Ahmed10", "this is message", "01:08 AM, 14/3/2018", bitmap));
        list.add(new CommentModel("Ahmed11", "this is message", "01:08 AM, 14/3/2018", bitmap));
        list.add(new CommentModel("Ahmed12", "this is message", "01:08 AM, 14/3/2018", bitmap));
        list.add(new CommentModel("Ahmed13", "this is message", "01:08 AM, 14/3/2018", bitmap));
        CommentAdapter commentAdapter = new CommentAdapter(this, list);
        recyclerView.setAdapter(commentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
    }
}