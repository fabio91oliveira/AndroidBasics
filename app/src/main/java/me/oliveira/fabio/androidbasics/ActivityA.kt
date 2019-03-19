package me.oliveira.fabio.androidbasics

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class ActivityA : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setActivityName(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        initClickListeners()
    }

    private fun initClickListeners() {
        btnActivityB.setOnClickListener {
            Intent(this, ActivityB::class.java).apply {
                startActivity(this)
            }
        }
    }

}
