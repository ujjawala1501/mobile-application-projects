package com.anku.chhoti.hogwards;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by chhoti on 25-06-2017.
 */
public class MusicService extends Service implements MediaPlayer.OnCompletionListener{
    MediaPlayer mp;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        stopSelf();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if (!mp.isPlaying())
        {
            mp.start();
        }
        return START_STICKY;

       // return super.onStartCommand(intent,)
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mp=MediaPlayer.create(this,R.raw.a);
        mp.setOnCompletionListener(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mp.isPlaying())
        {
            mp.stop();
        }
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
    }
}

