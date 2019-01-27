package com.anku.chhoti.greet;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends Activity {
    Button b;
    EditText ed;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        ed=(EditText)findViewById(R.id.editText);
        tv=(TextView)findViewById(R.id.textView);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                int hr = c.get(Calendar.HOUR_OF_DAY);
                String to = ed.getText().toString();

                if (hr >= 6 && hr <= 12) {
                    tv.setError("good morning"   + to);
                } else if (hr > 12 && hr < 17) {
                    tv.setText(" good afternoon"   + to);
                } else if (hr <= 17 && hr <= 20) {

                    tv.setText("good evening"   + to);

                } else {
                    tv.setText("Good Night "   + to);
                }
            }
        });


    }
}
