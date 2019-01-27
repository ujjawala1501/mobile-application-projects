package com.anku.chhoti.hogwards;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Switch;

public class RadioActivity extends Activity {
    RadioGroup rd;
    LinearLayout li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        rd=(RadioGroup)findViewById(R.id.rg);
        li=(LinearLayout)findViewById(R.id.li);
        rd.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.r1:
                        li.setBackgroundResource(R.drawable.alpha);
                       // li.setBackgroundColor(Color.RED);
                        break;
                    case R.id.r2:
                        li.setBackgroundResource(R.drawable.go);
                        //li.setBackgroundColor(Color.GREEN);
                        break;
                    case R.id.r3:
                        li.setBackgroundResource(R.drawable.th);
                       // li.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.r4:
                        li.setBackgroundResource(R.drawable.to);
                        //li.setBackgroundColor(Color.BLACK);

                }
            }
        });


    }
}
