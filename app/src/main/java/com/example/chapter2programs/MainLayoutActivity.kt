package com.example.chapter2programs

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_layouts.btnConstraint
import kotlinx.android.synthetic.main.activity_layouts.btnFrame
import kotlinx.android.synthetic.main.activity_layouts.btnLinear
import kotlinx.android.synthetic.main.activity_layouts.btnRelative
import kotlinx.android.synthetic.main.activity_layouts.btnTable
import kotlinx.android.synthetic.main.activity_layouts.btnUI

class MainLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layouts)

       btnConstraint.setOnClickListener {
           var intent = Intent(this@MainLayoutActivity, ConstraintLayoutActivity::class.java)
           startActivity(intent)
       }
        btnFrame.setOnClickListener {
            var intent = Intent(this@MainLayoutActivity, FrameLayoutActivity::class.java)
            startActivity(intent)
        }
        btnRelative.setOnClickListener {
            var intent = Intent(this@MainLayoutActivity, RelativeLayoutActivity::class.java)
            startActivity(intent)
        }
        btnUI.setOnClickListener {
            var intent = Intent(this@MainLayoutActivity, BeautyAndTheBeastUIActivity::class.java)
            startActivity(intent)
        }
        btnLinear.setOnClickListener {
            var intent = Intent(this@MainLayoutActivity, LinearLayoutActivity::class.java)
            startActivity(intent)
        }
        btnTable.setOnClickListener {
            var intent = Intent(this@MainLayoutActivity, TableLayoutActivity::class.java)
            startActivity(intent)
        }
    }
}