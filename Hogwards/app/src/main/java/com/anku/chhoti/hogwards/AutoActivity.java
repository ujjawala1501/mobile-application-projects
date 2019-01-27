package com.anku.chhoti.hogwards;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoActivity extends Activity {
    String[]food={"momos","hyderabad","biryani","pizza","bangalore","iceland","penguin","korba","united kingdom","joker","rajisthan","france","spain","switzerland"};

    AutoCompleteTextView act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);
        act=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> arc=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,food);
        act.setThreshold(1);
        act.setAdapter(arc);
        act.setTextColor(Color.MAGENTA);

    }
}
