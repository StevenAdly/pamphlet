package com.example.steven.testnavbargpsconf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class PrayAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pray);
        TextView Tv = (TextView) findViewById(R.id.prayText);
        Tv.setMovementMethod(new ScrollingMovementMethod());


    }
}
