package com.example.currency_test

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Data_currency:ViewModel (){
    val data_curr_live = MutableLiveData<String>()
    val list_curr_live = MutableLiveData<List<String>>()


}