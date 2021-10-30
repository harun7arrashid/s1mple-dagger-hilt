package id.s1mple.car

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Car @Inject constructor(private val engine: Engine) {
    fun start() {
        engine.start()
    }
}