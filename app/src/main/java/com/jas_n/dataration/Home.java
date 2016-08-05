package com.jas_n.dataration;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

import java.util.Random;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        this.daily_progress();
        this.weekly_progress();
        this.monthly_progress();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this,Settings.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void daily_progress(){
        ProgressBar daily_status=(ProgressBar) findViewById(R.id.daily_ration);
        daily_status.setMax(100);
        Random r = new Random();
        daily_status.setProgress(r.nextInt(100)+0);
    }
    public void weekly_progress(){
        ProgressBar daily_status=(ProgressBar) findViewById(R.id.weekly_ration);
        daily_status.setMax(100);
        Random r = new Random();
        daily_status.setProgress(r.nextInt(100)+0);
    }
    public void monthly_progress(){
        ProgressBar daily_status=(ProgressBar) findViewById(R.id. monthly_ration);
        daily_status.setMax(100);
        Random r = new Random();
        daily_status.setProgress(r.nextInt(100)+0);
    }
}
