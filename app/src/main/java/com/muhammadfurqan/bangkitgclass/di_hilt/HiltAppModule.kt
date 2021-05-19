package com.muhammadfurqan.bangkitgclass.di_hilt

import com.muhammadfurqan.bangkitgclass.model.Engine
import com.muhammadfurqan.bangkitgclass.model.HiltEngine
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

/**
 * @author by furqan on 19/05/2021
 */
// HILT

@Module
@InstallIn(ActivityComponent::class)
class HiltAppModule {
    @Provides
    fun provideEngine(): Engine = HiltEngine()
}