package com.cumpatomas.brunosrecipes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {

    private val _recipeModel = Channel<String>()
    val recipeModel = _recipeModel.receiveAsFlow()

    private val _randomRecipe = Channel<recipeModel>()
    val randomRecipe = _randomRecipe.receiveAsFlow()

    fun getFullList() {

        viewModelScope.launch {
            _recipeModel.send(recipeProvider().getRecipesList())

        }
    }

    fun sendRandomRecipe() {

        viewModelScope.launch {
            _randomRecipe.send(recipeProvider().getRandomRecipe())

        }

    }
}