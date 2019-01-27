package com.anku.chhoti.findgrade;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button b;
    EditText ed1,ed2,ed3,ed4;
    TextView t;
    int avg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        ed1=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText2);
        ed3=(EditText)findViewById(R.id.editText3);
        ed4=(EditText)findViewById(R.id.editText4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=ed1.getText().toString();
                String s1=ed2.getText().toString();
                String s2=ed3.getText().toString();
                String s3=ed4.getText().toString();
                int num=Integer.parseInt(ed2.getText().toString());
                int num2=Integer.parseInt(ed3.getText().toString());
                int num3=Integer.parseInt(ed4.getText().toString());
                avg=num+num2+num3/3;
                //sumtwo=num+num2/2;
                //sumo=
                if(avg>=90)
                {
                    t.setText(s+" grade is A+ ");

                }
                else if (avg>=80&&avg<=89)
                {
                    t.setText(s+"grade is A");

                }
                 else if(avg<80&&avg<=70)
                 {
                     t.setText(s+"grade is B+");
                 }
                else if (avg<70&&avg>=40)
                {
                    t.setText(s+"grade is B");
                }
                else
                {
                    t.setText(s+"FAIL");
                }
            }
        });
    }
}
