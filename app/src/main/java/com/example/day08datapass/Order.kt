package com.example.day08datapass

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class Order : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order)

        val yourOrder = findViewById<TextView>(R.id.tvOrder)

      val  customerOfOrder = intent.getStringExtra(MainActivity.KEY)
        yourOrder.text = "Order Placed \n" + customerOfOrder.toString()

    }
}