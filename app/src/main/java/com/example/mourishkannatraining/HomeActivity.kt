package com.example.mourishkannatraining

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mourishkannatraining.network.MarsApi
import com.example.mourishkannatraining.network.MarsPhoto
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity() {
    var TAG = HomeActivity::class.java.simpleName    //"HomeActivity"

    lateinit var marsRecyclerView: RecyclerView
    lateinit var marsAdapter: MarsAdapter
    lateinit var photos:List<MarsPhoto>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        marsRecyclerView = findViewById(R.id.recyclerViewURLs)
        marsRecyclerView.layoutManager = LinearLayoutManager(this)
        photos = ArrayList()
        marsAdapter = MarsAdapter(photos)
        marsRecyclerView.adapter = marsAdapter
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun getJson(view: View) {
        getMarsPhotos()
    }
    private fun getMarsPhotos() {
        GlobalScope.launch {
            var listMarsPhotos =   MarsApi.retrofitService.getPhotos()
            photos = listMarsPhotos
            marsAdapter.notifyDataSetChanged()
            var tvHome:TextView = findViewById(R.id.HomeTV)
//            tvHome.setText(listMarsPhotos.get(1).imgSrc)
            Log.i("homeactiviy",listMarsPhotos.size.toString())
            Log.i("homeactivity-url",listMarsPhotos.get(1).imgSrc)
        }
    }

    fun getJSON(view: View) {
        getMarsPhotos()
    }
}