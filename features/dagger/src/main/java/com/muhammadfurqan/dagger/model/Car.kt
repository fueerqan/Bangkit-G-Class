package com.muhammadfurqan.dagger.model

import javax.inject.Inject

/**
 * @author by furqan on 19/05/2021
 */
// 2. Use @Inject and doing with constructor inject
class Car @Inject constructor(private val engine: Engine) {

//     1. Use @Inject and doing with field inject
//        @Inject lateinit var engine: Engine

    fun start() {
        engine.start()
    }

}