package com.moviles.examenmoviles.ui.components

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun AppBottomBar(
    isListSelected: Boolean,
    onListSelected: () -> Unit
) {
    NavigationBar {
        NavigationBarItem(
            selected = isListSelected,
            onClick = onListSelected,
            icon = { Text(text = "L") },
            label = { Text(text = "Lista") }
        )
    }
}
