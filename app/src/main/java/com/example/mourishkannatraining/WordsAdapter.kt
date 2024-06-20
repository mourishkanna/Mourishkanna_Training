package com.example.mourishkannatraining

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class WordsAdapter(var dataArray: Array<String>) : RecyclerView.Adapter<WordsAdapter.WordsViewHolder>() {
    var TAG = WordsAdapter::class.java.simpleName
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordsViewHolder {
        Log.i(TAG,"Person A bought a row plank")
        var rowPlank = LayoutInflater.from(parent.context).inflate(R.layout.rowlayout_item,parent,false)
        return  WordsViewHolder(rowPlank)
    }

    override fun onBindViewHolder(holder: WordsViewHolder, position: Int) {
        Log.i(TAG,"Person C is writing: "+ dataArray[position]+"on the textview shown by sundar")
        holder.tvRowItem.setText(dataArray[position])
    }

    override fun getItemCount(): Int {
        Log.i(TAG,"Person B counted: "+dataArray.size)
        return dataArray.size
    }

    class WordsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        init {
            Log.i("WordsAdapter","sundar is finding teh textview   row plank")

        }
        var tvRowItem = itemView.findViewById<TextView>(R.id.tvRow)
    }
}