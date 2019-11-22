package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class second_book_info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_book_info)
    }
    fun go_back2 (view: View) {

        startActivity(Intent(this@second_book_info,MainActivity::class.java))

    }
}
