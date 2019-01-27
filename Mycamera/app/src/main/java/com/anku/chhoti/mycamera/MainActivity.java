package com.anku.chhoti.mycamera;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends Activity {
Button b;
    ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        iv=(ImageView)findViewById(R.id.imageView);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,23);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle b1=data.getExtras();
        Bitmap bitmap=(Bitmap) b1.get("data");

        String root= Environment.getExternalStorageDirectory().toString();
        File myDir=new File(root + "/cameratest/firstattempt");
        myDir.mkdirs();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd_HH_mm_ss");
        String fname=simpleDateFormat.format(new Date())+".jpg";
        File file=new File(myDir,fname);
        if (file.exists())file.delete();
        try {
            FileOutputStream out = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, out);
            Toast.makeText(getApplicationContext(), "Image Saved", Toast.LENGTH_SHORT).show();
            out.flush();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(getApplicationContext(),"Image not saved",Toast.LENGTH_LONG).show();
        }
        Intent mediaScanIntent=new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);//sends broadcast to the gallery to be refreshed.
        Uri contentUri=Uri.fromFile(file);                                      //and save the new clicked image.
        mediaScanIntent.setData(contentUri);
        iv.setImageBitmap(bitmap);
        getApplicationContext().sendBroadcast(mediaScanIntent);


        iv.setImageBitmap(bitmap);
    }

}
//File path=new File(Environment.getExternalStorageDirectory(),"cameratest/firstattempt");
//Bitmap mBitmap= BitmapFactory.decodeFile(path.getpath())+"/")
//i.setImageBitmap(mBitmap);