package com.example.chapter2programs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.chapter2programs.adapters.PhotoAdapter
import kotlinx.android.synthetic.main.activity_grid_view_using_recycler.*

class GridViewUsingRecyclerActivity : AppCompatActivity() {
    private lateinit var  photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<GridView>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view_using_recycler)

        recyclerView.layoutManager = GridLayoutManager(this,2)
        photoAdapter = PhotoAdapter()
        recyclerView.adapter = photoAdapter

        //add data
        dataList.add(GridView("Onward","Award winning",R.drawable.image_grid))
        dataList.add(GridView("Moana","Wonderful adventure",R.drawable.moana))
        dataList.add(GridView("bighero","Scientific ",R.drawable.bighero))
        dataList.add(GridView("Princess frog","Fantasy",R.drawable.frog))
        dataList.add(GridView("Incredibles","Action movie",R.drawable.incredibles))
        dataList.add(GridView("Peter","Friendship",R.drawable.peter))
        dataList.add(GridView("Onward","Award winning",R.drawable.image_grid))
        dataList.add(GridView("Moana","Wonderful adventure",R.drawable.moana))

        photoAdapter.setDataList(dataList)
    }
}