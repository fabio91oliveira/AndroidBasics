package me.oliveira.fabio.androidbasics.activity

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_service.*
import me.oliveira.fabio.androidbasics.R
import me.oliveira.fabio.androidbasics.intentservice.ScoreIntentService

class ActivityScoreIntentService : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setActivityName(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_service)
        initClickListeners()
    }

    private fun initClickListeners() {
        btnStartIntentService.setOnClickListener {
            Intent(this, ScoreIntentService::class.java).apply {
                startService(this)
            }
        }
    }


}
