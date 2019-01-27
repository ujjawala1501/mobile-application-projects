package com.anku.chhoti.notificationdemo;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mynotification extends Activity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mynotification);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationCompat.Builder builder=new  NotificationCompat.Builder(getApplication()).setSmallIcon(R.drawable.m).setContentTitle("NOTIFICATION EXAMPLE").setContentText("test notification ghantaa");
                Intent i=new Intent(getApplicationContext(),Mynotification.class);
                PendingIntent contentIntent = PendingIntent.getActivity(getApplicationContext(),0,i,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(contentIntent);

                //Add as notification
                NotificationManager manager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(0,builder.build());
            }
        });
    }
}
