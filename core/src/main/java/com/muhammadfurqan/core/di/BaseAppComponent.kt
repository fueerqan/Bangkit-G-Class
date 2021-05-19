package com.muhammadfurqan.core.di

import dagger.Component

/**
 * @author by furqan on 19/05/2021
 */
@Component(modules = [BaseAppModule::class])
interface BaseAppComponent {
    @Component.Factory
    interface Factory {
        fun create(): BaseAppComponent
    }
}