package me.oliveira.fabio.androidbasics.activity

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_service.*
import me.oliveira.fabio.androidbasics.R
import me.oliveira.fabio.androidbasics.service.ScoreService

class ActivityScoreService : BaseActivity() {

    private val serviceConnection by lazy {
        object : ServiceConnection {
            override fun onServiceDisconnected(name: ComponentName?) {
                Toast.makeText(this@ActivityScoreService, "Service has been disconnected", Toast.LENGTH_LONG).show()
            }

            override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
                Toast.makeText(this@ActivityScoreService, "Service has been Connected", Toast.LENGTH_LONG).show()
            }

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setActivityName(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        initClickListeners()
    }

    private fun initClickListeners() {
        btnStartService.setOnClickListener {
            Intent(this, ScoreService::class.java).apply {
                if (txtScore.text.toString().isNotEmpty()) {
                    putExtra("score", txtScore.text.toString().toInt())
                }
                startService(this)
            }
        }
        btnStopService.setOnClickListener {
            Intent(this, ScoreService::class.java).apply {
                stopService(this)
            }
        }
        btnBindService.setOnClickListener {
            Intent(this, ScoreService::class.java).apply {
                startService(this)
                bindService(this, serviceConnection, Context.BIND_AUTO_CREATE)
            }
        }
        btnUnbindService.setOnClickListener { unbindService(serviceConnection) }
    }


}
