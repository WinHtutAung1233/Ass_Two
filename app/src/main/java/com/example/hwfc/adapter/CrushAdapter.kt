package com.example.hwfc.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hwfc.R
import com.example.hwfc.model.Crush

class CrushViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var profileImg = itemView.findViewById<ImageView>(R.id.profile)
    var Image=itemView.findViewById<ImageView>(R.id.img)
}
class CrushAdapter(var crushList: ArrayList<Crush>) : RecyclerView.Adapter<CrushViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CrushViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.crush, parent, false) //always parent,false
        return CrushViewHolder(view)
    }

    override fun getItemCount(): Int {
        return crushList.size
    }

    override fun onBindViewHolder(holder: CrushViewHolder, position: Int) {
        holder.profileImg.setImageResource(crushList[position].profileimg)
        holder.Image.setImageResource(crushList[position].image)
    }
}