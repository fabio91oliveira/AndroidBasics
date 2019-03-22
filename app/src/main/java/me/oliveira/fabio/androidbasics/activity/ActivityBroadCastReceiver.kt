package me.oliveira.fabio.androidbasics.activity

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_power_broadcast_receiver.*
import me.oliveira.fabio.androidbasics.R

class ActivityBroadCastReceiver : BaseActivity() {

    private var broadcastReceiver: BroadcastReceiver? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        setActivityName(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_power_broadcast_receiver)
        setBroadcastReceiver()
    }

    override fun onDestroy() {
        super.onDestroy()

        broadcastReceiver?.let {
            unregisterReceiver(it)
        }
    }

    private fun setBroadcastReceiver() {
        broadcastReceiver = object : BroadcastReceiver() {
            override fun onReceive(p0: Context?, p1: Intent?) {
                Toast.makeText(
                    this@ActivityBroadCastReceiver,
                    "Broadcast Received in Activity called ",
                    Toast.LENGTH_SHORT
                ).show()

                IntentFilter().apply {
                    addAction("com.local.receiver")
                    registerReceiver(broadcastReceiver, this)

                    btnSend.setOnClickListener {
                        Intent("com.local.receiver").apply {
                            sendBroadcast(this)
                        }
                    }
                }
            }
        }
    }

}
