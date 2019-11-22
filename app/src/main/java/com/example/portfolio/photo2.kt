package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class photo2 : AppCompatActivity() {

    private var isImageScaled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo2)

        val image_view = findViewById(R.id.pho2) as ImageView
        image_view.setOnClickListener { v: View ->
            if(!isImageScaled) v.animate().scaleX(1.5f).scaleY(1.5f).duration=500
            if(isImageScaled) v.animate().scaleX(1f).scaleY(1f).duration=500
            isImageScaled= !isImageScaled
        }
    }
    fun go_hometown1 (view: View) {

        startActivity(Intent(this@photo2,MainActivity::class.java))

    }
}
