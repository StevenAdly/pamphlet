package com.example.steven.testnavbargpsconf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class T22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t22);
        TextView Tv = (TextView) findViewById(R.id.tr22);
        Tv.setMovementMethod(new ScrollingMovementMethod());
    }
}
