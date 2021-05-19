package com.muhammadfurqan.bangkitgclass.sqlite.db

import android.content.ContentValues
import android.content.Context
import com.muhammadfurqan.bangkitgclass.sqlite.BookModel

/**
 * @author by furqan on 10/04/2021
 */
class BookDatabaseManager(context: Context) {

    private val db by lazy {
        DatabaseOpenHelper(context)
    }

    fun saveData(name: String) {
        // 1. Get Writable Database
        val writeableDb = db.writableDatabase

        // 2. Set the data to Content Values
        val values = ContentValues()
        values.put(DatabaseOpenHelper.KEY_NAME, name)

        // 3. Call the insert function from writable db
        writeableDb.insert(
            DatabaseOpenHelper.TABLE_BOOK,
            null,
            values
        )

        // 4. Close the database
        writeableDb.close()
    }

    fun getAllData(): List<BookModel> {
        val bookList: MutableList<BookModel> = mutableListOf()

        // 1. Get Readable Database
        val readableDb = db.readableDatabase

        // 2. Create SQL Syntax
        val select = "SELECT * FROM ${DatabaseOpenHelper.TABLE_BOOK}"

        // 3. Run SQL Syntax
        val cursor = readableDb.rawQuery(select, null)

        // 4. Check if the cursor is not null
        cursor?.apply {
            // 5. Create a loop to Get the data
            while (moveToNext()) {
                val book = BookModel(
                    id = getInt(getColumnIndexOrThrow(DatabaseOpenHelper.KEY_ID)),
                    name = getString(getColumnIndexOrThrow(DatabaseOpenHelper.KEY_NAME))
                )
                bookList.add(book)
            }
        }

        // 6. Return the book list
        return bookList
    }

}