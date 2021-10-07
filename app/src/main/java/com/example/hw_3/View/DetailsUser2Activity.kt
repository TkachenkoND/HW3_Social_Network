package com.example.hw_3.View

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.hw_3.R
import com.example.hw_3.ViewModel.UserViewModel

class DetailsUser2Activity: AppCompatActivity() {

    private lateinit var vm: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_activity_user2)

        vm = ViewModelProvider(this).get(UserViewModel::class.java)

        val detailsUserName: TextView = findViewById(R.id.detailsUserName1)
        val detailsTextStatus: TextView = findViewById(R.id.detailsTextStatus1)
        val detailsTitle: TextView = findViewById(R.id.detailsTextAboutMe)
        val detailsImage: ImageView = findViewById(R.id.detailsImage1)

        vm.loadUserData()

        vm.userLiveData.observe(this, Observer {

            detailsUserName.text = it.userList[1].name
            detailsTextStatus.text = it.userList[1].status
            detailsTitle.text = it.userList[1].aboutMe
            Glide.with(this)
                .load(it.userList[1].photoUri)
                .error(R.drawable.ic_launcher_foreground)
                .into(detailsImage)


        })


    }
}