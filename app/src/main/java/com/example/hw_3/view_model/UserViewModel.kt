package com.example.hw_3.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hw_3.model.User
import com.example.hw_3.model.UserData

class UserViewModel : ViewModel() {

    val userData: UserData = UserData()

    var userListLiveData = MutableLiveData<UserData>()
    var userDetailsLiveData = MutableLiveData<User>()

    fun loadListUsers(){
        userListLiveData.value = userData
    }

    fun loadDetailsUser(id: Int){
        userDetailsLiveData.value = userData.userList[id]
    }


}