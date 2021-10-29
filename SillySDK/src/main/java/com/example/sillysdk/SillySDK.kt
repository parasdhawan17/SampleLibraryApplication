package com.example.sillysdk

import androidx.core.app.ActivityCompat.startActivityForResult

import io.card.payment.CardIOActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat


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

    fun scanCard(appCompatActivity: AppCompatActivity){
        val scanIntent = Intent(appCompatActivity, CardIOActivity::class.java)

        scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, true) // default: false

        scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_CVV, false) // default: false

        scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_POSTAL_CODE, false) // default: false

        appCompatActivity.startActivityForResult(scanIntent, 102)
    }

}