package com.example.gentr.whatsmyname;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.content.res.Configuration;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    // Global variables
    public final static String extra_input = "somethingwentwrong";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View v)
    {
        Button  btn = (Button)findViewById(R.id.btnShow);
        EditText et = (EditText)findViewById(R.id.txtName);
        Intent myintent = new Intent(this, showNameActivity.class);
        String input = et.getText().toString();
        myintent.putExtra(extra_input,input);
        startActivity(myintent);
    }
    public void langSqButtonOnClick(View v)
    {
        Locale locale = new Locale("sq");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        this.setContentView(R.layout.activity_main);
        this.setContentView(R.layout.activity_show_name);
    }
    public void langEnButtonOnClick(View v)
    {
        Locale locale = new Locale("sq");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        this.setContentView(R.layout.activity_main);
        this.setContentView(R.layout.activity_show_name);
    }
}
