package com.muhammadfurqan.bangkitgclass

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * @author by furqan on 19/05/2021
 */
@HiltAndroidApp
class MyApplication : Application() {
    // DAGGER
//    val appComponent: AppComponent by lazy {
//        DaggerAppComponent.builder().build()
//    }
}