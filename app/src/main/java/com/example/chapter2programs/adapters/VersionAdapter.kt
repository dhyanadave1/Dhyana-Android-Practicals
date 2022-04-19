package com.example.chapter2programs.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter2programs.R
import com.example.chapter2programs.Versions
import kotlinx.android.synthetic.main.row.view.api_level
import kotlinx.android.synthetic.main.row.view.code_name
import kotlinx.android.synthetic.main.row.view.description
import kotlinx.android.synthetic.main.row.view.expandable_layout
import kotlinx.android.synthetic.main.row.view.linearLayout
import kotlinx.android.synthetic.main.row.view.version

class VersionAdapter(val versionList: List<Versions>) :
    RecyclerView.Adapter<VersionAdapter.VersionVH>() {
    class VersionVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var codeNameTxt: TextView = itemView.code_name
        var versionTxt: TextView = itemView.version
        var apiLevelTxt: TextView = itemView.api_level
        var descriptionTxt: TextView = itemView.description
        var linearLayout: LinearLayout = itemView.linearLayout
        var expandableLayout: RelativeLayout = itemView.expandable_layout
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VersionAdapter.VersionVH {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return VersionVH(view)
    }

    override fun onBindViewHolder(holder: VersionAdapter.VersionVH, position: Int) {
        val versions: Versions = versionList [position]
        holder.codeNameTxt.text = versions.codeName
        holder.versionTxt.text = versions.version
        holder.apiLevelTxt.text = versions.apiLevel
        holder.descriptionTxt.text = versions.description

        val isExpandable: Boolean = versionList [position].expandable
        holder.expandableLayout.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.linearLayout.setOnClickListener {
            val versions = versionList [position]
            versions.expandable = !versions.expandable
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int {
        return versionList.size
    }
}