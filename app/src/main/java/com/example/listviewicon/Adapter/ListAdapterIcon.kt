package com.example.listviewicon.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewicon.Model.DataIcon.listModelList
import com.example.listviewicon.Model.ModelList
import com.example.listviewicon.R

class ListAdapterIcon (private val ListIcon: Context, private val modelList : ArrayList<ModelList>, private val listener: (ModelList) -> Unit)
    : RecyclerView.Adapter<ListAdapterIcon.ViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(LayoutInflater.from(ListIcon).inflate(R.layout.row_list, parent, false))
    }

    override fun getItemCount(): Int {
        return listModelList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindIcon(modelList[position], listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvName: TextView = view.findViewById(R.id.icon_name)
        var tvData: TextView = view.findViewById(R.id.icon_deskripsi)
        var imgPoster: ImageView = view.findViewById(R.id.img_icon)

        fun bindIcon(modelList: ModelList, listener: (ModelList) -> Unit){
            tvName.text = modelList.name
            Glide.with(itemView.context)
                .load(modelList.poster)
                .into(imgPoster)

            itemView.setOnClickListener{
                listener(modelList)
            }
        }
    }
}

