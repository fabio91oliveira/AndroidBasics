package me.oliveira.fabio.androidbasics.fragment

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.oliveira.fabio.androidbasics.R

class FragmentB : BaseFragment() {

    override fun onAttach(activity: Activity?) {
        setFragmentName(this)
        super.onAttach(activity)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_b, container, false)
    }
}