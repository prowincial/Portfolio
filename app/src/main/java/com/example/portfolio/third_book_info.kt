package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class third_book_info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_book_info)
    }
    fun go_back3 (view: View) {

        startActivity(Intent(this@third_book_info,MainActivity::class.java))

    }
}
