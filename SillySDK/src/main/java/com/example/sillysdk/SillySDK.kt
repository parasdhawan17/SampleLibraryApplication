package com.example.sillysdk

class SillySDK {
    fun whoAreYou() : String{
        return SillySDK::class.java.name
    }

    fun whatDoYouDo() : String{
        return SillySDK::class.java.name + " turns your code silly"
    }

    fun areYouUsefull() : String{
        return "No I am not"
    }
}