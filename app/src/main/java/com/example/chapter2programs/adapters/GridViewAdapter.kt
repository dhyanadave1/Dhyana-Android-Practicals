package com.example.chapter2programs.adapters

    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.ImageView
    import android.widget.TextView
    import androidx.recyclerview.widget.RecyclerView
    import com.example.chapter2programs.GridView
    import com.example.chapter2programs.R
    import kotlinx.android.synthetic.main.grid_view.view.*

class PhotoAdapter: RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {

        var dataList = emptyList<GridView>()

        internal fun setDataList(dataList: List<GridView>) {
            this.dataList = dataList
        }

        // Provide a direct reference to each of the views with data items

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var image: ImageView
            var title: TextView
            var desc: TextView

            init {
                image = itemView.image
                title = itemView.title
                desc = itemView.desc
            }
        }

        // Usually involves inflating a layout from XML and returning the holder
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

            // Inflate the custom layout
            var view =
                LayoutInflater.from(parent.context).inflate(R.layout.grid_view, parent, false)
            return ViewHolder(view)
        }

        // Involves populating data into the item through holder
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {

            // Get the data model based on position
            var data = dataList[position]

            // Set item views based on your views and data model
            holder.title.text = data.title
            holder.desc.text = data.desc

            holder.image.setImageResource(data.image)
        }

        //  total count of items in the list
        override fun getItemCount() = dataList.size
    }
