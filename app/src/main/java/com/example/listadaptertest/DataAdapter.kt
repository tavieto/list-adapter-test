package com.example.listadaptertest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.listadaptertest.databinding.TextViewItemBinding

class DataAdapter : ListAdapter<User, DataAdapter.UserViewHolder>(DataDiffCallback()) {

    inner class UserViewHolder(private val binding: TextViewItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User) {
            binding.texto.text = user.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = TextViewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

}