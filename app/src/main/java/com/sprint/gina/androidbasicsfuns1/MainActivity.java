package com.sprint.gina.androidbasicsfuns1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

// panda app icon from: <div>Icons made by <a href="https://www.flaticon.com/authors/smashicons" title="Smashicons">Smashicons</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>

public class MainActivity extends AppCompatActivity {
    // an activity is a screen in your app
    // MainActivity inherits from AppCompatActivity
    // which makes our activity backwards compatible

    // there is no main() in Android
    // there are multiple entry points to an app

    // onCreate() which is a "callback" that executes
    // when the activity has been created and its
    // layout has been inflated (setContentView())

    public static final String TAG = "MainActivityTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("hello from onCreate()");
        // this is not the androidy way to use debug messages
        // use the Log class instead
        Log.d(TAG, "onCreate: hello from Log.d");

        // layout: an invisible container that organizes GUI components (Views)
        // layouts inherit from ViewGroup
        // we will start with LinearLayout
        // orientation: vertical (one col)
        // horizontal (one row)
        // can nest

        // if we want to refer to a View defined in xml at runtime
        // it needs an id
        // TextView is a View
        View view = findViewById(R.id.firstTextView);
        TextView textView = (TextView) view;
        Log.d(TAG, "onCreate: " + textView.getText().toString());

        // task 1: via Java, change the Happy Tuesday text to HAPPY TUESDAY
        String text = textView.getText().toString();
        textView.setText(text.toUpperCase());
        // task 2: try to let Android Studio fix the warning in activity_main.xml
        String happyTuesday = getString(R.string.happy_tuesday);
        // task 3: try changing app bar color to green
        // change themes.xml

        // last thing... let's change the app icon
    }
}