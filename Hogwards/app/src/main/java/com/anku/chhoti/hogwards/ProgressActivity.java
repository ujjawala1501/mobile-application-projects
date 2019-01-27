package com.anku.chhoti.hogwards;

import android.app.Activity;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProgressActivity extends Activity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        b=(Button)findViewById(R.id.button27);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*final ProgressDialog pd=new ProgressDialog(ProgressActivity.this);
                pd.setMessage("Loading please wait!!");
                pd.setProgressStyle(ProgressDialog);*/
            }
        });
    }

}
