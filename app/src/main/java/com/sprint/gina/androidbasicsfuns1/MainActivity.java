package com.sprint.gina.androidbasicsfuns1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    // an activity is a screen in your app
    // MainActivity inherits from AppCompatActivity
    // which makes our activity backwards compatible

    // there is no main() in Android
    // there are multiple entry points to an app

    // onCreate() which is a "callback" that executes
    // when the activity has been created and its
    // layout has been inflated (setContentView())

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}