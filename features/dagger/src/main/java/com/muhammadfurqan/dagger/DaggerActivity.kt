package com.muhammadfurqan.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.muhammadfurqan.core.MyApplication
import com.muhammadfurqan.dagger.di.DaggerDaggerComponent
import com.muhammadfurqan.dagger.model.Car
import javax.inject.Inject

class DaggerActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger)

        initInjector()
        car.start()
    }

    private fun initInjector() {
        val daggerComponent = DaggerDaggerComponent.builder()
            .baseAppComponent((application as MyApplication).appComponent)
            .build()
        daggerComponent.inject(this)
    }
}