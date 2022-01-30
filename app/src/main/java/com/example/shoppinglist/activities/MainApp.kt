package com.example.shoppinglist.activities

import android.app.Application
import com.example.shoppinglist.db.MainDatabase

class MainApp : Application() {

    val database by lazy { MainDatabase.getDataBase(this) }
}