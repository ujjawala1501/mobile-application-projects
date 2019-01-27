package com.anku.chhoti.hogwards;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Viewby extends Activity {
    Button b,b1,b2,b3;
    TextView t,t1;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewby);

        db=openOrCreateDatabase("hpes",MODE_PRIVATE,null);


        b=(Button)findViewById(R.id.button18);
        b1=(Button)findViewById(R.id.button19);
        b2=(Button)findViewById(R.id.button20);
        b3=(Button)findViewById(R.id.button21);
        t=(TextView)findViewById(R.id.textView);
        t1=(TextView)findViewById(R.id.textView2);

        String s="select *from login";
       final Cursor c=db.rawQuery(s, null);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!c.isFirst())
                {
                    if (c.moveToPrevious())
                    {
                        String n=c.getString(0);
                        String p=c.getString(1);
                        t.setText(n);
                        t1.setText(p);
                    }
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!c.isLast())
                {
                    if (c.moveToNext())
                    {
                        String n=c.getString(0);
                        String p=c.getString(1);
                        t.setText(n);
                        t1.setText(p);
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c.moveToFirst();
                String n=c.getString(0);
                String p=c.getString(1);
                t.setText(n);
                t1.setText(p);
            }
        });

    }
}
