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

        title = getString(R.string.title)

        var firstSeason: MutableList<String> =ArrayList()
        firstSeason = getResources().getStringArray(R.array.seasonFirst).toMutableList()


        var secondSeason: MutableList<String> = ArrayList()
        secondSeason = getResources().getStringArray(R.array.seasonSecond).toMutableList()


        var thirdSeason: MutableList<String> = ArrayList()
        thirdSeason = getResources().getStringArray(R.array.seasonSecond).toMutableList()

        header.add(getString(R.string.seasonFirstPart))
        header.add(getString(R.string.seasonSecondPart))
        header.add(getString(R.string.seasonThirdPart))

        body.add(firstSeason)
        body.add(secondSeason)
        body.add(thirdSeason)

        expandableListView.setAdapter(ExpandableListAdapter(this,expandableListView, header, body))

    }
}