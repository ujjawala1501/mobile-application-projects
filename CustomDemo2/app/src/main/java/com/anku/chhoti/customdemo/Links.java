package com.anku.chhoti.customdemo;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Links extends Activity {
    ListView l;
    Button b,b2;
    List<String>link_al=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        b=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        l=(ListView)findViewById(R.id.listView);
        SQLiteDatabase db=openOrCreateDatabase("Link_DATA", MODE_PRIVATE,null);
        db.execSQL("create table if not exists Links(nick_name Varchar,link Varchar)");
        String query="select link from Links";
        Cursor c=db.rawQuery(query,null);

        String link;
        while (c.moveToNext())
        {
            link =c.getString(0);
            link_al.add(link);
        }
        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.listitem,R.id.textView,link_al);
        l.setAdapter(adapter);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(Links.this,AddActivity.class);
                startActivity(i);
            }
        });
    }
}
