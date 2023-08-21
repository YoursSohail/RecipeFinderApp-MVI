package com.yourssohail.recipefinderapp.ui.viewmodel

sealed class RecipeViewIntent {
    object LoadRandomRecipe : RecipeViewIntent()
    data class SearchRecipes(val query: String) : RecipeViewIntent()
}
