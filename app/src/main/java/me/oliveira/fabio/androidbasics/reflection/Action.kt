package me.oliveira.fabio.androidbasics.reflection

import android.content.Context
import android.widget.Toast

class Action {
    fun doSomething(context: Context) {
        Toast.makeText(context, "Show something", Toast.LENGTH_LONG)
    }
}