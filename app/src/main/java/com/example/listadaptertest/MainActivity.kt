package com.example.listadaptertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.listadaptertest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val adapter: DataAdapter by lazy {
        DataAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        binding.recyclerView.adapter = adapter

        adapter.submitList(userList)

    }
}