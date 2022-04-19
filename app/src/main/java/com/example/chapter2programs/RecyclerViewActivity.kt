package com.example.chapter2programs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter2programs.adapters.MyAdapter
import kotlinx.android.synthetic.main.activity_recycler_view.recyclerView

class RecyclerViewActivity : AppCompatActivity() {

    lateinit var imageID: Array<Int>
    lateinit var headline: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

    imageID = arrayOf(
        R.drawable.a,
        R.drawable.b,
        R.drawable.a,
        R.drawable.b,
        R.drawable.a
    )
        headline = arrayOf(
            "Fifty-seven students fell ill after ",
            "A court in Madhya Pradesh's Morena ",
            "The body of a 21-year-old student of a ",
            "PM Narendra Modi inaugurated ",
            "The Madhya Pradesh government "
        )
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        getUserdata()
    }

    private fun getUserdata() {
        var newArrayList = arrayListOf<News>()
        for (i in imageID.indices) {
            val news = News(imageID[i], headline[i])
            newArrayList.add(news)
        }
        recyclerView.adapter = MyAdapter(newArrayList, this)
    }
}