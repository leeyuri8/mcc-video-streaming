package com.yrabdelrhmn.vidstreamingass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button video1,video2,video3,video4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, VideoPlayer.class);
        video1 = findViewById(R.id.vidNo1);
        video2 = findViewById(R.id.vidNo2);
        video3 = findViewById(R.id.vidNo3);
        video4 = findViewById(R.id.vidNo4);


        video1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.vidUrl = "https://samplelib.com/lib/preview/mp4/sample-5s.mp4";
                startActivity(intent);
            }

        });
        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.vidUrl = "https://pic.pikbest.com/19/65/29/30b888piCvjP.mp4";
                startActivity(intent);
            }
        });

        video3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.vidUrl = "https://pic.pikbest.com/18/23/90/84M888piC9iN.mp4";
                startActivity(intent);
            }
        });

        video4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.vidUrl = "https://samplelib.com/lib/preview/mp4/sample-15s.mp4";
                startActivity(intent);
            }
        });
    }
}