package com.cumpatomas.brunosrecipes.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.cumpatomas.brunosrecipes.RecipeModel
import com.cumpatomas.brunosrecipes.databinding.ItemListBinding


class ListViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemListBinding.bind(view)

    fun display(recipe: RecipeModel) {
        binding.tvItemName.text = recipe.name
        binding.tvItemIngredients.text = recipe.ingredients
        Glide.with(binding.ivItemImage.context)
            .load(recipe.photo)
            .apply(RequestOptions().transform(CenterCrop(), RoundedCorners(15)))
            .into(binding.ivItemImage)

        itemView.setOnClickListener { Toast.makeText(itemView.context, recipe.name, Toast.LENGTH_SHORT).show() }


    }
}