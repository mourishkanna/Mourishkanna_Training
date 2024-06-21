package com.example.mourishkannatraining

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener{
    var dataArray = arrayOf("Tamil Nadu","Tamil","Mourish Kanna","Erode","Blue")
    var TAG = HomeActivity::class.java.simpleName    //"HomeActivity"
    lateinit var mySpinner: Spinner
    lateinit var myRecycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        mySpinner = findViewById(R.id.spinner)
        myRecycler = findViewById(R.id.recyclerView)

        myRecycler.layoutManager = LinearLayoutManager(this)
        var wordsAdapter = WordsAdapter(dataArray)
        myRecycler.adapter = wordsAdapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        mySpinner.onItemSelectedListener = this
//        var data = intent.extras?.getString("nkey")
//        Log.i("HomeActivity","data is = "+data)
//        val homeTextView: TextView = findViewById(R.id.HomeTV)
//        homeTextView.setText(data)
    }
    override fun onItemSelected(adpater: AdapterView<*>?, view: View?, position: Int, id: Long) {
            var item:String = adpater?.getItemAtPosition(position).toString()
            Log.i(TAG, item )
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
            TODO("Not yet implemented")
    }

    fun GetAndShowText(view: View) {
        var etUi: EditText = findViewById(R.id.etUItest)
        var text = etUi.text.toString()
        var tvUi: TextView = findViewById(R.id.UItv)
        tvUi.setText(text)
    }

}