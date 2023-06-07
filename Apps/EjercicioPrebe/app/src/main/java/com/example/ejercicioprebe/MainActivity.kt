package com.example.ejercicioprebe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var myButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myButton = findViewById(R.id.button)

        myButton.setOnClickListener { view ->
            Toast.makeText(this, "Gracias por pucharle", Toast.LENGTH_LONG).show()
        }
    }
}