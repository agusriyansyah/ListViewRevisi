package com.example.listviewicon

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewicon.Adapter.ListAdapterIcon
import com.example.listviewicon.Model.DataIcon
import com.example.listviewicon.Model.ModelList
import com.example.listviewicon.R.id.list_icon

class   MainActivity : AppCompatActivity() {
    private lateinit var rvIcon: RecyclerView
    private var list: ArrayList<ModelList> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvIcon = findViewById(list_icon)
        rvIcon.setHasFixedSize(true)
        list.addAll(DataIcon.listModelList)
        showIconList()
    }

    private fun showIconList(){
        rvIcon.layoutManager = LinearLayoutManager(this)
        rvIcon.adapter = ListAdapterIcon(this,list){
            Toast.makeText(this,it.data,Toast.LENGTH_SHORT).show();
        }
    }
}
