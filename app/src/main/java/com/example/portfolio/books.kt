package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class books : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)
    }
    fun go_my_first_book (view: View) {

        startActivity(Intent(this@books,first_book::class.java))

    }
    fun go_my_second_book (view: View) {

        startActivity(Intent(this@books,second_book::class.java))

    }
    fun go_my_third_book (view: View) {

        startActivity(Intent(this@books,third_book::class.java))

    }
}
