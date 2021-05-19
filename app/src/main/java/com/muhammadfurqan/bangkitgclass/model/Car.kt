package com.muhammadfurqan.bangkitgclass.model

import javax.inject.Inject

/**
 * @author by furqan on 19/05/2021
 */
class Car @Inject constructor(private val engine: Engine) {

    fun start() {
        engine.start()
    }

}