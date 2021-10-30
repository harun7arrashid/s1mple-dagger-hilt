package id.s1mple.car

import android.content.Context

class Engine(val context: Context) {
    fun start() {
        println(context.applicationContext.getString(R.string.engine_start))
    }
}