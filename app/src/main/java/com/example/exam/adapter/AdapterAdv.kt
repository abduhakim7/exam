package com.example.exam.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.R
import com.example.exam.model.AdvModel

class AdapterAdv(var context: Context, var advList: ArrayList<AdvModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adv_item, parent, false)
        return MemberViewHolder(view)
    }

    class MemberViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var image: ImageView

        init {
            image = view.findViewById(R.id.iv_adv)
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemAdv = advList[position]

        if (holder is MemberViewHolder) {
            var image = holder.image
            image.setImageResource(itemAdv.image)
        }
    }

    override fun getItemCount(): Int {
        return advList.size
    }

}