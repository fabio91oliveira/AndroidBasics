package me.oliveira.fabio.androidbasics.fragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

open class BaseFragment : Fragment() {

    private lateinit var fragmentName: String

    fun setFragmentName(fragment: Fragment) {
        this.fragmentName = fragment.javaClass.simpleName
    }

    override fun onAttach(activity: Activity?) {
        super.onAttach(activity)
        Toast.makeText(context, "$fragmentName has been firstly attached", Toast.LENGTH_LONG).show()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Toast.makeText(context, "$fragmentName has been secondly attached", Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(context, "$fragmentName has been created", Toast.LENGTH_LONG).show()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Toast.makeText(context, "$fragmentName has been created view", Toast.LENGTH_LONG).show()
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Toast.makeText(context, "$fragmentName has been activity created", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(context, "$fragmentName has been started", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(context, "$fragmentName has been resumed", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(context, "$fragmentName has been paused", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(context, "$fragmentName has been stopped", Toast.LENGTH_LONG).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(context, "$fragmentName has been destroyed view", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(context, "$fragmentName has been destroyed", Toast.LENGTH_LONG).show()
    }

    override fun onDetach() {
        super.onDetach()
        Toast.makeText(context, "$fragmentName has been detached", Toast.LENGTH_LONG).show()
    }

}