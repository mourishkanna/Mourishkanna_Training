package com.example.mourishkannatraining

import androidx.lifecycle.ViewModel

class HomeViewModel:ViewModel() {
    var count = 0

    fun incrementCount(){
        count++
    }
}