package com.example.hw_3.View

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.example.hw_3.R
import com.example.hw_3.ViewModel.UserViewModel
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide

class DetailsUser1Activity : AppCompatActivity() {

    private lateinit var vm: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_activity_user1)

        vm = ViewModelProvider(this).get(UserViewModel::class.java)

        val detailsUserName1: TextView = findViewById(R.id.detailsUserName1)
        val detailsTextStatus1: TextView = findViewById(R.id.detailsTextStatus1)
        val detailsTitle1: TextView = findViewById(R.id.detailsTextAboutMe)
        val detailsImage1: ImageView = findViewById(R.id.detailsImage1)

        vm.loadUserData()

        vm.userLiveData.observe(this, Observer {

            detailsUserName1.text = it.userList[0].name
            detailsTextStatus1.text = it.userList[0].status
            detailsTitle1.text = it.userList[0].aboutMe
            Glide.with(this)
                .load(it.userList[0].photoUri)
                .error(R.drawable.ic_launcher_foreground)
                .into(detailsImage1)

        })


    }
}