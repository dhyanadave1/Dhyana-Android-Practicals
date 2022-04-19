package com.example.chapter2programs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chapter2programs.adapters.VersionAdapter
import kotlinx.android.synthetic.main.activity_expandable_recycler_view.recyclerView

class ExpandableRecyclerViewActivity : AppCompatActivity() {

    val versionList = ArrayList <Versions>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expandable_recycler_view)
        initData()
        setRecyclerview()
    }

    private fun setRecyclerview() {
        val versionAdapter = VersionAdapter(versionList)
        recyclerView.adapter = versionAdapter
        recyclerView.setHasFixedSize(true)
    }

    private fun initData() {
        versionList.add(
            Versions(codeName = "Android 10", version =  "Version 10", apiLevel = "API 29", description = "This is desc"
            )
        )
        versionList.add(
            Versions(
                codeName = "Android 11",
                version = "Version 11",
                apiLevel = "API 30",
                description = "This is desc"
            )
        )
        versionList.add(
            Versions(
                codeName = "Android 12",
                version = "Version 12",
                apiLevel = "API 31",
                description = "This is desc"
            )
        )
    }
}