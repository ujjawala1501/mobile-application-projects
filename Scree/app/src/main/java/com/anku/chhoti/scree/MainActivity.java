package com.anku.chhoti.scree;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
    String[] ar={"mumbai","kashmir","manali","korba"};
    TextView t1,t2,t3,t4;
    Switch s1,s2,s3,s4;
    ToggleButton t;
    Spinner s;
    SeekBar sk;
    RatingBar rb;
    String[]st={"bsp","korba","spain","selena","edsheran"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.textView5);
        t2=(TextView)findViewById(R.id.textView6);
        t3=(TextView)findViewById(R.id.textView7);
        t4=(TextView)findViewById(R.id.textView8);
        s1=(Switch)findViewById(R.id.switch1);
        s2=(Switch)findViewById(R.id.switch2);
        s3=(Switch)findViewById(R.id.switch3);
        s4=(Switch)findViewById(R.id.switch4);
        t=(ToggleButton)findViewById(R.id.toggleButton);
        s=(Spinner)findViewById(R.id.spinner);
        sk=(SeekBar)findViewById(R.id.seekBar);
        rb=(RatingBar)findViewById(R.id.ratingBar);
        ArrayAdapter<String> ard=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ar);
      ard.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(ard);
      s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
          @Override
          public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
              if(s1.isChecked())
              {

              s.setVisibility(View.VISIBLE);
               t1.setVisibility(View.VISIBLE);
                  s.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                      @Override
                      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                          t1.setText("Selected"+st[position]);
                      }

                  });
              }
          }
      });
    }
}
