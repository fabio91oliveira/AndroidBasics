package me.oliveira.fabio.androidbasics.intentservice

import android.app.IntentService
import android.content.Intent
import android.widget.Toast

class ScoreIntentService : IntentService("ScoreIntentService") {

    override fun onHandleIntent(p0: Intent?) {
        Toast.makeText(this, "Intent Service has been called onHandleIntent", Toast.LENGTH_LONG).show()
    }

    override fun onCreate() {
        super.onCreate()
        Toast.makeText(this, "Intent Service has been created", Toast.LENGTH_LONG).show()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this, "Intent Service has been called onStartCommand", Toast.LENGTH_LONG).show()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Intent Service has been destroyed", Toast.LENGTH_LONG).show()
    }

}
