package me.oliveira.fabio.androidbasics.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_c.*
import me.oliveira.fabio.androidbasics.R
import me.oliveira.fabio.androidbasics.fragment.FragmentA
import me.oliveira.fabio.androidbasics.fragment.FragmentB


class ActivityC : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setActivityName(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        initClickListeners()
    }

    private fun initClickListeners() {
        btnChangeFragmentA.setOnClickListener { changeFragment(FragmentA()) }
        btnChangeFragmentB.setOnClickListener { changeFragment(FragmentB()) }
    }

    private fun changeFragment(fragment: Fragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.contentFragment, fragment)
        ft.addToBackStack(null)
        ft.commit()
    }

}
