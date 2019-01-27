package com.anku.chhoti.hogwards;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class ActionBarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);
       /* ActionBar ab=getActionBar();
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ab.setDisplayHomeAsUpEnabled(true);
        ab.show();*/
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.blackbeard, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.home:
                Toast.makeText(getApplicationContext(),"mysettings",Toast.LENGTH_LONG).show();
                //homeActivity();//we can take intent here,we can add toast,we canadd a new function in between these id and return.
                return true;

            case R.id.java:
                Intent i=new Intent(this,home.class);
                //javaActivity();
                return true;
            case R.id.android:
                androidActivity();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
  /*  public void homeActivity(){
        Toast.makeText(this,"Home option selected",Toast.LENGTH_LONG).show();
    }*/
    public void androidActivity(){
        Toast.makeText(this,"Home option selected2",Toast.LENGTH_LONG).show();}
    /*public void javaActivity(){
        Toast.makeText(this,"Home option selected3",Toast.LENGTH_LONG).show();}*/
}
