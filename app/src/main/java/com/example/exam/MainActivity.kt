package com.example.exam

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.adapter.AdapterAdv
import com.example.exam.adapter.AdapterSale
import com.example.exam.adapter.AdapterService
import com.example.exam.model.AdvModel
import com.example.exam.model.SaleModel
import com.example.exam.model.ServiceModel

class MainActivity : AppCompatActivity() {
    lateinit var context: Context
    lateinit var contextForSale: Context
    lateinit var contextForService: Context
    lateinit var recyclerView: RecyclerView
    lateinit var recyclerViewForSale: RecyclerView
    lateinit var recyclerViewForService: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewForAdv()
        initViewForService()
        initViewForSale()
        val button = findViewById<TextView>(R.id.view_more)
        button.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    private fun initViewForSale() {
        contextForSale = this
        recyclerViewForSale = findViewById(R.id.rv_sale)
        recyclerViewForSale.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        var saleList: ArrayList<SaleModel> = ArrayList()


        saleList.add(SaleModel(R.drawable.sale_claening, "Plumping Service", "30%"))
        saleList.add(SaleModel(R.drawable.sale_claening, "Plumping Service", "30%"))
        saleList.add(SaleModel(R.drawable.sale_claening, "Plumping Service", "30%"))
        saleList.add(SaleModel(R.drawable.sale_claening, "Plumping Service", "30%"))
        saleList.add(SaleModel(R.drawable.sale_claening, "Plumping Service", "30%"))
        saleList.add(SaleModel(R.drawable.sale_claening, "Plumping Service", "30%"))
        refreshAdapterForSale(saleList)
    }

    private fun refreshAdapterForSale(saleList: ArrayList<SaleModel>) {
        val adapter = AdapterSale(contextForSale, saleList)
        recyclerViewForSale.adapter = adapter
    }

    private fun initViewForService() {
        contextForService = this
        recyclerViewForService = findViewById(R.id.rv_service)
        recyclerViewForService.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        var serviceList: ArrayList<ServiceModel> = ArrayList()
        serviceList.add(ServiceModel(R.drawable.service_cleaning1, "Cleaning"))
        serviceList.add(ServiceModel(R.drawable.service_cleaning1, "Cleaning"))
        serviceList.add(ServiceModel(R.drawable.service_cleaning1, "Cleaning"))
        serviceList.add(ServiceModel(R.drawable.service_cleaning1, "Cleaning"))
        serviceList.add(ServiceModel(R.drawable.service_cleaning1, "Cleaning"))
        serviceList.add(ServiceModel(R.drawable.service_cleaning1, "Cleaning"))
        serviceList.add(ServiceModel(R.drawable.service_cleaning1, "Cleaning"))
        serviceList.add(ServiceModel(R.drawable.service_cleaning1, "Cleaning"))

        refreshAdapterForService(serviceList)

    }

    private fun refreshAdapterForService(serviceList: ArrayList<ServiceModel>) {
        val adapter = AdapterService(contextForService, serviceList)
        recyclerViewForService.adapter = adapter
    }

    private fun initViewForAdv() {
        context = this
        recyclerView = findViewById(R.id.rv_adv)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        var advList: ArrayList<AdvModel> = ArrayList()
        advList.add(AdvModel(R.drawable.adv1))
        advList.add(AdvModel(R.drawable.adv1))
        advList.add(AdvModel(R.drawable.adv1))
        advList.add(AdvModel(R.drawable.adv1))
        advList.add(AdvModel(R.drawable.adv1))
        advList.add(AdvModel(R.drawable.adv1))
        advList.add(AdvModel(R.drawable.adv1))
        advList.add(AdvModel(R.drawable.adv1))
        advList.add(AdvModel(R.drawable.adv1))
        advList.add(AdvModel(R.drawable.adv1))
        advList.add(AdvModel(R.drawable.adv1))

        refreshAdapter(advList)
    }

    private fun refreshAdapter(advList: ArrayList<AdvModel>) {
        val adapter = AdapterAdv(context, advList)
        recyclerView.adapter = adapter
    }
}