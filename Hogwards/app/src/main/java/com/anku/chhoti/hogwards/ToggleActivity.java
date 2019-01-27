package com.anku.chhoti.hogwards;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleActivity extends Activity {
    ToggleButton tb,tb1;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
        tb=(ToggleButton)findViewById(R.id.toggleButton2);
        tb1=(ToggleButton)findViewById(R.id.toggleButton);
        b=(Button)findViewById(R.id.button28);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result=new StringBuilder();
                result.append("Toggle Button1 :").append(tb.getText());
                result.append("\nToggle Button2 :").append(tb1.getText());
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });
    }
}
