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

        val firstSeason: MutableList<String> = ArrayList()
        firstSeason.add("Monsoon is coming")
        firstSeason.add("Lord Snow")
        firstSeason.add("Street race")
        firstSeason.add("Princess Frog")
        firstSeason.add("Golden Crown")

        val secondSeason: MutableList<String> = ArrayList()
        secondSeason.add("Summer is coming")
        secondSeason.add("Lord Lion")
        secondSeason.add("Temp 53")
        secondSeason.add("Crown of a king")
        secondSeason.add("Golden door")

        val thirdSeason: MutableList<String> = ArrayList()
        thirdSeason.add("Tiger vs Lion")
        thirdSeason.add("Lord of Country")
        thirdSeason.add("Story of king")
        thirdSeason.add("Queen of fairy ")
        thirdSeason.add("Lovely Garden")

        header.add()
        header.add("Season2")
        header.add("Season3")

        body.add(firstSeason)
        body.add(secondSeason)
        body.add(thirdSeason)

        expandableListView.setAdapter(ExpandableListAdapter(this,expandableListView, header, body))

    }
}