package com.moviles.examenmoviles.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.moviles.examenmoviles.data.CoworkingSpace
import com.moviles.examenmoviles.data.MockSpaces
import com.moviles.examenmoviles.ui.components.AppBottomBar
import com.moviles.examenmoviles.ui.screens.SpaceDetailScreen
import com.moviles.examenmoviles.ui.screens.SpacesListScreen

private enum class AppScreen {
    LIST,
    DETAIL
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun CoworkingApp() {
    var currentScreen by remember { mutableStateOf(AppScreen.LIST) }
    var selectedSpace by remember { mutableStateOf<CoworkingSpace?>(null) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = if (currentScreen == AppScreen.LIST) {
                            "Coworking Spaces"
                        } else {
                            selectedSpace?.name ?: "Space Detail"
                        }
                    )
                },
                navigationIcon = {
                    if (currentScreen == AppScreen.DETAIL) {
                        IconButton(onClick = { currentScreen = AppScreen.LIST }) {
                            Text(
                                text = "←",
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            )
        },
        bottomBar = {
            AppBottomBar(
                isListSelected = currentScreen == AppScreen.LIST,
                onListSelected = {
                    currentScreen = AppScreen.LIST
                }
            )
        }
    ) { innerPadding ->
        when (currentScreen) {
            AppScreen.LIST -> {
                SpacesListScreen(
                    spaces = MockSpaces.all,
                    onSpaceSelected = { space ->
                        selectedSpace = space
                        currentScreen = AppScreen.DETAIL
                    },
                    modifier = Modifier.padding(innerPadding)
                )
            }

            AppScreen.DETAIL -> {
                SpaceDetailScreen(
                    space = selectedSpace ?: MockSpaces.all.first(),
                    onReserveClick = { },
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}
