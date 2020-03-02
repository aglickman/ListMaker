package com.allanglickman.listmaker

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.allanglickman.listmaker.R.id.itemNumber
import com.allanglickman.listmaker.R.id.itemString

class TodoListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val listPositionTextView = itemView.findViewById<TextView>(itemNumber)
    var listTitleTextView = itemView.findViewById<TextView>(itemString)
}