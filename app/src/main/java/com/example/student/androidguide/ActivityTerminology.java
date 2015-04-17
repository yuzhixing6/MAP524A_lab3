package com.example.student.androidguide;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;


public class ActivityTerminology extends ActionBarActivity {

    private String[] texts;
    private AutoCompleteTextView searchText;
    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminology);

        texts = getResources().getStringArray(R.array.textSuggestion);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, texts);
        searchText = (AutoCompleteTextView)
                findViewById(R.id.editText);
        searchText.setAdapter(adapter);
        searchText.setThreshold(1);

        displayText = (TextView)findViewById(R.id.textDisplay);

        Button searchButton = (Button)findViewById(R.id.button);
        searchButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                String edit = searchText.getText().toString();

                display(edit);

            }
        });
    }

    public void display(String e){
        String answer="";

        if (e.equals("adb")) {
           answer="adb is stands for Android Debug Bridge, " +
                    "which is a command line tool for user communicate with a " +
                    "running android virtual device. For example, use \"adb install" +
                    " <path-to-apk>\" command to install the app package on the " +
                    "running device.";
        }
        else if (e.equals("gradle")) {
            answer="gradle is an advanced build toolkit for build android project.It's more flexible, customize, and easy to configure, extend. For example, use \"gradle build\" command to build and rebuild android project.";
        }
        else if (e.equals("pm")) {
            answer="pm is stands for Android Package manager, this is android shell commands manage an emulator device. For example, within adb shell, \"pm list package\" will list all packages installed on the device. \"pm uninstall package\" will uninstall the package from device.";
        }
        else if (e.equals("lint")) {
            answer="lint is a code scan tool for check the source code of project that help you find bug and correct problem. For example: \"lint --html lint.html GradleProject\" is for check the GradleProject and write the report to lint.html file.";
        }
        else if (e.equals("project")) {
            answer="project is contain all files that define a complete Android app, it could be include one or more modules.";
        }
        else if (e.equals("panel")) {
            answer="panel is the different part of the Android Studio widow that shows the various panels including preview panel, editing panel, DDMS panel etc.";
        }
        else if (e.equals("toolbar")) {
            answer="toolbar is on the top of the window and is a selection of shortcuts to provide quicker access to performed actions.";
        }
        else if (e.equals("status bar")) {
            answer="status bar along the bottom of the window that display informational message about the project and the activities of Android Studio.";
        }
        else if (e.equals("preview pane")) {
            answer="The right side of Android Studio is show the preview in a screens including Nexus 4 or other resolutions. This view is help the developer preview the app layout on multiple device screens.";
        }
        else if (e.equals("android pane")) {
            answer="android pane provides a hierarchical overview of the project file structure and through the drop-down menu to display the project in a number of different ways. ";
        }
        else if (e.equals("project explorer")) {
            answer="project explorer display the project file structure allows developer navigation to file or folder to be performed.";
        }
        else if (e.equals(".idea folder")) {
            answer="the .idea folder which stores specific metadata by Android Studio, a gradle which serves as a build system’s jar wrapper that is able to communicate with the OS or other platforms or libraries.";
        }
        else if (e.equals("intellisense")) {
            answer="Android Studio offers an intellisense feature, also known as code completion. Android Studio has added annotation as a basis for the suggested variables and methods during code completion. This allows the IDE to determine which values or lines in the code can cause an error. The intellisense then gives a warning as well as hints on how to resolve it. ";
        }
        else if (e.equals("module")) {
            answer="A module is a component of your app that you can build, test, or debug independently. Modules contain the source code and resources for your app.";
        }
        else if (e.equals("live layout")) {
            answer="live layout editing mode that allow you preview an app's user interface across a range of devices.You can even preview an app across multiple devices simultaneously using the 'Preview All Screen Sizes' option, or toggle between different orientations, themes and platform versions.";
        }
        else {
            answer="No this word definition";
        }


        displayText.setText(answer);

    }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_terminology, menu);
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
