package com.example.reproductoraudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button play;
    SoundPool sp1;
    int sonido_corto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button)findViewById(R.id.button_soundPool);
        sp1 = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        sonido_corto = sp1.load(this, R.raw.sound_short, 1);
    }

    public void AudioSoundPool(View view){
        sp1.play(sonido_corto, 1, 1, 1, 0, 0);
    }

    public void AudioMediaPlayer(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sound_long);
        mp.start();
    }
}