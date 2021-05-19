package com.muhammadfurqan.bangkitgclass

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.muhammadfurqan.bangkitgclass.model.Car
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DaggerActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger)

//        DAGGER
//        (application as MyApplication).appComponent.inject(this)

        car.start()
    }
}