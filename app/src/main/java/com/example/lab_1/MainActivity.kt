package com.example.lab_1

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Iniciar AT1
        val intentAT1 = Intent(this, AT1::class.java)
        startActivity(intentAT1)

        // Iniciar AT2
        val intentAT2 = Intent(this, AT2::class.java)
        startActivity(intentAT2)
    }
}
