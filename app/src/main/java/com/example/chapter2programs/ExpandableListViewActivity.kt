package com.example.chapter2programs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chapter2programs.adapters.ExpandableListAdapter
import kotlinx.android.synthetic.main.activity_expandable_list_view.expandableListView

class ExpandableListViewActivity : AppCompatActivity() {

    val header : MutableList<String> = ArrayList()
    val body : MutableList<MutableList<String>> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expandable_list_view)

        title = "Movies List"

        val season1: MutableList<String> = ArrayList()
        season1.add("Monsoon is coming")
        season1.add("Lord Snow")
        season1.add("Street race")
        season1.add("Princess Frog")
        season1.add("Golden Crown")

        val season2: MutableList<String> = ArrayList()
        season2.add("Summer is coming")
        season2.add("Lord Lion")
        season2.add("Temp 53")
        season2.add("Crown of a king")
        season2.add("Golden door")

        val season3: MutableList<String> = ArrayList()
        season3.add("Tiger vs Lion")
        season3.add("Lord of Country")
        season3.add("Story of king")
        season3.add("Queen of fairy ")
        season3.add("Lovely Garden")

        header.add("Season1")
        header.add("Season2")
        header.add("Season3")

        body.add(season1)
        body.add(season2)
        body.add(season3)

        expandableListView.setAdapter(ExpandableListAdapter(this,expandableListView, header, body))

    }
}