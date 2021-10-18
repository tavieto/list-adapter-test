package com.example.listadaptertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val adapter: DataAdapter by lazy {
        DataAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val userList = mutableListOf<User>()

        for (item in 1..50) {
            userList.addAll(
                listOf(
                    User(
                        item,
                        "Samilly $item"
                    )
                )
            )
        }

        recyclerView.adapter = adapter

        adapter.submitList(userList)

    }
}