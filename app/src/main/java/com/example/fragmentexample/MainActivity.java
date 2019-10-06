package com.example.fragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button activityButton;

        // get the reference of Button
        activityButton = (Button) findViewById(R.id.activity_button);

        // perform setOnClickListener event on Button
        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        // display a message by using a Toast
                Toast.makeText(getApplicationContext(), "Activity's Button", Toast.LENGTH_LONG).show();
            }
        });
    }
}
