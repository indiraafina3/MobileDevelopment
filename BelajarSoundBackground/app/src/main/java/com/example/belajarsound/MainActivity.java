package com.example.belajarsound;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer audioBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//memanggil file sound
audioBackground = MediaPlayer.create(this, R.raw.lagu);
//setlooping
audioBackground.setLooping(true);
//setvolume
audioBackground.setVolume(1,1);
//memulai audio
audioBackground.start();


}
