package com.example.chapter2programs

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_frame_layout.*

class LinearLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)

        btnFeedback.setOnClickListener() {
            Toast.makeText(this, "Feedback Submitted", Toast.LENGTH_SHORT).show()

        }
    }
}