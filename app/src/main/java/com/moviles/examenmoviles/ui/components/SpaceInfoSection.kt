package com.moviles.examenmoviles.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import com.moviles.examenmoviles.data.CoworkingSpace

@Composable
fun SpaceInfoSection(
    space: CoworkingSpace,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = space.name,
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = space.description,
            style = MaterialTheme.typography.bodyLarge
        )
        Text(text = "Ubicación: ${space.location}")
        Text(text = "Capacidad: ${space.capacity} personas")
        Text(text = "Precio por hora: ₡${space.pricePerHour.toInt()}")
        Text(text = "Estado: ${if (space.available) "Disponible" else "No disponible"}")
    }
}
