package me.oliveira.fabio.androidbasics.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class PowerBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, p1: Intent?) {
        Toast.makeText(context, "Broadcast Received Device is connected to Power", Toast.LENGTH_SHORT).show()
    }
}