package com.moviles.examenmoviles.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.moviles.examenmoviles.data.CoworkingSpace

@Composable
fun SpaceCardItem(
    space: CoworkingSpace,
    onViewDetailClick: (CoworkingSpace) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = painterResource(id = space.imageResId),
                contentDescription = "Imagen de ${space.name}",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
            )
            Text(
                text = space.name,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = space.description,
                style = MaterialTheme.typography.bodyMedium
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.spacedBy(2.dp)
                ) {
                    Text(text = "Ubicación: ${space.location}")
                    Text(text = "Capacidad: ${space.capacity}")
                    Text(text = "Precio/hora: ₡${space.pricePerHour.toInt()}")
                    Text(
                        text = if (space.available) "Disponible" else "No disponible",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Button(
                    onClick = { onViewDetailClick(space) },
                    modifier = Modifier.height(40.dp)
                ) {
                    Text(text = "Ver")
                }
            }
        }
    }
}
