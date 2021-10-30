package id.s1mple.car

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint // jika ini di implement di Fragment, maka di Activitynya ksh ini juga
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car.start()
        Toast.makeText(this, "${car.start()}", Toast.LENGTH_LONG).show()
    }
}