package com.example.steven.testnavbargpsconf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class T7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t7);
        TextView Tv = (TextView) findViewById(R.id.tr7);
        Tv.setMovementMethod(new ScrollingMovementMethod());

    }
}
