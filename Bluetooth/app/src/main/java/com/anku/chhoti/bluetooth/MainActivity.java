package com.anku.chhoti.bluetooth;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.graphics.Color;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity{
    Button b,b1;
    TextView tv;
    Switch s;
    BluetoothAdapter bt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        b1=(Button)findViewById(R.id.button2);
        tv=(TextView)findViewById(R.id.textView2);
        s=(Switch)findViewById(R.id.switch1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
                startActivity(i);
            }
        });
        bt=BluetoothAdapter.getDefaultAdapter();
        if (bt==null){
            Toast.makeText(getApplicationContext(),"Bluetooth Not Working",Toast.LENGTH_LONG).show();
        }

        boolean status = bt.isEnabled();
        if (status){
            String op="Device Status :ON";
            String dn=bt.getName();
            String mac=bt.getAddress();
            op=op+"\nDevice :"+dn+"\nMAC ADDRESS :"+mac;
            tv.setText(op);
            tv.setTextColor(Color.BLUE);
            s.setChecked(false);
        }
        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {//boolean ischecked shows condition of bluetooth
                if (isChecked){
                    //switch changed to on
                    bt.enable();
                    String op="Devices Status :ON";
                    String dn=bt.getName();
                    String mac=bt.getAddress();
                    op=op+"\nDevice :"+dn+"\nMAC ADDRESS :"+mac;
                    tv.setText(op);
                    tv.setTextColor(Color.BLUE);


                }
                else{
                    bt.disable();
                    tv.setText("DEVICE STATUS : OFF");
                    tv.setTextColor(Color.RED);
                }

            }
        });
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Object[]device=bt.getBondedDevices().toArray();//shows how many devices are paired
                String data="other Devices\n------------";
                for(int i=0;i<device.length;i++)
                {
                    BluetoothDevice d=(BluetoothDevice)device[i];
                    String dn=d.getName();
                    data=data +"\n"+dn;

                }
                Toast.makeText(getApplicationContext(),data,Toast.LENGTH_LONG).show();
            }
        });

    }
}
