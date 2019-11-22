package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class photo1 : AppCompatActivity() {

    private var isImageScaled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo1)

        val image_view = findViewById(R.id.pho1) as ImageView
        image_view.setOnClickListener { v: View ->
            if(!isImageScaled) v.animate().scaleX(1.5f).scaleY(1.5f).duration=500
            if(isImageScaled) v.animate().scaleX(1f).scaleY(1f).duration=500
            isImageScaled= !isImageScaled
        }
    }
    fun go_hometown (view: View) {

        startActivity(Intent(this@photo1,MainActivity::class.java))

    }

}
