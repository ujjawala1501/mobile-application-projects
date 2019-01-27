package com.anku.chhoti.myviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyViewTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_my_view_test);
        Myview mv=new Myview(this);
        setContentView(mv);
    }
}
