package com.example.portfolio


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class first_book : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_book)
    }
    fun go_home (view: View) {

        startActivity(Intent(this@first_book,MainActivity::class.java))

    }
    fun go_straight (view: View) {

        startActivity(Intent(this@first_book,first_book_info::class.java))

    }

}
