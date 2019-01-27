package com.anku.chhoti.hogwards;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Myservice extends Activity implements View.OnClickListener {// implements onclicklistner
    Button b, b1;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myservice);
        b = (Button) findViewById(R.id.button31);
        b1 = (Button) findViewById(R.id.button32);
        b.setOnClickListener(this);
        b1.setOnClickListener(this);
        i = new Intent(Myservice.this, MusicService.class);
    }

    @Override
    public void onClick(View v) {
        if (v==b)
        {
            startService(i);
            finish();
        }
        else if (v==b1)
        {
            stopService(i);
            finish();

        }
    }
}


