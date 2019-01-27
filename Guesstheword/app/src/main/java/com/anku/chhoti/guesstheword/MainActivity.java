package com.anku.chhoti.guesstheword;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {
    ImageView im;
    Button b,b1;
    Intent i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        b1=(Button)findViewById(R.id.button2);
        b.setOnClickListener(this);
        b1.setOnClickListener(this);
        i2=new Intent(MainActivity.this,backgroundmusic.class);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,secondpage.class);
                startActivity(i);

            }
        });

    }

    @Override
    public void onClick(View v) {
     if (v==b)
     {
        startActivity(i2);
         finish();
     }
        else if (v==b1)
     {
         stopService(i2);
         finish();

     }

    }
}
