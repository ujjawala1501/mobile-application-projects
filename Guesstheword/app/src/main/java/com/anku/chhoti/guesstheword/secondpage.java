package com.anku.chhoti.guesstheword;

import android.app.AlertDialog;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class secondpage extends AppCompatActivity {
    EditText et;
    //String []ar={"dragon"};
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        b = (Button) findViewById(R.id.button3);
        et = (EditText) findViewById(R.id.editText);
        final ArrayList<String> ujju = new ArrayList<String>();
        final EditText guessword = (EditText) findViewById(R.id.editText);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (guessword.getText().toString().equals("")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(secondpage.this);
                    builder.setMessage("yeah you did it");
                    {

                }
            }
        });
    }
}


























}
}
