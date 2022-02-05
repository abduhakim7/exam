package com.example.exam.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.R
import com.example.exam.model.TypeModel

class AdapterType(var context: Context, var typeList: ArrayList<TypeModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.type_cleaning_item, parent, false)
        return MemberViewHolder(view)
    }

    class MemberViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var typeImage: ImageView
        var typeName:TextView

        init {
            typeImage = view.findViewById(R.id.iv_type)
            typeName = view.findViewById(R.id.tv_type)
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemType = typeList[position]

        if (holder is MemberViewHolder) {
            val typeImage = holder.typeImage
            typeImage.setImageResource(itemType.typeImage)
        }
    }

    override fun getItemCount(): Int {
        return typeList.size
    }

}