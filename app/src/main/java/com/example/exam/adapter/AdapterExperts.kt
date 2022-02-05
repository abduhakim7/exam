package com.example.exam.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.R
import com.example.exam.model.ExpertsModel

class AdapterExperts(var context:Context, var expertList:ArrayList<ExpertsModel>) :RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adv_item, parent, false)
        return MemberViewHolder(view)
    }

    class MemberViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        lateinit var typeImage: ImageView
        lateinit var typeName: TextView

        init {
            var typeImage = view.findViewById<ImageView>(R.id.iv_expert)
            var typeName = view.findViewById<TextView>(R.id.tv_expert)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var itemExperts = expertList[position]

        if (holder is MemberViewHolder){
            var typeImage = holder.typeImage
            var typeName = holder.typeName
        }
    }

    override fun getItemCount(): Int {
        return expertList.size
    }
}