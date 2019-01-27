package com.anku.chhoti.hogwards;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.util.Map;
import java.util.Set;

public class SharedActivity extends Activity {
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);
        ed = (EditText) findViewById(R.id.editText10);
        SharedPreferences sp = getSharedPreferences("ujju", 0);
        ed.setText(sp.getString("my text",""));
    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences sp = getSharedPreferences("ujju", 0);
        SharedPreferences.Editor spe=sp.edit();
        spe.putString("My text", ed.getText().toString());
        spe.commit();
    }
}