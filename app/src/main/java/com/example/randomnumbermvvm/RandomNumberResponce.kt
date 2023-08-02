package com.example.randomnumbermvvm

sealed class RandomNumberResponse{
    data class Loading(val isLoading:Boolean):RandomNumberResponse()
    data class Success(val number:Int):RandomNumberResponse()
    data class Failure(val errorMessage:String):RandomNumberResponse()
}
