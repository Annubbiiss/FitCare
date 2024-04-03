package com.example.fitcare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.fitcare.navigation.setUpNavGraph
import com.example.fitcare.ui.theme.FitCareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitCareTheme {
                // A surface container using the 'background' color from the theme
                setUpNavGraph()

            }
        }
    }
}


