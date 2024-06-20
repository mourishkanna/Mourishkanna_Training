package com.example.mourishkannatraining

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //inflateXml()
        setContentView(R.layout.activity_main)
        var name:String = "Mourish Kanna"
        Log.i(TAG,"activity is getting created")
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
        //createAlarm("Wake Up",19,32)
        var c = 10 + 20
        add(10,20)
        var hIntent = Intent(this,HomeActivity::class.java)
        hIntent.putExtra("nkey","mourish_phone")
        throw NullPointerException("demo vit exception")
        startActivity(hIntent)
    }

    private fun add(i: Int, i1: Int):Int {
        var c = 20
        var d = 20 * i
        mul(5,4)
        return i +i1
    }

    private fun mul(i: Int, i1: Int) {
        val d = i * i1
        div(6,3)
    }

    private fun div(i: Int, i1: Int) {
        add(10,20)
    }

    fun createAlarm(message: String, hour: Int, minutes: Int) {
        val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message)
            putExtra(AlarmClock.EXTRA_HOUR, hour)
            putExtra(AlarmClock.EXTRA_MINUTES, minutes)
        }
        //if (intent.resolveActivity(packageManager) != null) {
        startActivity(intent)
        // }
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG,"activity is started")
    }

    override fun onPause() {
        super.onPause()
        Log.w(TAG,"activity has paused")

    }

    override fun onResume() {
        super.onResume()
        Log.w(TAG,"activity has resumed")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"activity is stopped")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG,"activity is destroyed")
    }

    fun inflateXml(){
        var nameEditText = EditText(this)
        nameEditText.setHint("enter ur name")
        var pwdEditText = EditText(this)
        pwdEditText.setHint("enter ur pass")
        var loginButton = Button(this)
        loginButton.setText("login")
    }
}