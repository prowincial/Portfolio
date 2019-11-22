package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class first_book_info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_book_info)
    }
    fun go_back1 (view: View) {

        startActivity(Intent(this@first_book_info,MainActivity::class.java))

    }
}
