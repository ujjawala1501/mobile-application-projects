package com.anku.chhoti.sensordemo;

import android.app.Activity;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements SensorEventListener {
    TextView tv;
    RelativeLayout rt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView)findViewById(R.id.textView);
        rt=(RelativeLayout)findViewById(R.id.rt);

        SensorManager sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        int i=Sensor.TYPE_ORIENTATION;
        //int i=Sensor.TYPE_PROXIMITY;//
        Sensor s=sm.getDefaultSensor(i);
        sm.registerListener(this,s,sm.SENSOR_DELAY_NORMAL);

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        float[] data=event.values;
        float object_distance=data[0];
       /* if (object_distance==0)
        {
            rt.setBackgroundColor(Color.RED);
        }
        else
        {
            rt.setBackgroundColor(Color.MAGENTA);
        }*/
        float z=data[0];
        float x=data[1];
        float y=data[2];
        String st="ORIENTATION SENSOR";
        st=st+"\nPITCH="+x;
        st=st+"\nROLL="+y;
        st=st+"\nAZIMUTH="+z;
        tv.setText(st);
        rt.setBackgroundColor(Color.rgb((int)x,(int) y,(int)z));

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
