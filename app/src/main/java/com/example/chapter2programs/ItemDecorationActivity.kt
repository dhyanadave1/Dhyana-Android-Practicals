package com.example.chapter2programs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter2programs.adapters.MyRecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_item_decoration.myRecyclerView

class ItemDecorationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_decoration)
        title = "Item Decoration"
        // create instance of RecyclerView
        // and register with the appropriate ID
//        val recyclerView: RecyclerView = findViewById(R.id.myRecyclerView)

        // create list of RecyclerViewData

        var recyclerViewData: MutableList<DataClassForRecyclerViewDecoration> = ArrayList()
            recyclerViewData.add(DataClassForRecyclerViewDecoration("1", "One"))
            recyclerViewData.add(DataClassForRecyclerViewDecoration("2", "two"))
            recyclerViewData.add(DataClassForRecyclerViewDecoration("3", "Three"))
            recyclerViewData.add(DataClassForRecyclerViewDecoration("4", "four"))

        // create a vertical layout manager
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // create instance of MyRecyclerViewAdapter
        val myRecyclerViewAdapter = MyRecyclerViewAdapter(recyclerViewData)

        // attach the adapter to the recycler view
        myRecyclerView.adapter = myRecyclerViewAdapter

        // also attach the layout manager
        myRecyclerView.layoutManager = layoutManager

        myRecyclerView.addItemDecoration(
            DividerItemDecoration(
                baseContext,
                layoutManager.orientation
            )
        )
        // make the adapter the data set
        // changed for the recycler view
        myRecyclerViewAdapter.notifyDataSetChanged()
    }
}
