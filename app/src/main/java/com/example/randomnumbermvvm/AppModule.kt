package com.example.randomnumbermvvm

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    @Named("test1")
    fun getTestString() = "This is the test1 string"


    @Singleton
    @Provides
    @Named("test2")
    fun getTestString2() = "This is the test2 string"


    @Singleton
    @Provides
    fun getRandomNumberModel() = RandomNumberModel()
}