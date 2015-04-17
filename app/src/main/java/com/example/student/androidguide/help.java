package com.example.student.androidguide;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class help extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        String help="Android Guide app has two button 'terminology' and 'websites'. \n\n" +
                "When click terminology button, you can search a word or phrase about Android Studio and you" +
                "will get a brief description and/or definition of the word. \n\n" +
                "When click websites button, it displays a list that contain 12 websites about learing Android." +
                "If a particular link is selected, a WebView will connect the user with that website.";
        TextView textHelp = (TextView)findViewById(R.id.help);
        textHelp.setText(help);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_help, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
