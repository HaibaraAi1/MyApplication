package com.example.a14421.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.sherry);
        textView.setText(getResources().getText(R.string.sherry));
        textView.setTextColor(getResources().getColor(R.color.colorPrimary));
    }
}
