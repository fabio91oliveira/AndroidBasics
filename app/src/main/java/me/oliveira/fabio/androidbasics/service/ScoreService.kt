package me.oliveira.fabio.androidbasics.service

import android.app.Service
import android.content.Intent
import android.content.ServiceConnection
import android.os.IBinder
import android.widget.Toast

class ScoreService : Service() {

    companion object {
        private var score = 0
    }

    override fun onBind(intent: Intent?): IBinder? {
        Toast.makeText(this, "Service has been called onBind", Toast.LENGTH_LONG).show()
        return null
    }

    override fun bindService(service: Intent?, conn: ServiceConnection, flags: Int): Boolean {
        Toast.makeText(this, "Service has been bind", Toast.LENGTH_LONG).show()
        return super.bindService(service, conn, flags)
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Toast.makeText(this, "Service has been called onUnBind", Toast.LENGTH_LONG).show()
        return super.onUnbind(intent)
    }

    override fun unbindService(conn: ServiceConnection) {
        super.unbindService(conn)
        Toast.makeText(this, "Service has been unbind", Toast.LENGTH_LONG).show()
    }

    override fun onCreate() {
        super.onCreate()
        Toast.makeText(this, "Service has been created", Toast.LENGTH_LONG).show()
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        intent.let {
            score += it.getIntExtra("score", 1)
        }
        Toast.makeText(this, "Service has been started command, your score is: $score", Toast.LENGTH_LONG).show()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onStart(intent: Intent?, startId: Int) {
        super.onStart(intent, startId)
        Toast.makeText(this, "Service has been started", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Service has been destroyed", Toast.LENGTH_LONG).show()
    }
}
