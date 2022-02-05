package com.example.exam

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.adapter.AdapterExperts
import com.example.exam.adapter.AdapterType
import com.example.exam.model.ExpertsModel
import com.example.exam.model.TypeModel

class MainActivity2 : AppCompatActivity() {
    lateinit var contextType: Context
    lateinit var contextExperts: Context
    lateinit var recyclerViewType: RecyclerView
    lateinit var recyclerViewExperts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        initForType()
        initForExperts()
    }

    private fun initForExperts() {
        contextType = this
        recyclerViewExperts = findViewById(R.id.rv_experts)
        recyclerViewExperts.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        var expertList : ArrayList<ExpertsModel> = ArrayList()

        expertList.add(ExpertsModel(R.drawable.profile, "Mark Johnson"))
        expertList.add(ExpertsModel(R.drawable.profile, "Mark Johnson"))
        expertList.add(ExpertsModel(R.drawable.profile, "Mark Johnson"))
        expertList.add(ExpertsModel(R.drawable.profile, "Mark Johnson"))
        expertList.add(ExpertsModel(R.drawable.profile, "Mark Johnson"))
        expertList.add(ExpertsModel(R.drawable.profile, "Mark Johnson"))
        expertList.add(ExpertsModel(R.drawable.profile, "Mark Johnson"))

        refreshAdapterForExperts(expertList)
    }

    private fun refreshAdapterForExperts(expertList: ArrayList<ExpertsModel>) {
        val adapter = AdapterExperts(contextExperts, expertList)
        recyclerViewExperts.adapter = adapter
    }

    private fun initForType() {
        contextType = this
        recyclerViewType = findViewById(R.id.rv_cleanint_type)
        recyclerViewType.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        var typeList:ArrayList<TypeModel> = ArrayList()

        typeList.add(TypeModel(R.drawable.type_kitchen, "Kitchen Cleaning"))
        typeList.add(TypeModel(R.drawable.type_kitchen, "Kitchen Cleaning"))
        typeList.add(TypeModel(R.drawable.type_kitchen, "Kitchen Cleaning"))
        typeList.add(TypeModel(R.drawable.type_kitchen, "Kitchen Cleaning"))
        typeList.add(TypeModel(R.drawable.type_kitchen, "Kitchen Cleaning"))
        typeList.add(TypeModel(R.drawable.type_kitchen, "Kitchen Cleaning"))

        refreshAdapterForType(typeList)
    }

    private fun refreshAdapterForType(typeList: ArrayList<TypeModel>) {
        val adapter  = AdapterType(contextType,typeList)
        recyclerViewType.adapter = adapter
    }
}