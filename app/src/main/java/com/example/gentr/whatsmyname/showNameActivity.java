package com.example.gentr.whatsmyname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class showNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_name);
        Intent myintent = getIntent();
        String input = myintent.getStringExtra(MainActivity.extra_input);
        TextView tv = (TextView)findViewById(R.id.lblResult);
        tv.setText("Your name is " + input);
    }
}
