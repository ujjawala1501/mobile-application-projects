package com.anku.chhoti.hogwards;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MyMusicPlayer extends Activity implements View.OnClickListener,SeekBar.OnSeekBarChangeListener,MediaPlayer.OnSeekCompleteListener {//use on click listener then use Onseek bar listener
    TextView tv1,tv2,tv3;                                                                             //use onseekcompletionlistener.
    Button b1,b2,b3,b4,b5;
    ProgressBar pb;
    SeekBar sb;
    ToggleButton tb;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music_player);
        tv1=(TextView)findViewById(R.id.textView2);
        tv2=(TextView)findViewById(R.id.textView3);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        pb=(ProgressBar)findViewById(R.id.progressBar);
        sb=(SeekBar)findViewById(R.id.seekBar);
        tb=(ToggleButton)findViewById(R.id.toggleButton);
        tv3=(TextView)findViewById(R.id.textView4);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        tb.setOnClickListener(this);
        sb.setOnClickListener(this);

        mp=MediaPlayer.create(this,R.raw.a);
        sb.setMax(mp.getDuration());
        pb.setMax(mp.getDuration());
        Thread t=new Thread(){
            public void run(){
                while (true){
                    sb.setProgress(mp.getCurrentPosition());
                    pb.setProgress(mp.getCurrentPosition());
                }
            };
        };
        t.start();
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId()==R.id.button)
        {
            if (mp.isPlaying()==false)
            {
                mp.start();
                double c=mp.getDuration();
                double d=c/1000;
                double e=d/60;
                double f=d%60;
                tv3.setText((int)e+":"+(int)f);
                }
            }
        if (v.getId()==R.id.button2)
        {

            mp.pause();
            double c=mp.getCurrentPosition();
            double d=c/1000;
            double e=d/60;
            double f=d%60;
            tv2.setText((int)e+":"+(int)f);
        }
        if (v.getId()==R.id.button3)
        {
            mp.seekTo(0);
        tv2.setText("00:00");
        }
        if (v.getId()==R.id.button4)
        {
            if (mp.getDuration()>(mp.getCurrentPosition()+5000)) {
                mp.seekTo(mp.getCurrentPosition()+5000);
                double c = mp.getCurrentPosition();
                double d = c / 1000;
                double e = d / 60;
                double f = d % 60;
                tv2.setText((int) e + ":" + (int) f);
            }
        }
        if (v.getId()==R.id.button5)
        {
            if (0<(mp.getCurrentPosition()-5000))
            {
                mp.seekTo(mp.getCurrentPosition()-5000);
                double c = mp.getCurrentPosition();
                double d = c / 1000;
                double e = d / 60;
                double f = d % 60;
                tv2.setText((int) e + ":" + (int) f);
            }
        }
        if (tb.getText().equals("DESABLE BUTTON")) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);

        }
        if (tb.getText().equals("ENABLE BUTTON")) {
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);

        }


    }



    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        if (fromUser==true)
        {
            mp.seekTo(progress);
        }
        double c = mp.getCurrentPosition();
        double d = c / 1000;
        double e = d / 60;
        double f = d % 60;
        tv2.setText((int) e + ":" + (int) f);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        double c = mp.getCurrentPosition();
        double d = c / 1000;
        double e = d / 60;
        double f = d % 60;
        tv2.setText((int) e + ":" + (int) f);

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        double c = mp.getCurrentPosition();
        double d = c / 1000;
        double e = d / 60;
        double f = d % 60;
        tv2.setText((int) e + ":" + (int) f);
    }

    @Override
    public void onSeekComplete(MediaPlayer mp) {
        mp.seekTo(0);
    }
}
