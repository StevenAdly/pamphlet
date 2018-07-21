package com.example.steven.testnavbargpsconf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class T2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t2);

        TextView Tv = (TextView) findViewById(R.id.tr2);
        Tv.setMovementMethod(new ScrollingMovementMethod());
    }
}
