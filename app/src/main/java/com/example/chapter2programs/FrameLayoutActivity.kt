package com.example.chapter2programs

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_table_layout.btnFeedback

class FrameLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout)

        btnFeedback.setOnClickListener() {
            Toast.makeText(this@FrameLayoutActivity, getString(R.string.feedback_submit), Toast.LENGTH_SHORT).show()
        }
    }
}