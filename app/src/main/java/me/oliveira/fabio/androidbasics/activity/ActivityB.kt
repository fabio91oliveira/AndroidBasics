package me.oliveira.fabio.androidbasics.activity

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b.*
import me.oliveira.fabio.androidbasics.R

class ActivityB : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setActivityName(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        initClickListeners()
    }

    private fun initClickListeners() {
        btnCloseActivity.setOnClickListener { finish() }
    }

}
