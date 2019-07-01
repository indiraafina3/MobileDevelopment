package com.example.belajarsound;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer player, audioBackground;
    private Button lagu1,lagu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //memanggil file sound
//        audioBackground = MediaPlayer.create(this, R.raw.lagu);
//        //setlooping
//        audioBackground.setLooping(true);
//        //setvolume
//        audioBackground.setVolume(1,1);
//        //memulai audio
//        audioBackground.start();


        //ambil button dari activity main
        lagu1 = (Button) this.findViewById(R.id.lagu1);
        lagu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(1);
            }
        });
        //ambil button dari activity
        lagu2 = (Button) this.findViewById(R.id.lagu2);
        lagu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(2);
            }
        });
    }
    public void onPause() {
        try {
            super.onPause();
            player.pause();
        }catch (Exception e) {
        }
    }
private void playSound (int arg) {
        try{
            if (player.isPlaying()){
                player.stop();
                player.release();
            }
        }catch (Exception e) {
            Toast.makeText(this, " Masuk Exception", Toast.LENGTH_LONG).show();
        }
        //kirim argumen nilai
    if (arg == 1) {
        Toast.makeText(this, "sedang memainkan lagu1", Toast.LENGTH_LONG).show();
        player = MediaPlayer.create(this, R.raw.lagu);
    }
    else if (arg==2) {
        Toast.makeText(this, "sedang memainkan lagu2", Toast.LENGTH_LONG).show();
        player = MediaPlayer.create(this, R.raw.lagu2);
    }
    //setlooping
    player.setLooping(false);
    //jalankan sound
    player.start();
}
}
