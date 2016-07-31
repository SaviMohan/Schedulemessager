//SMS Messenger and Scheduling Application

//Start with four input fields (timedelay mins, timedelay hours, number, message) and a button to send.
//Currently we have both timedelay input fields added to the layout.
//In the future we can add something to select the contact we want to message
//Maybe receiving messaging as well

package com.example.thedude.schedulemessager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
