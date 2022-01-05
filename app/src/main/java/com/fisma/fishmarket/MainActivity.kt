package com.fisma.fishmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.fisma.fishmarket.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("RESPOM", "PESAN SINGKAT")


        // get data dari server
    }
}