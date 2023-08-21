package com.yourssohail.recipefinderapp.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.yourssohail.recipefinderapp.data.model.Meal

@Composable
fun RecipeListItem(meal: Meal) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(4.dp),
        border = BorderStroke(1.dp, Color.LightGray),
        colors = CardDefaults.cardColors(
            Color.White
        )
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            if (!meal.strMealThumb.isNullOrEmpty()) {
                AsyncImage(
                    model = meal.strMealThumb,
                    contentDescription = "thumbnail",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(
                            RoundedCornerShape(8.dp)
                        )
                )
            }
            Spacer(modifier = Modifier.padding(4.dp))
            Text(
                text = meal.strMeal ?: "",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Text(
                text = "Ingredients",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = getIngredients(meal)
            )
            Spacer(modifier = Modifier.padding(8.dp))

            AnimatedVisibility(visible = expanded) {
                Column {
                    Text(
                        text = "Instructions",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = meal.strInstructions ?: ""
                    )
                }
            }
            Column(
                modifier =
                Modifier
                    .fillMaxWidth()
                    .clickable {
                        expanded = !expanded
                    }) {
                Icon(
                    imageVector = if (expanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                    contentDescription = "Clear",
                    tint = Color.Black,
                    modifier = Modifier
                        .align(
                            Alignment.CenterHorizontally
                        )

                )
            }

        }
    }
}

fun getIngredients(meal: Meal): String {
    var ingredients = ""

    with(meal) {
        if (!strIngredient1.isNullOrEmpty()) ingredients += "$strIngredient1 - $strMeasure1\n"
        if (!strIngredient2.isNullOrEmpty()) ingredients += "$strIngredient2 - $strMeasure2\n"
        if (!strIngredient3.isNullOrEmpty()) ingredients += "$strIngredient3 - $strMeasure3\n"
        if (!strIngredient4.isNullOrEmpty()) ingredients += "$strIngredient4 - $strMeasure4\n"
        if (!strIngredient5.isNullOrEmpty()) ingredients += "$strIngredient5 - $strMeasure5\n"
        if (!strIngredient6.isNullOrEmpty()) ingredients += "$strIngredient6 - $strMeasure6\n"
        if (!strIngredient7.isNullOrEmpty()) ingredients += "$strIngredient7 - $strMeasure7\n"
        if (!strIngredient8.isNullOrEmpty()) ingredients += "$strIngredient8 - $strMeasure8\n"
        if (!strIngredient9.isNullOrEmpty()) ingredients += "$strIngredient9 - $strMeasure9\n"
        if (!strIngredient10.isNullOrEmpty()) ingredients += "$strIngredient10 - $strMeasure10\n"
        if (!strIngredient11.isNullOrEmpty()) ingredients += "$strIngredient11 - $strMeasure11\n"
        if (!strIngredient12.isNullOrEmpty()) ingredients += "$strIngredient12 - $strMeasure12\n"
        if (!strIngredient13.isNullOrEmpty()) ingredients += "$strIngredient13 - $strMeasure13\n"
        if (!strIngredient14.isNullOrEmpty()) ingredients += "$strIngredient14 - $strMeasure14\n"
        if (!strIngredient15.isNullOrEmpty()) ingredients += "$strIngredient15 - $strMeasure15\n"
        if (!strIngredient16.isNullOrEmpty()) ingredients += "$strIngredient16 - $strMeasure16\n"
        if (!strIngredient17.isNullOrEmpty()) ingredients += "$strIngredient17 - $strMeasure17\n"
        if (!strIngredient18.isNullOrEmpty()) ingredients += "$strIngredient18 - $strMeasure18\n"
        if (!strIngredient19.isNullOrEmpty()) ingredients += "$strIngredient19 - $strMeasure19\n"
        if (!strIngredient20.isNullOrEmpty()) ingredients += "$strIngredient20 - $strMeasure20\n"
    }
    return ingredients.trimEnd('\n')
}
