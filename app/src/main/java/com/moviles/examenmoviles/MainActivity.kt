package com.moviles.examenmoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.moviles.examenmoviles.ui.CoworkingApp
import com.moviles.examenmoviles.ui.theme.ExamenMovilesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExamenMovilesTheme {
                CoworkingApp()
            }
        }
    }
}
