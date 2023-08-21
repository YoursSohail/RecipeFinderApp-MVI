package com.yourssohail.recipefinderapp.data.model


import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable


@Serializable
data class MealResponse(
    @SerializedName("meals")
    val meals: List<Meal>
)