package com.example.chapter2programs

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_basic.*

class BasicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)

        button.setOnClickListener {
            val intent = Intent(this@BasicActivity, Layouts ::class.java)
            startActivity(intent)
        }

    }
}