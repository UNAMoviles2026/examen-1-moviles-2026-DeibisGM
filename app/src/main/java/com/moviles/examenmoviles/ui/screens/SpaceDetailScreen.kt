package com.moviles.examenmoviles.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.moviles.examenmoviles.data.CoworkingSpace
import com.moviles.examenmoviles.ui.components.ReservationButton
import com.moviles.examenmoviles.ui.components.SpaceInfoSection

@Composable
fun SpaceDetailScreen(
    space: CoworkingSpace,
    onReserveClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Image(
                painter = painterResource(id = space.imageResId),
                contentDescription = "Imagen de ${space.name}",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
            )
            SpaceInfoSection(space = space)
            ReservationButton(onClick = onReserveClick)
        }
    }
}
