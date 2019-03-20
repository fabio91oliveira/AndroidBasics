package me.oliveira.fabio.androidbasics.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    private lateinit var activityName: String

    fun setActivityName(activity: Activity) {
        this.activityName = activity.javaClass.simpleName
        supportActionBar?.title = this.activityName
    }

    fun <T> openActivity(clazz: Class<T>) {
        Intent(this, clazz).apply {
            startActivity(this)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "$activityName has been created", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "$activityName has been started", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "$activityName has been restarted", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "$activityName has been resumed", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "$activityName has been paused", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "$activityName has been stopped", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "$activityName has been destroyed", Toast.LENGTH_LONG).show()
    }
}