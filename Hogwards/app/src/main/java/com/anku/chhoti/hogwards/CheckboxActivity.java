package com.anku.chhoti.hogwards;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckboxActivity extends Activity {

    CheckBox p,c,b,t;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        p=(CheckBox)findViewById(R.id.checkBox);
        c=(CheckBox)findViewById(R.id.checkBox2);
        b=(CheckBox)findViewById(R.id.checkBox3);
        t=(CheckBox)findViewById(R.id.checkBox4);
        b1=(Button)findViewById(R.id.button25);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int amount=0;
                StringBuilder result=new StringBuilder();
                result.append("Selected Item:  ");
                if (p.isChecked())
                {
                    result.append("\npizza  200Rs");
                    amount+=200;
                }
                if (c.isChecked())
                {
                    result.append("\nCoffee  40Rs");
                    amount+=40;
                }
                if (b.isChecked())
                {
                    result.append("\nBurger 150Rs");
                    amount+=150;
                }
                if (t.isChecked())
                {
                    result.append("\nTea 10Rs");
                    amount+=10;
                }
                result.append("\nTotal Amount"+amount);
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
            }
        });


    }
}
