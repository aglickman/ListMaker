package com.allanglickman.listmaker

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TodoListAdapter : RecyclerView.Adapter<TodoListViewHolder>() {

    private var todoLists = mutableListOf("Android Development", "House Work", "Errands")

    fun addNewItem(newItem: String = "") {
        if(newItem.isEmpty()) {
            todoLists.add("Todo list " + (todoLists.size + 1))
        }
        else {
            todoLists.add(newItem)
        }
        notifyDataSetChanged() //tells recycler view to reload all the data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.todo_list_view_holder, parent, false)
        return TodoListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todoLists.size
    }

    override fun onBindViewHolder(holder: TodoListViewHolder, position: Int) {
        holder.listPositionTextView.text = (position + 1).toString()
        holder.listTitleTextView.text = todoLists[position]
    }

}