package com.anku.chhoti.hogwards;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ShowActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Bundle bund=getIntent().getExtras();
        String b= bund.getString("Name");
        String p=bund.getString("Password");
        Toast.makeText(getApplicationContext(),"String :"+b.toString()+"\n string"+p.toString(),Toast.LENGTH_LONG).show();
    }
}
