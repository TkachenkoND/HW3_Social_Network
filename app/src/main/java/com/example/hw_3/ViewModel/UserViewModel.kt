package com.example.hw_3.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hw_3.Model.User
import com.example.hw_3.Model.UserData

class UserViewModel : ViewModel() {

    val userData: UserData = UserData()

    var userLiveData = MutableLiveData<UserData>()

    fun loadUserData(){
        userLiveData.value = userData
    }

}