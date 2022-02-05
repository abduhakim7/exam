package com.example.exam.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.R
import com.example.exam.model.SaleModel

class AdapterSale(var context: Context, var saleList:ArrayList<SaleModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sale_item, parent, false)
        return MemberViewHolder(view)
    }
    class MemberViewHolder(var view: View):RecyclerView.ViewHolder(view){
        var saleImage : ImageView
        var saleName : TextView
        var saleNamepercent : TextView

        init {
            saleImage = view.findViewById(R.id.iv_sale)
            saleName = view.findViewById(R.id.tv_sale)
            saleNamepercent = view.findViewById(R.id.tv_sale_percent)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemSale = saleList[position]

        if (holder is MemberViewHolder) {
            var saleImage = holder.saleImage
            var saleName = holder.saleName
            var saleNamePercent = holder.saleNamepercent

            saleImage.setImageResource(itemSale.saleimage)
            saleName.setText(itemSale.saleName)
            saleNamePercent.setText(itemSale.saleNamePercent)
        }
    }

    override fun getItemCount(): Int {
        return saleList.size
    }
}