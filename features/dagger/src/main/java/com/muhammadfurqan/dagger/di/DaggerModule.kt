package com.muhammadfurqan.dagger.di

import com.muhammadfurqan.dagger.model.Car
import com.muhammadfurqan.dagger.model.Engine
import dagger.Module
import dagger.Provides

/**
 * @author by furqan on 19/05/2021
 */
@Module
class DaggerModule {
    @Provides
    fun provideEngine(): Engine =
        Engine()

    // if you inject engine with field injection,
    // and you want to inject car also,
    // you need to provides Car
//    @Provides
//    fun provideCar(engine: Engine): Car =
//        Car().also {
//            it.engine = engine
//        }
}