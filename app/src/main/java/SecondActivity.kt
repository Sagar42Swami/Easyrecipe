package com.example.p1

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        startActivity(this.intent)

    }
}
