package com.example.ghada_alshowaier_mid1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish(); //not needed
                startActivity(new Intent(MainActivity.this, MainActivity2.class));

            }
        };

        Timer opening = new Timer();
        opening.schedule(task, 5000);
    }
}