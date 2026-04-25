package com.moviles.examenmoviles.data

import com.moviles.examenmoviles.R

object MockSpaces {
    val all: List<CoworkingSpace> = listOf(
        CoworkingSpace(
            id = "ESP-001",
            name = "North Hub",
            imageResId = R.drawable.ic_launcher_foreground,
            description = "Open and quiet workspace with fast internet and natural light.",
            location = "Ciudad Quesada, San Carlos",
            capacity = 18,
            pricePerHour = 3500.0,
            available = true
        ),
        CoworkingSpace(
            id = "ESP-002",
            name = "Creative Loft",
            imageResId = R.drawable.ic_launcher_foreground,
            description = "Collaborative room for teams with whiteboards and a projector.",
            location = "Florencia, San Carlos",
            capacity = 10,
            pricePerHour = 5000.0,
            available = false
        ),
        CoworkingSpace(
            id = "ESP-003",
            name = "Focus Room",
            imageResId = R.drawable.ic_launcher_foreground,
            description = "Private desks for deep work and video calls.",
            location = "Pital, San Carlos",
            capacity = 6,
            pricePerHour = 3000.0,
            available = true
        ),
        CoworkingSpace(
            id = "ESP-004",
            name = "Caribbean Point",
            imageResId = R.drawable.ic_launcher_foreground,
            description = "Flexible coworking area near public transport and food options.",
            location = "Guápiles, Limón",
            capacity = 14,
            pricePerHour = 4200.0,
            available = true
        )
    )
}
