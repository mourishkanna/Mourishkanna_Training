package com.example.mourishkannatraining

import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.SystemClock
import android.telephony.SmsManager
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import java.time.Instant

class HomeActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener{
    var TAG = HomeActivity::class.java.simpleName    //"HomeActivity"
    lateinit var mySpinner: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        mySpinner = findViewById(R.id.spinner) //taking handle


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        mySpinner.onItemSelectedListener = this

    }

    override fun onItemSelected(adpater: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var item:String = adpater?.getItemAtPosition(position).toString()
        Log.i(TAG, item )
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    //runntime permissions
    @SuppressLint("ScheduleExactAlarm")
    @RequiresApi(Build.VERSION_CODES.O)
    fun scheduleSms(view: View) {
        Log.i("HomeActivity","current system time in millis"+ SystemClock.elapsedRealtime())
        val alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        val triggerTime = Instant.now().toEpochMilli() + 30 *1000

        val intent = Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent: PendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)

        //alarmManager.canScheduleExactAlarms()
        alarmManager.setExact(AlarmManager.ELAPSED_REALTIME,triggerTime,pendingIntent)


    }


}