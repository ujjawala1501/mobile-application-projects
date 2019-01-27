package com.anku.chhoti.hogwards;

import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

public class hp extends ListActivity {
    String[] ar = {"My Grid view ", "My web view", "INTENT DEMO", "Email sending", "Database Demo", "Checkbox Demo", "RadioButton Demo", "Rating Bar Demo", "Seek Bar Demo","Progress Bar Demo","Toggle Demo", "Switch Demo","Auto complete Demo","Record Sending","Spinner Demo","Shared preferance Demo","Service Demo","Music Player","Action Bar Menu","Google Map Demo"};
    Class[] c = {Mygrid.class, Myweb.class, MyIntent.class, Email.class, Mydatabase.class, CheckboxActivity.class, RadioActivity.class, RatingActivity.class, SeekActivity.class,ProgressActivity.class,ToggleActivity.class,SwitchActivity.class,AutoActivity.class,RecordActivity.class,SpinnerActivity.class,SharedActivity.class,Myservice.class,MyMusicPlayer.class,ActionBarActivity.class,GoogleActivity.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_hp);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, ar));
        myProgress();
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent ob = new Intent(this, c[position]);
        startActivity(ob);
    }

    void myProgress() {
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setMessage("Loading pease wait");
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pd.setCancelable(false);
        pd.setTitle("MY ANDROID APP");
        pd.show();
        Thread t = new Thread() {
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    try {
                        sleep(1000 / 20);
                    } catch (Exception e) {
                    }
                    pd.setProgress(i);
                }
                pd.dismiss();
            }
        };
        t.start();
    }
}


