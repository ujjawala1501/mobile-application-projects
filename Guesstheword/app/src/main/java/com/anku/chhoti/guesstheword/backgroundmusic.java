package com.anku.chhoti.guesstheword;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by chhoti on 28-06-2017.
 */
public class backgroundmusic extends Service implements MediaPlayer.OnCompletionListener {
    MediaPlayer mp;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (!mp.isPlaying())
        {
            mp.start();
        }
        return START_STICKY;
        //return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
    }

    @Override
    public void onCompletion(MediaPlayer mp) {

    }

    /*public backgroundmusic() {
        super();
    }*/
    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mp.isPlaying())
        {
            mp.stop();
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mp=MediaPlayer.create(this,R.raw.pk);
        mp.setOnCompletionListener(this);



    }
}
