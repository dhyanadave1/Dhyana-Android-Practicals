package com.example.chapter2programs

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_layouts.*

class Layouts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layouts)

        btnLinear.setOnClickListener {
            val intent = Intent(this@Layouts, BeautyAndTheBeastUIActivity ::class.java)
        }

    }
}