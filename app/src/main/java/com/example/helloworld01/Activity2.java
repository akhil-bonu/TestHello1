package com.example.helloworld01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {
    private static final String TAG = "MainActivity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras = getIntent().getExtras();

        Log.d(TAG, "onCreate: starting activity 2 oncreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView value1 = (TextView) findViewById(R.id.textView3);
        value1.setText(extras.getString("value1"));
        Log.d(TAG, "onCreate: DONE");

    }
}
