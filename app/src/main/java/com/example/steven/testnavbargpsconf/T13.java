package com.example.steven.testnavbargpsconf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class T13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t13);
        TextView Tv = (TextView) findViewById(R.id.tr13);
        Tv.setMovementMethod(new ScrollingMovementMethod());
    }
}
