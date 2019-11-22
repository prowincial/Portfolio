package com.example.portfolio


import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.github.chrisbanes.photoview.PhotoView


class photos : AppCompatActivity()  {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photos)
        var mIcon: ImageView = findViewById(R.id.ph1)
        mIcon.setOnClickListener {
            val mBuilder: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this@photos)
            val mView: View =
                layoutInflater.inflate(R.layout.dialog_custom_layout, null)
            val photoView: PhotoView = mView.findViewById(R.id.imageView)
            photoView.setImageResource(R.drawable.a)
            mBuilder.setView(mView)
            val mDialog: android.app.AlertDialog? = mBuilder.create()
            mDialog?.show()
        }
        var mIcon1: ImageView = findViewById(R.id.pho2)
        mIcon1.setOnClickListener {
            val mBuilder: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this@photos)
            val mView: View =
                layoutInflater.inflate(R.layout.dialog_custom_layout, null)
            val photoView: PhotoView = mView.findViewById(R.id.imageView)
            photoView.setImageResource(R.drawable.s)
            mBuilder.setView(mView)
            val mDialog: android.app.AlertDialog? = mBuilder.create()
            mDialog?.show()
        }
    }

}
