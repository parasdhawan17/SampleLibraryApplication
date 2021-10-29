package com.example.supersillysdk

import androidx.appcompat.app.AppCompatActivity
import com.example.sillysdk.SillySDK

class SuperSillySDK {

    val sillySDK = SillySDK()

    fun isItSuperSilly() : Boolean = true

    fun scan(appCompatActivity: AppCompatActivity){
        sillySDK.scanCard(appCompatActivity)
    }
}