package com.example.chapter2programs.Helper
import android.app.Activity
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast


fun submitFeedback(feedback: Button, activity: Activity) {
    feedback.setOnClickListener {
        Toast.makeText(activity, "Feedback submitted!", Toast.LENGTH_SHORT).show()
    }
}

fun setSpinnerValues(feedbackType: Spinner, activity: Activity) {
    val feedbackArray = mutableListOf("Praise", "Complaint", "Inquiry", "Improvement")
    val feedbackAdapter =
        ArrayAdapter(activity, android.R.layout.simple_list_item_1, feedbackArray)
    feedbackType.adapter = feedbackAdapter
}
