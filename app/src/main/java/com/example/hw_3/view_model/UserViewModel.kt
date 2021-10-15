package com.example.hw_3.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hw_3.model.User
import com.example.hw_3.model.UserData

class UserViewModel : ViewModel() {

    val userData: UserData = UserData()

    private val _userId = MutableLiveData<Int>()
    val userId: LiveData<Int> = _userId

    private val _userListLiveData = MutableLiveData<UserData>()
    val userListLiveData: LiveData<UserData> = _userListLiveData

    private val _userDetailsLiveData = MutableLiveData<User>()
    val userDetailsLiveData: LiveData<User> = _userDetailsLiveData

    fun loadListUsers() {
        _userListLiveData.value = userData
    }

    fun loadDetailsUser(id: Int) {
        _userDetailsLiveData.value = userData.userList[id]
    }

    fun openUserDetails(id: Int) {
        _userId.value = id
    }


}