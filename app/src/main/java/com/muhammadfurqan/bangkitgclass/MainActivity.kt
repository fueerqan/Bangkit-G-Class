package com.muhammadfurqan.bangkitgclass

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.muhammadfurqan.bangkitgclass.shared_preferences.SharedPrefActivity
import com.muhammadfurqan.bangkitgclass.sqlite.SQLiteActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnSharedPref: AppCompatButton
    private lateinit var btnSqlite: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSharedPref = findViewById(R.id.btn_to_shared_pref)
        btnSharedPref.setOnClickListener {
            navigateToSharedPref()
        }

        btnSqlite = findViewById(R.id.btn_to_sqlite)
        btnSqlite.setOnClickListener {
            navigateToSqlite()
        }
    }

    private fun navigateToSharedPref() {
        startActivity(
            Intent(this, SharedPrefActivity::class.java)
        )
    }

    private fun navigateToSqlite() {
        startActivity(
            Intent(this, SQLiteActivity::class.java)
        )
    }
}