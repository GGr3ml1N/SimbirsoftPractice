package com.ggr3ml1n.practice.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ggr3ml1n.practice.R
import com.ggr3ml1n.practice.databinding.ActivityProfileBinding
import com.ggr3ml1n.practice.dataclasses.Friend

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    private val adapter = FriendAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar1))

        supportActionBar?.title = ""

        binding.bottomNavView.selectedItemId = R.id.profile

        val listOfFriends = listOf(
            Friend(getString(R.string.sample_friend1), R.drawable.friend1),
            Friend(getString(R.string.sample_friend2), R.drawable.friend2),
            Friend(getString(R.string.sample_friend3), R.drawable.friend3),
        )
        init(listOfFriends)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.edit -> {
                Toast.makeText(this, "Edit button has been pressed", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun init(listOfFriends: List<Friend>) {
        binding.apply {
            rcFriends.layoutManager = LinearLayoutManager(this@ProfileActivity)
            rcFriends.adapter = adapter
            adapter.addAllFriends(listOfFriends)
        }
    }
}
