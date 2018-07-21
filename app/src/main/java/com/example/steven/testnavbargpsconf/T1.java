package com.example.steven.testnavbargpsconf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class T1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t1);

        TextView Tv = (TextView) findViewById(R.id.tr1);
        Tv.setMovementMethod(new ScrollingMovementMethod());
    }
}
