package com.example.ghada_alshowaier_mid1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class music extends AppCompatActivity {

    Button play;
    MediaPlayer music;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        play = (Button) findViewById(R.id.button7);

        music = new MediaPlayer();
        music = MediaPlayer.create(this, R.raw.track1);

        i = 0;

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(i){
                    case 0:
                        music.start();
                        i = 1;
                        play.setText("music is playing, click to pause");
                        break;
                    case 1:
                        music.pause();
                        i = 0;
                        play.setText("music is paused, click to play");
                        break;
                }
            }


        });
    }
}