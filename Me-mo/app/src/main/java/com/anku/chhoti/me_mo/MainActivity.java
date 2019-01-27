package com.anku.chhoti.me_mo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

Button play,pause,stop;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=(Button)findViewById(R.id.btnplay);
        pause=(Button)findViewById(R.id.btnpause);
        stop=(Button)findViewById(R.id.btnstop);
        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
           case R.id.btnplay:
               mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.ta);
               mediaPlayer.start();
            break;
            case R.id.btnpause:
                break;
            case R.id.btnstop:
                break;


        }

    }
}
