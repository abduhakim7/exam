package com.example.exam.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.R
import com.example.exam.model.ServiceModel

class AdapterService(var context: Context, var serviceList: ArrayList<ServiceModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.service_item, parent, false)
        return MemberViewHolder(view)
    }

    class MemberViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var serviceImage: ImageView
        var serviceName: TextView

        init {
            serviceName = view.findViewById(R.id.tv_service)
            serviceImage = view.findViewById(R.id.iv_service)
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var itemService = serviceList[position]

        if (holder is MemberViewHolder) {
            val serviceImage = holder.serviceImage
            val serviceName = holder.serviceName

            serviceImage.setImageResource(itemService.serviceImage)
            serviceName.setText(itemService.serviceName)
        }
    }

    override fun getItemCount(): Int {
        return serviceList.size
    }
}