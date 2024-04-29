@file:JvmName("HomeKt")

package com.example.fitcare.ui.screens.main.home

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.fitcare.R
import com.example.fitcare.constants.Constants

@Composable
fun HomeScreen(navHostController: NavHostController){

Column(
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())

) {
    Spacer(modifier = Modifier.height(24.dp))

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
        Spacer(modifier = Modifier.width(130.dp))

        Image(painter = painterResource(id = R.drawable.crown),
            contentDescription = "",
            modifier = Modifier
                .size(42.dp),
            contentScale = ContentScale.Crop
            )

    }
    Spacer(modifier = Modifier.height(22.dp))

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(82.dp)
        .padding(16.dp)
        .background(Color(0xFF21D200))
        ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

    ){
        Text(text = "Your BMI",
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp,
            lineHeight = 14.sp,
            modifier = Modifier
                .padding(10.dp)

        )
        Icon(painter = painterResource(id = R.drawable.vector),
            contentDescription = "",
            modifier = Modifier
                .padding(10.dp)
                .size(14.dp)
                .clickable { navHostController.navigate(Constants.BMICALC.route) }
            ,
        )

    }
    Spacer(modifier = Modifier.height(6.dp))

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(82.dp)
        .padding(16.dp)
        .background(Color(0xFF21D200))
        ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

        ){
        Text(text = "Your Daily Steps",
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp,
            lineHeight = 14.sp,
            modifier = Modifier
                .padding(10.dp)

        )
        Row( modifier = Modifier
            .padding(end = 10.dp)) {

            Text(text = "2568",
                Modifier.padding(end = 10.dp),
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp,
                lineHeight = 14.sp,


            )
            Icon(painter = painterResource(id = R.drawable.vector),
                contentDescription = "",

                Modifier.size(14.dp)
                    .clickable { navHostController.navigate(Constants.STEPS.route) }


            )
        }


    }

    Row(
        Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Column(modifier = Modifier
            .height(220.dp)
            .width(170.dp)
            .background(Color(0xFF21D200)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Text(text = "Workout to Fit",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                modifier = Modifier
                    .padding(10.dp)

            )
            Text(text = "Full Body Fitness Training Program",
            fontWeight = FontWeight.SemiBold,
            fontSize = 10.sp,
            lineHeight = 14.sp,
            modifier = Modifier
                .padding(10.dp)

            )
            Spacer(modifier = Modifier.height(20.dp))

            Icon(painter = painterResource(id = R.drawable.person),
                contentDescription = "",

                Modifier.size(82.dp)


            )
        }
        Spacer(modifier = Modifier.width(30.dp))


        Column(modifier = Modifier
            .height(220.dp)
            .width(170.dp)
            .background(Color(0xFF21D200)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(text = "Eat to fit",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                maxLines = 2
                ,
                modifier = Modifier
                    .padding(10.dp)

            )
            Text(text = "Meal Plan Specifically generated for you",
                fontWeight = FontWeight.SemiBold,
                fontSize = 10.sp,
                lineHeight = 14.sp,
                maxLines = 2
                ,
                modifier = Modifier
                    .padding(10.dp)

            )
            Spacer(modifier = Modifier.height(20.dp))

            Icon(painter = painterResource(id = R.drawable.eat),
                contentDescription = "",

                Modifier.size(82.dp)


            )
        }
    }

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 16.dp, end = 16.dp)
        .background(Color(0xFF21D200))

    ){
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color(0xFF21D200))
            ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ){
        Text(text = " Your Daily Calories ",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 14.sp,

        )
        Icon(painter = painterResource(id = R.drawable.vector),
            contentDescription = "",

            Modifier.size(16.dp)
                .clickable { navHostController.navigate(Constants.CALORIES.route) }
        )


        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color(0xFF21D200))
            ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ){
            Icon(painter = painterResource(id = R.drawable.back),
                contentDescription = "",

                Modifier.size(10.dp))

            Text(text = "Week 01 ",
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                lineHeight = 14.sp,

                )
            Icon(painter = painterResource(id = R.drawable.vector),
                contentDescription = "",

                Modifier.size(10.dp))


        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 32.dp, end = 48.dp, top = 8.dp)
            .background(Color(0xFF21D200))
            ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ){

            Days(text = "S")
            Days(text = "M")
            Days(text = "T")
            Days(text = "W")
            Days(text = "TH")
            Days(text = "W")

        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 32.dp, end = 48.dp, top = 8.dp)
            .background(Color(0xFF21D200))
            ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ){

            Days(text = "4")
            Days(text = "5")
            Days(text = "6")
            Days(text = "7")
            Days(text = "8")
            Days(text = "9")

        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 48.dp, end = 48.dp, top = 12.dp)
            .background(Color(0xFF21D200))
            ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ){
            Row {
                Text(text = "1998",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(text = "kcal",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 8.sp,
                    lineHeight = 14.sp,
                    modifier = Modifier.padding(top = 5.dp)
                )
            }


            Row {
                Text(text = "2800",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(text = "kcal",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 8.sp,
                    lineHeight = 14.sp,
                    modifier = Modifier.padding(top = 5.dp)
                )
            }

        }

         Row(modifier = Modifier
             .fillMaxWidth()
             .padding(start = 32.dp, end = 48.dp, top = 20.dp, bottom = 4.dp)
             .background(Color(0xFF21D200))
        ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center

        ) {
             Column(modifier = Modifier
                 .width(74.dp)
                 .height(20.dp)
                 .background(Color(0xFFBDB2D0))
             ) {

             }

        Column(modifier = Modifier
            .width(108.dp)
            .height(20.dp)
            .background(Color(0xFF548CAC))

        ) {

             }

        Column(modifier = Modifier
            .width(64.dp)
            .height(20.dp)
            .background(Color(0xFFF4B628))

        ) {

             }

        Column(modifier = Modifier
            .width(64.dp)
            .height(14.dp)
            .background(Color.Black)

        ) {

        }

        }
        Column(modifier = Modifier
            .padding(16.dp)
            .border(width = 2.dp, color = Color.Black)
            .fillMaxWidth()
            .height(140.dp)

        ) {
            Carbs(text = "carbohydrates", color = Color(0xFFBDB2D0), text2 = "120/180g")
            Proteins(text = "Proteins", color = Color(0xFF548CAC), text2 = "86/104g")
            Fats(text = "Fats", color = Color(0xFFF4B628), text2 = "23/40g")

        }

    }

    Column(modifier = Modifier
        .padding(16.dp)
        .background(Color.Black)
        .fillMaxWidth()
        .height(140.dp)

    ) {

    }
}
}



