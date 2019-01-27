package com.anku.chhoti.hogwards;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Web extends Activity {
    WebView ob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        ob=(WebView)findViewById(R.id.w);
        ob.getSettings().setJavaScriptEnabled(true);
        ob.loadUrl("http:\\www.google.com");
    }
}
