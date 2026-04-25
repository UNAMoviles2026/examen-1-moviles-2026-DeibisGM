package com.moviles.examenmoviles.data

data class CoworkingSpace(
    val id: String,
    val name: String,
    val imageResId: Int,
    val description: String,
    val location: String,
    val capacity: Int,
    val pricePerHour: Double,
    val available: Boolean
)
