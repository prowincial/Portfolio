package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun go_my_CV (view: View) {

        startActivity(Intent(this@MainActivity,my_CV::class.java))

    }
    fun go_about_me (view: View) {

        startActivity(Intent(this@MainActivity,about_me::class.java))

    }
    fun go_contact (view: View) {

        startActivity(Intent(this@MainActivity,contact::class.java))

    }
    fun go_books (view: View) {

        startActivity(Intent(this@MainActivity,books::class.java))

    }
    fun go_photos (view: View) {

        startActivity(Intent(this@MainActivity,photos::class.java))

    }
}
