package com.example.mourishkannatraining

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mourishkannatraining.kotlinexamples.Employee

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun myclickHandler(view: View) {
        Log.i("MainActivity","Button Clicked")
        var dialIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:8523941262"))
        startActivity(dialIntent)
        //var webIntent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
        //startActivity(webIntent)
    }
}