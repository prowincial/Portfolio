package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class third_book : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_book)
    }
    fun go_home2 (view: View) {

        startActivity(Intent(this@third_book,MainActivity::class.java))

    }
    fun go_straight2 (view: View) {

        startActivity(Intent(this@third_book,third_book_info::class.java))

    }
}
