package com.example.karim.gproject.Activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.karim.gproject.Fragments.About;
import com.example.karim.gproject.Fragments.MyTasks;
import com.example.karim.gproject.Fragments.Notifications;
import com.example.karim.gproject.Fragments.Profile;
import com.example.karim.gproject.Fragments.Project;
import com.example.karim.gproject.Fragments.Settings;
import com.example.karim.gproject.R;

public class HomeTasks extends AppCompatActivity {

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

        // default view
        android.support.v4.app.Fragment mFragment = new MyTasks();
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.myFragment, mFragment).commit();
        nv.setCheckedItem(R.id.my_tasks);
    }

    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
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
            case R.id.my_tasks:
                fragmentClass = MyTasks.class;
                break;
            case R.id.projects:
                fragmentClass = Project.class;
                break;
            case R.id.profile:
                fragmentClass = Profile.class;
                break;
            case R.id.About:
                fragmentClass = About.class;
                break;
            case R.id.log_out:
                fragmentClass = Project.class;
                break;
            case R.id.notfications:
                fragmentClass = Notifications.class;
                break;
            default:
                fragmentClass = Settings.class;
                break;
        }
        try {
            mFragment = (android.support.v4.app.Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.myFragment, mFragment).commit();
        item.setChecked(true);
        mDrawerLayout.closeDrawers();
    }

    private void setUpDrawerContent(NavigationView navigationView) {
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