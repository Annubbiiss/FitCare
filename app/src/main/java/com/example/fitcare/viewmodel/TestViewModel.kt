package com.example.fitcare.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class TestViewModel  : ViewModel(){
    var completed = MutableLiveData<Int>(0)
    fun observeToLivedata(): LiveData<Int> {
        return completed
    }


}