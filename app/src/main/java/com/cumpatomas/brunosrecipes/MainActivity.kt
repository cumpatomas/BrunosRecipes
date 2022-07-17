package com.cumpatomas.brunosrecipes

import android.annotation.SuppressLint
import  android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.cumpatomas.brunosrecipes.adapter.RecipeListAdapter
import com.cumpatomas.brunosrecipes.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val model: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        initrecyclerView()

        initListeners()
    }

    private fun initrecyclerView() {
        binding.rvListRecycler.layoutManager = LinearLayoutManager(this)
        binding.rvListRecycler.adapter = RecipeListAdapter(RecipeProvider.list)
    }

    private fun initListeners() {

        binding.btRecipesList.setOnClickListener {
            binding.bottomNavigation.selectedItemId =
                R.id.btBottomList // Formula to make menu item active!!
            getRecipesList()
        }

        binding.btRandomRecipe.setOnClickListener {
            binding.bottomNavigation.selectedItemId = R.id.btBottomRandom
            getRandomRecipe()
        }

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when {
                item.itemId == R.id.btBottomHome -> {

                    goHome()
                    true
                }
                item.itemId == R.id.btBottomRandom -> {
                    getRandomRecipe()
                    true
                }
                item.itemId == R.id.btBottomList -> {
                    getRecipesList()
                    true
                }
                item.itemId == R.id.btBottomInput -> {

                    true
                }

                else -> false
            }

        }

    }

    private fun goHome() {

        binding.menuContainer.isVisible = true
        binding.tvTextContainer.isGone = true
        binding.tvRandomRecipeName.isGone = true
        binding.tvMenuTitle.text = getString(R.string.menutitle)
        binding.rvListRecycler.isGone = true
        binding.ivRandomImage.isGone = true

    }

    private fun getRandomRecipe() {
        binding.tvMenuTitle.text = getString(R.string.randomTitle)
        binding.menuContainer.isGone = true
        binding.tvTextContainer.isGone = true
        binding.tvRandomRecipeName.isVisible = true
        binding.rvListRecycler.isGone = true
        binding.ivRandomImage.isVisible = true


        model.sendRandomRecipe()

        lifecycleScope.launch {
            model.randomRecipe.collect { randomRecipe ->
                binding.tvRandomRecipeName.text = randomRecipe.name
                Glide.with(binding.ivRandomImage.context)
                    .load(randomRecipe.photo)
                    .apply(RequestOptions().transform(CenterCrop(), RoundedCorners(18)))
                    .into(binding.ivRandomImage)

            }
        }
    }


    @SuppressLint("UseCompatLoadingForDrawables")
    private fun getRecipesList() {
        binding.tvMenuTitle.text = getString(R.string.recipesTitle)
        binding.menuContainer.isGone = true
        binding.rvListRecycler.isVisible = true
        binding.tvRandomRecipeName.isGone = true
        binding.ivRandomImage.isGone = true
        binding.tvTextContainer.background = getDrawable(R.drawable.menu_background)
        binding.tvTextContainer.movementMethod = ScrollingMovementMethod()


        }


    }



/*
Ideas:

- Present a photo of the dish in the Random option
- Make every item in the list clickable as an object to see ingredients and photos in a new UI
- The last option "Input Ingredients" is for the user to input the ingredients he/she has and get a list of possible recipes from the list
-How do I organize the files in the project folders?

*/
