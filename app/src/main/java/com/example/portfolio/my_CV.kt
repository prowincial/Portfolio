package com.example.portfolio



import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.github.chrisbanes.photoview.PhotoView


class my_CV : AppCompatActivity() {
    private var isImageScaled = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my__cv)


        var mIcon: ImageView = findViewById(R.id.mycvii)
        mIcon.setOnClickListener {
            val mBuilder: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this@my_CV)
            val mView: View =
                layoutInflater.inflate(R.layout.dialog_custom_layout, null)
            val photoView: PhotoView = mView.findViewById(R.id.imageView)
            photoView.setImageResource(R.drawable.cv)
            mBuilder.setView(mView)
            val mDialog: android.app.AlertDialog? = mBuilder.create()
            mDialog?.show()
        }
    }



}
