package com.ggr3ml1n.practice.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.ggr3ml1n.practice.R
import com.ggr3ml1n.practice.databinding.FriendItemBinding
import com.ggr3ml1n.practice.dataclasses.Friend

class FriendAdapter : RecyclerView.Adapter<FriendAdapter.FriendViewHolder>() {

    private val friendList = mutableListOf<Friend>()

    class FriendViewHolder(item: View) : ViewHolder(item) {

        val binding = FriendItemBinding.bind(item)
        fun bind(friend: Friend) = with(binding) {
            tvFriendName.text = friend.fullName
            imFriend.setImageResource(friend.imageId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.friend_item, parent, false)
        return FriendViewHolder(view)
    }

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
        holder.bind(friendList[position])
    }

    override fun getItemCount(): Int = friendList.size

    fun addAllFriends(list: List<Friend>) {
        friendList.addAll(list)
        notifyDataSetChanged()
    }
}
