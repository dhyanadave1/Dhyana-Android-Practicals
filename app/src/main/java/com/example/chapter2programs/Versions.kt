package com.example.chapter2programs

data class Versions(
    val codeName: String,
    val version: String,
    val apiLevel: String,
    val description: String,
    var expandable: Boolean = false
)
