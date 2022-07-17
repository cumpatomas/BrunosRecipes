package com.cumpatomas.brunosrecipes.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cumpatomas.brunosrecipes.R
import com.cumpatomas.brunosrecipes.RecipeModel

class RecipeListAdapter(val list: List<RecipeModel>) : RecyclerView.Adapter<ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context) //
        return ListViewHolder(layoutInflater.inflate(R.layout.item_list, parent, false))

    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

        val item = list[position]
        holder.display(item)

    }

    override fun getItemCount(): Int = list.size

}