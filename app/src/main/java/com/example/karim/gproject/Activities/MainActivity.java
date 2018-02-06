package com.example.karim.gproject.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.karim.gproject.R;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private Button btnLogIn;
    private Button btnSignUp;
    private ImageView imageViewRight, imageViewLeft;
    private TextView textView;
    String[] welcomePages = getResources().getStringArray(R.array.welcome);
    int idx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* // check if we are running on Android 5.0 or higher
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            this.setTheme(R.style.AppMaterialTheme1);
            //Material design APIs
        } else {        // for below API 21
            this.setTheme(R.style.AppMaterialTheme);
            //implement with out material design
        }*/
        btnLogIn = (Button) findViewById(R.id.log_in);
        btnSignUp = (Button) findViewById(R.id.sign_up);

        imageViewLeft = (ImageView) findViewById(R.id.left);
        imageViewRight = (ImageView) findViewById(R.id.right);

        textView = (TextView) findViewById(R.id.tv_show);
        idx = 0;
    }

    public void click(View view) {
        Button btn = (Button) view;

        if (btn.getId() == btnLogIn.getId())
            intent = new Intent(this, LogIn.class);
        else
            intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }

    public void move(View view) {
        ImageView imageView = (ImageView) view;
        if (imageView.getId() == imageViewRight.getId()) {
            idx++;
            if (idx > 2)
                idx = 2;
            textView.setText(welcomePages[idx]);
            if (idx == 2) {
                imageViewRight.setVisibility(View.INVISIBLE);
                imageViewRight.setClickable(false);
            } else {
                imageViewRight.setVisibility(View.VISIBLE);
                imageViewRight.setClickable(true);
            }
        } else {
            idx--;
            if (idx < 0)
                idx = 0;
            textView.setText(welcomePages[idx]);
            if (idx == 0) {
                imageViewLeft.setVisibility(View.INVISIBLE);
                imageViewLeft.setClickable(false);
            } else {
                imageViewLeft.setVisibility(View.VISIBLE);
                imageViewLeft.setClickable(true);
            }
        }
    }
}
