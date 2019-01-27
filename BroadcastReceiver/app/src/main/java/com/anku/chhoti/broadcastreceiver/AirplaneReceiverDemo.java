package com.anku.chhoti.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by chhoti on 26-06-2017.
 */
public class AirplaneReceiverDemo extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Airplane Mode Changed",Toast.LENGTH_LONG).show();
    }
}
