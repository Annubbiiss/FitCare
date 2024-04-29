package com.example.fitcare.ui.screens.main.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun BMIResultScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start

    ) {

        Spacer(modifier = Modifier.height(48.dp))
        Text(
            text = "Your Results",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 14.sp,
            modifier = Modifier
                .padding(16.dp),
            color = Color.White

        )

        Spacer(modifier = Modifier.height(48.dp))

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Text(
                text = "Mild Thinness",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                modifier = Modifier
                    .padding(16.dp),
                color = Color.White

            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "18.0",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                modifier = Modifier
                    .padding(16.dp),
                color = Color.Green

            )
            Spacer(modifier = Modifier.height(28.dp))
            Text(
                text = "Normal BMI range :",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                modifier = Modifier
                    .padding(16.dp),
                color = Color.White

            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "18.5 - 25 kg/m",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                modifier = Modifier
                    .padding(16.dp),
                color = Color.Green

            )

            Spacer(modifier = Modifier.height(50.dp))
            Text(
                text = "Your Age",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                modifier = Modifier
                    .padding(16.dp),
                color = Color.White

            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "21",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                modifier = Modifier
                    .padding(16.dp),
                color = Color.Green

            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Underweight",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                modifier = Modifier
                    .padding(16.dp),
                color = Color.Green

            )
        }


    }

}

