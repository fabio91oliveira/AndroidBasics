package me.oliveira.fabio.androidbasics.activity

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*
import me.oliveira.fabio.androidbasics.R


class ActivityA : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setActivityName(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        initClickListeners()
    }

    private fun initClickListeners() {
        btnOpenActivityB.setOnClickListener {
            openActivity(ActivityB::class.java)
        }
        btnOpenActivityC.setOnClickListener {
            openActivity(ActivityC::class.java)
        }
        btnOpenActivityWithService.setOnClickListener {
            openActivity(ActivityScoreService::class.java)
        }
        btnOpenActivityWithIntentService.setOnClickListener {
            openActivity(ActivityScoreIntentService::class.java)
        }
        btnOpenActivityBroadcastReceiver.setOnClickListener {
            openActivity(ActivityBroadCastReceiver::class.java)
        }
    }


}
