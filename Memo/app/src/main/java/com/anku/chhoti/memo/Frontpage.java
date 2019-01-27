package com.hp.anshikagoyal.androidadmob;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Frontpage extends AppCompatActivity {

    TextView t, t1;
    private int currentGamePoint = 0;
    //private Context context;
    ImageView img_question, img_answer;
    Button btn_answer,b1;
    int array_images[] = new int[]{
            R.drawable.fmf,
             R.drawable.dm,
             R.drawable.eke,
            R.drawable.ffk,
            R.drawable.ffm,
            R.drawable.fmf,
             R.drawable.parite,
             R.drawable.tftg,
            R.drawable.srsr,
            R.drawable.pari

    };

    int correct_answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        img_question = (ImageView) findViewById(R.id.img_question);
        t = (TextView) findViewById(R.id.textView);
        b1=(Button)findViewById(R.id.button2);
        t1 = (TextView) findViewById(R.id.textView2);
        btn_answer = (Button) findViewById(R.id.btn_answer);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomImage();
            }
            });


        btn_answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Frontpage.this, ChooseActivity.class);
                startActivityForResult(intent, 1999);

            }
        });
        randomImage();
        new CountDownTimer(30000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                t.setText("seconds remaining:" + millisUntilFinished / 1000);

            }
            @Override
            public void onFinish() {
                randomImage();
                Toast.makeText(Frontpage.this, "game over", Toast.LENGTH_SHORT).show();
            }

                }.start();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1999) {
            int answer_resource_id = data.getIntExtra("Answer", 0);
            img_answer = (ImageView) findViewById(R.id.img_answer);
            img_answer.setImageResource(answer_resource_id);
            if (answer_resource_id == correct_answer) {
                currentGamePoint += 10;
                Toast.makeText(this, "Good!!", Toast.LENGTH_SHORT).show();
t1.setText("score"+currentGamePoint);

            } else {
                Toast.makeText(this, "oops!!", Toast.LENGTH_SHORT).show();
            }

        }

    }
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            switch (item.getItemId()) {
                case R.id.menu_re_new:
                    randomImage();
                    break;
            }
            return true;
        }
            private void randomImage() {
                int img_resource = array_images[new Random().nextInt(9)];
                img_question.setImageResource(img_resource);
                correct_answer = img_resource;
            }




}


