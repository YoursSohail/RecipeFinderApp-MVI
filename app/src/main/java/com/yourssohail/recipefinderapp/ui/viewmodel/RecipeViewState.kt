package com.yourssohail.recipefinderapp.ui.viewmodel

import com.yourssohail.recipefinderapp.data.model.Meal

sealed class RecipeViewState {
    object Loading: RecipeViewState()
    data class Success(val recipes: List<Meal>): RecipeViewState()
    data class Error(val message: String): RecipeViewState()
}
