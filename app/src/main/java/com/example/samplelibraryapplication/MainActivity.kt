package com.example.samplelibraryapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sillysdk.SillySDK

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sdk = SillySDK()
        val text = sdk.whoAreYou()

        Toast.makeText(this,text,Toast.LENGTH_LONG).show()

        sdk.scanCard(this)
    }
}