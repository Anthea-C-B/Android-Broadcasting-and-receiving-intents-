package com.example.anthe.broadcastingandreceivingintents;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReciever extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent){
        Toast.makeText(context,"Intent detected",Toast.LENGTH_LONG).show();
    }
}
