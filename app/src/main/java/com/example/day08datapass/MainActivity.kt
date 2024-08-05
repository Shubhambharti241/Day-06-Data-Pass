package com.example.day08datapass

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
     companion object{
         const val KEY = ("com.example.day08datapass.MainActivity.KEY")
     }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val order1 =findViewById<EditText>(R.id.eT1)
        val order2 =findViewById<EditText>(R.id.eT2)
        val order3 =findViewById<EditText>(R.id.eT3)
        val order4 =findViewById<EditText>(R.id.eT4)
        val buttonOrder =findViewById<Button>(R.id.btnOrder)


        buttonOrder.setOnClickListener {

            val orderPlaced = "1."+order1.text.toString() + "\n" +"2."+ order2.text.toString()+"\n"+"3."+ order3.text.toString()+"\n"+"4." +
                    order4.text.toString()
            intent = Intent(this,Order::class.java)
            intent.putExtra(KEY ,orderPlaced)
            startActivity(intent)

        }
    }
}