package com.example.a533k

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import kotlin.properties.Delegates

class Adapter(var context: Context, var list: List<ItemChats>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = list[position]

        if (holder is CustomViewHolder) {
            val iv_profile = holder.image
            iv_profile.setImageResource(chat.theme)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    private class CustomViewHolder(  view: View): RecyclerView.ViewHolder(view){
            var image: ImageView = view.findViewById(R.id.image)
        }
}