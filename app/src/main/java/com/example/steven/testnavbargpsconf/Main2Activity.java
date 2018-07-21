package com.example.steven.testnavbargpsconf;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
     MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView Tv = (TextView) findViewById(R.id.textbig);
        Tv.setMovementMethod(new ScrollingMovementMethod());


        final Button play = (Button) findViewById(R.id.playbtn);
         mp = MediaPlayer.create(Main2Activity.this, R.raw.she3ar);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp.isPlaying()) {
                    mp.pause();
                    play.setBackgroundResource(R.drawable.newplay);
                } else {
                    mp.start();
                    play.setBackgroundResource(R.drawable.newpause);
                }

            }
        });


    }

    @Override
    protected void onStop() {
        super.onStop();
        mp.stop();
    }
}
