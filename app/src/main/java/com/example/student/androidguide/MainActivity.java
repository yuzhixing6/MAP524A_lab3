package com.example.student.androidguide;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickTerminology(View v){
        Intent myIntent = new Intent(this, ActivityTerminology.class);
        startActivity(myIntent);
    }

    public void clickWebsites(View v){
        startActivity(new Intent(this, Websites.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();

        switch (item.getItemId()) {
            case R.id.about:
                openAbout();
                return true;
            case R.id.help:
                openHelp();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void openAbout(){
        startActivity(new Intent(this, About.class));
    }

    public void openHelp(){ startActivity(new Intent(this, help.class));  }
}
