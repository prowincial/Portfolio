package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class second_book : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_book)
    }
    fun go_home1 (view: View) {

        startActivity(Intent(this@second_book,MainActivity::class.java))

    }
    fun go_straight1 (view: View) {

        startActivity(Intent(this@second_book,second_book_info::class.java))

    }
}
