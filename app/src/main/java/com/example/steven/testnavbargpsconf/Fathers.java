package com.example.steven.testnavbargpsconf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Fathers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fathers);

        TextView Tv = (TextView) findViewById(R.id.fatherText);
        Tv.setMovementMethod(new ScrollingMovementMethod());
    }
}
