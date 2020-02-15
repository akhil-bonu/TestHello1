package com.example.helloworld01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ONCREATE FINISHEDAFSDFA");


    }

    public void changeActivity(View v) {
        Log.d(TAG, "changeActivity: here2");
        Intent i = new Intent(this,Activity2.class);
        i.putExtra("value1","Value1");
        i.putExtra("value2","value2");
        Log.d(TAG, "changeActivity: here");
        startActivity(i);
    }

}




