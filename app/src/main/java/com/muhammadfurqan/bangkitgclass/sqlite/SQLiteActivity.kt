package com.muhammadfurqan.bangkitgclass.sqlite

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.muhammadfurqan.bangkitgclass.R
import com.muhammadfurqan.bangkitgclass.sqlite.db.BookDatabaseManager

class SQLiteActivity : AppCompatActivity() {

    private lateinit var etBookName: AppCompatEditText
    private lateinit var btnAdd: AppCompatButton
    private lateinit var btnRead: AppCompatButton

    private val bookDb by lazy {
        BookDatabaseManager(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sqlite)

        etBookName = findViewById(R.id.book_name)
        btnAdd = findViewById(R.id.btn_add)
        btnRead = findViewById(R.id.btn_read)

        btnAdd.setOnClickListener {
            onAdd()
        }

        btnRead.setOnClickListener {
            onRead()
        }
    }

    private fun onAdd() {
        val bookName = etBookName.text.toString()

        if (bookName.isNotEmpty()) {
            bookDb.saveData(bookName)
            etBookName.setText("")
        }

        Toast.makeText(this, "Book Added", Toast.LENGTH_SHORT).show()
    }

    private fun onRead() {
        val bookList = bookDb.getAllData()
        val bookString = bookList.joinToString(separator = "\n") {
            "Book ${it.id} is ${it.name}"
        }

        Toast.makeText(this, bookString, Toast.LENGTH_LONG).show()
    }
}