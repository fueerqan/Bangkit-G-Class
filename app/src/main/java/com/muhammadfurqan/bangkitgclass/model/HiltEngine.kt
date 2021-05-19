package com.muhammadfurqan.bangkitgclass.model

import android.util.Log

/**
 * @author by furqan on 19/05/2021
 */
class HiltEngine : Engine() {
    override fun start() {
        Log.d("ENGINE", "HILT Engine Starting")
    }
}