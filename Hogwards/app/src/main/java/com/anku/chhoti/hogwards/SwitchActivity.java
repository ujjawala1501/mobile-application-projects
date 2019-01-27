package com.anku.chhoti.hogwards;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchActivity extends Activity {
    Switch s1 ,s2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        s1=(Switch)findViewById(R.id.switch1);
        s2=(Switch)findViewById(R.id.switch2);
        b=(Button)findViewById(R.id.button29);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder r=new StringBuilder();
                StringBuilder r1=new StringBuilder();
                if(s1.isChecked())
                {
                    r.append(s1.getTextOn());
                }
                else
                {
                    r.append(s1.getTextOff());
                }
                if(s2.isChecked())
                {
                    r.append(s2.getTextOn());
                }
                else
                {
                    r.append(s2.getTextOff());
                }
                Toast.makeText(getApplicationContext(),"Switch 1"+r.toString()+"\n Switch 2"+r1.toString(),Toast.LENGTH_LONG).show();


            }
        });
    }
}
