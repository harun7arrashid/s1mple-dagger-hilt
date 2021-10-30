package id.s1mple.car

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp // untuk Inject ke Application, biar semua class bisa menggunakan Hilt
open class MyApplication: Application() {

}