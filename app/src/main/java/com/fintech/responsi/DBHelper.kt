package com.fintech.responsi

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

val DATABASENAME = "dbresponsi"
val TABLENAME = "login"
val COL_ID  = "id"
val COL_NAMA = "nama"
val COL_PASS = "password"

class DBHelper(val context: Context): SQLiteOpenHelper(context, DATABASENAME,null,1) {

    override fun onCreate(p0: SQLiteDatabase?) {
        val createTable = "CREATE TABLE " + TABLENAME + " (" + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                COL_NAMA + " VARCHAR(20)," + COL_PASS + " VARCHAR(10)) )"
        p0?.execSQL(createTable)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    fun insertData(user: User) {
        val database = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COL_NAMA, user.nama)
        contentValues.put(COL_PASS, user.pass)
        val result = database.insert(TABLENAME,null,contentValues)
        if (result == (0).toLong()){
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
        } else{
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
        }
    }

}