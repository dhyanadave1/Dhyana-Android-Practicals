package com.example.chapter2programs.adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter2programs.News
import com.example.chapter2programs.R
import com.google.android.material.imageview.ShapeableImageView
import kotlinx.android.synthetic.main.list_item.view.title_image
import kotlinx.android.synthetic.main.list_item.view.tvName

class MyAdapter(private val newsList: List<News>, recyclerViewActivity: Activity) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = newsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text = currentItem.heading
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val titleImage: ShapeableImageView = itemView.title_image
        val tvHeading: TextView = itemView.tvName
    }
}