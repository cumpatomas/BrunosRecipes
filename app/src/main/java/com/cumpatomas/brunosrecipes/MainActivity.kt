package com.cumpatomas.brunosrecipes

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.component1
import androidx.core.view.get
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.cumpatomas.brunosrecipes.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.nio.file.Files.find


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val model: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        initListeners()
    }

    private fun initListeners() {

        binding.btRecipesList.setOnClickListener {
            binding.bottomNavigation.selectedItemId = R.id.btBottomList // Formula to make menu item active!!
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

                else -> false
            }

        }

    }

    private fun goHome() {

        binding.menuContainer.isVisible = true
        binding.tvTextContainer.isGone = false

    }

    private fun getRandomRecipe() {
        binding.tvMenuTitle.text = getString(R.string.randomTitle)
        binding.menuContainer.isGone = true
        binding.tvTextContainer.isVisible = true
        binding.tvTextContainer.background = getDrawable(R.drawable.menu_background)

        model.sendRandomRecipe()

        lifecycleScope.launch {
            model.randomRecipe.collect { randomRecipe ->
                binding.tvTextContainer.text = randomRecipe.name

            }
        }
    }


    private fun getRecipesList() {
        binding.tvMenuTitle.text = getString(R.string.recipesTitle)
        binding.menuContainer.isGone = true
        binding.tvTextContainer.isVisible = true
        binding.tvTextContainer.background = getDrawable(R.drawable.menu_background)
        binding.tvTextContainer.movementMethod = ScrollingMovementMethod()
        model.fullList()
        lifecycleScope.launch {
            model.recipeModel.collect { recipeList ->
                binding.tvTextContainer.text = recipeList

            }
        }


    }


}
/*
Ideas:
- Present a photo of the dish in the Random option
- Make every item in the list clickable as an object to see ingredients and photos
- The last option "InputIngredients" is for the user to input the ingredients he/she has and get a list of possible recipes from the list


*/
