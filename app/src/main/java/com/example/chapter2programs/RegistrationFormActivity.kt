package com.example.chapter2programs

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registration_form.ibImageButton
import kotlinx.android.synthetic.main.activity_registration_form.myButton

class RegistrationFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_form)

         ibImageButton.setOnClickListener() {
             Toast.makeText(this@RegistrationFormActivity, getString(R.string.image_button_clicked), Toast.LENGTH_SHORT).show()
        }

        myButton.setOnClickListener() {
            Toast.makeText(this@RegistrationFormActivity, getString(R.string.submit_button_clicked), Toast.LENGTH_LONG).show()
        }
    }
}