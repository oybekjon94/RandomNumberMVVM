package com.example.randomnumbermvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RandomNumberViewModel @Inject constructor(
    private val model:RandomNumberModel
):ViewModel() {

    private val _flow = MutableSharedFlow<RandomNumberResponse>()
    val flow:Flow<RandomNumberResponse> get()=_flow


    fun getRandomNumber(){
        viewModelScope.launch {
           model.getRandomNumber().collectLatest {
               _flow.emit(it)
           }
        }
    }
}