package com.example.lab4q4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED"))
            Toast.makeText(context,"wifi state changed",Toast.LENGTH_SHORT).show();
        else if(intent.getAction().equals("android.intent.action.BATTERY_LOW"))
            Toast.makeText(context,"battery is low",Toast.LENGTH_SHORT).show();
    }
}