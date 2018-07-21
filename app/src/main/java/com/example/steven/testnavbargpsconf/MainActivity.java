package com.example.steven.testnavbargpsconf;

import android.app.AlarmManager;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Intent intent0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "قَلْبُ الإِنْسَانِ يُفَكِّرُ فِي طَرِيقِهِ، وَالرَّبُّ يَهْدِي خَطْوَتَه (سفر الأمثال 16: 9) ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/



 /*  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();

        /*FragmentManager fragmentManager = getFragmentManager();*/
        if (id == R.id.nav_first_layout) {
           /* fragmentManager.beginTransaction().replace(R.id.content_frame,new firstFragment()).commit();*/
            startActivity(new Intent(getApplicationContext(),FirstDay.class));


        } else if (id == R.id.nav_sec_layout) {
            startActivity(new Intent(getApplicationContext(),SecondDay.class));

/*
            fragmentManager.beginTransaction().replace(R.id.content_frame,new SecondFragment()).commit();
*/
        } else if (id == R.id.nav_third_layout) {
            startActivity(new Intent(getApplicationContext(),ThirdDay.class));

/*
            fragmentManager.beginTransaction().replace(R.id.content_frame,new ThirdFragment()).commit();
*/
        }else if (id == R.id.nav_fourth_layout) {
            startActivity(new Intent(getApplicationContext(),Fourthday.class));

/*
            fragmentManager.beginTransaction().replace(R.id.content_frame,new fourthFragment()).commit();
*/
        }
        else if (id == R.id.nav_share) {
            startActivity(new Intent(getApplicationContext(),TraneemList.class));
        } else if (id == R.id.nav_send) {
            startActivity(new Intent(getApplicationContext(),Main2Activity.class));
        }
        else if (id == R.id.fatherNav) {
            startActivity(new Intent(getApplicationContext(),Fathers.class));
        }
        else if (id == R.id.pray) {
            startActivity(new Intent(getApplicationContext(),PrayAct.class));
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
