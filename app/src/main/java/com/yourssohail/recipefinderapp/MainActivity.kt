package com.yourssohail.recipefinderapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yourssohail.recipefinderapp.ui.screens.HomeScreen
import com.yourssohail.recipefinderapp.ui.theme.RecipeFinderAppTheme
import com.yourssohail.recipefinderapp.ui.viewmodel.RecipeViewModel

class MainActivity : ComponentActivity() {
    private val recipeViewModel: RecipeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeFinderAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen(recipeViewModel = recipeViewModel)
                }
            }
        }
    }
}

