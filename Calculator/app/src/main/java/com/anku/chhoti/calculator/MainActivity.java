package com.anku.chhoti.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity{
     Button b,b2,b3,b4;
    EditText e,e2;
    TextView t;
    int result=0;
    int num,num1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e= (EditText)findViewById(R.id.editText);
        e2= (EditText)findViewById(R.id.editText2);
        t= (TextView)findViewById(R.id.textView);
        b= (Button)findViewById(R.id.button);
        b2= (Button)findViewById(R.id.button2);
        b3= (Button)findViewById(R.id.button3);
        b4= (Button)findViewById(R.id.button4);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             int num=Integer.parseInt(e.getText().toString());
             String A=e.getText().toString();
             int c=Integer.parseInt(A);
            }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int num1=Integer.parseInt(e2.getText().toString());
                String B=e2.getText().toString();
               int a=Integer.parseInt(B);
            }
        });

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
            result=num+num1;
            t.setText("Result"+result);
           }
       });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