@Composable
fun Days(text:String) {
    Text(text = text,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 14.sp,
    )

}
@Composable
fun Carbs(text:String,color: Color,text2: String) {
   Row(verticalAlignment = Alignment.CenterVertically,
       horizontalArrangement = Arrangement.Center,
       modifier = Modifier.padding(10.dp)) {
       Column(modifier = Modifier
           .clip(CircleShape)
           .size(14.dp)
           .background(color)
       ) {}

Spacer(modifier = Modifier.size(6.dp))
     
           Text(text = text,
               fontWeight = FontWeight.SemiBold,
               fontSize = 20.sp,
               lineHeight = 14.sp,
           )

       Spacer(modifier = Modifier.width(112.dp))

       Row(horizontalArrangement = Arrangement.End,
           verticalAlignment = Alignment.CenterVertically) {
           Text(text = text2,
               fontWeight = FontWeight.SemiBold,
               fontSize = 12.sp,
               lineHeight = 14.sp,
           )
       }
     
   }

}

@Composable

fun Proteins(text:String,color: Color,text2: String) {
   Row(verticalAlignment = Alignment.CenterVertically,
       horizontalArrangement = Arrangement.Center,
       modifier = Modifier.padding(10.dp)) {
       Column(modifier = Modifier
           .clip(CircleShape)
           .size(14.dp)
           .background(color)
       ) {}

Spacer(modifier = Modifier.size(6.dp))

           Text(text = text,
               fontWeight = FontWeight.SemiBold,
               fontSize = 20.sp,
               lineHeight = 14.sp,
           )

       Spacer(modifier = Modifier.width(174.dp))

       Row(horizontalArrangement = Arrangement.End,
           verticalAlignment = Alignment.CenterVertically) {
           Text(text = text2,
               fontWeight = FontWeight.SemiBold,
               fontSize = 12.sp,
               lineHeight = 14.sp,
           )
       }

   }

}

@Composable

fun Fats(text:String,color: Color,text2: String) {
   Row(verticalAlignment = Alignment.CenterVertically,
       horizontalArrangement = Arrangement.Center,
       modifier = Modifier.padding(10.dp)) {
       Column(modifier = Modifier
           .clip(CircleShape)
           .size(14.dp)
           .background(color)
       ) {}

Spacer(modifier = Modifier.size(6.dp))

           Text(text = text,
               fontWeight = FontWeight.SemiBold,
               fontSize = 20.sp,
               lineHeight = 14.sp,
           )

       Spacer(modifier = Modifier.width(220.dp))

       Row(horizontalArrangement = Arrangement.End,
           verticalAlignment = Alignment.CenterVertically) {
           Text(text = text2,
               fontWeight = FontWeight.SemiBold,
               fontSize = 12.sp,
               lineHeight = 14.sp,
           )
       }

   }

}


