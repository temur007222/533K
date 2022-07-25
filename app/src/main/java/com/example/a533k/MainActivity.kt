package com.example.a533k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun  initViews(){
        val recyclerView: RecyclerView = findViewById(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        refreshAdapter( recyclerView,  getAllChat())
    }

    private fun refreshAdapter( recyclerView: RecyclerView, chats: List<ItemChats>){
        val adapter = Adapter(this, chats)
        recyclerView.adapter = adapter
    }

    private fun getAllChat(): List<ItemChats>{
        val chat: ArrayList<ItemChats> = ArrayList()

        chat.add(ItemChats(R.drawable.nissan))
        chat.add(ItemChats(R.drawable.nissan))
        chat.add(ItemChats(R.drawable.volkswagen))
        chat.add(ItemChats(R.drawable.volkswagen))
        chat.add(ItemChats(R.drawable.volkswagen))
        chat.add(ItemChats(R.drawable.volkswagen))
        return (chat)
    }
}