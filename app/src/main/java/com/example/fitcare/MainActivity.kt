package com.example.fitcare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.fitcare.ui.screens.main.home.workout.CustomTabSample
import com.example.fitcare.ui.screens.main.home.workout.PagingScreen
import com.example.fitcare.ui.screens.main.home.workout.Slide26
import com.example.fitcare.ui.screens.main.home.workout.Slide27
import com.example.fitcare.ui.screens.main.home.workout.Slide39
import com.example.fitcare.ui.theme.FitCareTheme
import com.example.fitcare.viewmodel.TestViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitCareTheme {
                // A surface container using the 'background' color from the theme
                //setUpNavGraph()
                val viewModel = TestViewModel()

                Slide39()
            }
        }
    }
}


