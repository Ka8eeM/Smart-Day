package com.example.karim.gproject.Activities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.karim.gproject.Fragments.CreateProject;
import com.example.karim.gproject.Fragments.Settings;
import com.example.karim.gproject.Fragments.SmartSchedule;
import com.example.karim.gproject.R;

public class TaskToday extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_today);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.Open, R.string.Close);

        mDrawerLayout.addDrawerListener(mToggle);
        NavigationView nv = (NavigationView) findViewById(R.id.navigation_view);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setUpDrawerContent(nv);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }

    public void selectedItemDrawer(MenuItem item) {
        android.support.v4.app.Fragment mFragment = null;
        Class fragmentClass;
        switch (item.getItemId()) {
            case R.id.create_project:
                fragmentClass = CreateProject.class;
                break;
            case R.id.settings:
                fragmentClass = Settings.class;
                break;
            case R.id.smart_schedule:
                fragmentClass = SmartSchedule.class;
                break;
            default:
                fragmentClass = CreateProject.class;
        }
        try {
            mFragment = (android.support.v4.app.Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.myFragment,mFragment).commit();
        item.setChecked(true);
        setTitle(item.getTitle());
        mDrawerLayout.closeDrawers();
    }
    private void setUpDrawerContent(NavigationView navigationView)
    {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        selectedItemDrawer(item);
                        return true;
                    }
                }
        );
    }
}