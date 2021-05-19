package com.muhammadfurqan.bangkitgclass.shared_preferences

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.muhammadfurqan.bangkitgclass.R

class SharedPrefActivity : AppCompatActivity() {

    private lateinit var etEmail: AppCompatEditText
    private lateinit var etPassword: AppCompatEditText
    private lateinit var btnLogin: AppCompatButton

    private lateinit var sessionUtils: SessionUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_pref)

        sessionUtils =
            SessionUtils(getSharedPreferences(SessionUtils.PREF_NAME, Context.MODE_PRIVATE))

        etEmail = findViewById(R.id.et_email)
        etPassword = findViewById(R.id.et_password)
        btnLogin = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener {
            onLogin()
        }
    }

    private fun onLogin() {
        val email = etEmail.text.toString()
        val password = etPassword.text.toString()

        sessionUtils.saveData(SessionUtils.KEY_EMAIL, email)
        sessionUtils.saveData(SessionUtils.KEY_PASSWORD, password)
        sessionUtils.saveData(SessionUtils.KEY_IS_LOGGED_IN, true)
        sessionUtils.applyEditor()
    }

}