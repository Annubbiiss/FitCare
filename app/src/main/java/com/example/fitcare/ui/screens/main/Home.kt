@file:JvmName("HomeKt")

package com.example.fitcare.ui.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.fitcare.R

@Composable
fun HomeScreen(navHostController: NavHostController){
Column() {
    Spacer(modifier = Modifier.height(46.dp))

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        ,
        verticalAlignment = Alignment.CenterVertically,

    ) {
        Image(painter = painterResource(id = R.drawable.profilepic),
            contentDescription = "",
            modifier = Modifier
                .size(50.dp),
            contentScale = ContentScale.Crop
        )
        
        Spacer(modifier = Modifier.width(12.dp))
        Text(text = "Hi , Andrew",
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp,
            lineHeight = 14.sp,
            color = Color.White

        )
        Spacer(modifier = Modifier.width(140.dp))

        Image(painter = painterResource(id = R.drawable.crown),
            contentDescription = "",
            modifier = Modifier
                .size(42.dp),
            contentScale = ContentScale.Crop
            )

    }
    Spacer(modifier = Modifier.height(28.dp))

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(82.dp)
        .padding(16.dp)
        .background( Color(0xFF21D200))
        ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

        ){
        Text(text = "Your BMI",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 14.sp,

        )
        Icon(painter = painterResource(id = R.drawable.arrow_next),
            contentDescription = "",
            modifier = Modifier
            //    .size(42.dp)
            ,
        )

    }
}
}