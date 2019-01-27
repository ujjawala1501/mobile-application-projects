package com.hp.anshikagoyal.androidadmob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ChooseActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView img_1, img_2, img_3, img_4, img_5, img_6, img_7, img_8, img_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

       ImageView img_1=(ImageView)findViewById(R.id.image_1);
        img_1.setTag(R.drawable.fmf);
        img_1.setOnClickListener(this);
       ImageView img_2=(ImageView)findViewById(R.id.image_2);
        img_2.setTag(R.drawable.dm);
        img_2.setOnClickListener(this);
        ImageView img_3=(ImageView)findViewById(R.id.image_3);
        img_3.setTag(R.drawable.eke);
        img_3.setOnClickListener(this);
        ImageView img_4=(ImageView)findViewById(R.id.image_4);
        img_4.setTag(R.drawable.parite);
        img_4.setOnClickListener(this);
       ImageView img_5=(ImageView)findViewById(R.id.image_5);
        img_5.setTag(R.drawable.pari);
        img_5.setOnClickListener(this);
        ImageView img_6=(ImageView)findViewById(R.id.image_6);
        img_6.setTag(R.drawable.tftg);
        img_6.setOnClickListener(this);
        ImageView  img_7=(ImageView)findViewById(R.id.image_7);
        img_7.setTag(R.drawable.srsr);
        img_7.setOnClickListener(this);
        ImageView img_8=(ImageView)findViewById(R.id.image_8);
        img_8.setTag(R.drawable.ffk);
        img_8.setOnClickListener(this);
        ImageView img_9=(ImageView)findViewById(R.id.image_9);
        img_9.setTag(R.drawable.ffm);
        img_9.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
Intent intent=new Intent();
        ImageView img=(ImageView)v;
        int img_resource_id=Integer.parseInt(img.getTag().toString());
        intent.putExtra("Answer",img_resource_id);
        setResult(1999,intent);
        finish();
    }
}
