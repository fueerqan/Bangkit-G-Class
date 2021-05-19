package com.muhammadfurqan.dagger.di

import com.muhammadfurqan.core.di.BaseAppComponent
import com.muhammadfurqan.dagger.DaggerActivity
import dagger.Component

/**
 * @author by furqan on 19/05/2021
 */
@Component(
    modules = [DaggerModule::class],
    dependencies = [BaseAppComponent::class]
)
interface DaggerComponent {
    fun inject(activity: DaggerActivity)
}