package com.example.portfolio


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class photos : AppCompatActivity()  {
    private var isImageScaled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photos)
    }
    fun go_photo1 (view: View) {

        startActivity(Intent(this@photos,photo1::class.java))

    }
    fun go_photo2 (view: View) {

        startActivity(Intent(this@photos,photo2::class.java))

    }
}
