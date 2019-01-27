package com.anku.chhoti.hogwards;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;

public class MyIntent extends Activity {
    Button b,b2,b3,b4,b5,b6,b7,b8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_intent);

        b=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:555-1234"));
                startActivity(i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i=new Intent(Intent.ACTION_WEB_SEARCH);
            i.putExtra(SearchManager.QUERY,"dog");
            startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_SENDTO,Uri.parse("sms:9009557626"));
                i.putExtra("sms_body","remember to buy bread and milk");
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q=shyam plaza"));
              startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar startTime=Calendar.getInstance();
                startTime.set(2017, 6, 25, 11, 35);
                Uri uri=Uri.parse("content://com.android.calendar/time/"+String.valueOf(startTime.getTimeInMillis()));
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i=new Intent(
                    ContactsContract.Intents.SHOW_OR_CREATE_CONTACT, ContactsContract.Contacts.CONTENT_URI);
                i.setData(Uri.parse("tel:9009557626"));
                i.putExtra(ContactsContract.Intents.Insert.COMPANY, "BSNL");
                i.putExtra(ContactsContract.Intents.Insert.POSTAL, "House Address,Street Name,State/Country");
                startActivity(i);
                Toast.makeText(MyIntent.this,"Record inserted",Toast.LENGTH_LONG).show();
            }
        });
        
    }
}
