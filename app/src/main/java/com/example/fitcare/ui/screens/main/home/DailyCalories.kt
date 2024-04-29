package com.example.fitcare.ui.screens.main.home

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.fitcare.R

@Composable
fun DailyCaloriesScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())

    ) {

        Spacer(modifier = Modifier.height(48.dp))

        Row {
            Icon(painter = painterResource(id = R.drawable.back),
                contentDescription = "",
                tint = Color.Green
                ,
                modifier = Modifier
                    .size(20.dp)
                    .padding(top = 6.dp)
                    .clickable { navController.popBackStack() }
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(text = "Daily Calories Dairy",
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp,
                lineHeight = 14.sp,
                color = Color.White

            )
        }
        Spacer(modifier = Modifier.height(48.dp))

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()

        ) {

            Icon(painter = painterResource(id = R.drawable.back),
                contentDescription = "",
                tint = Color.Green
                ,
                modifier = Modifier
                    .size(20.dp)
            )
            Column(modifier = Modifier
                .padding(8.dp)) {

                Row(modifier = Modifier
                    .width(346.dp)
                    .height(60.dp)
                    .background(Color(0xFFD9D9D9)),
                    verticalAlignment = Alignment.Top

                ){

                }
                Spacer(modifier = Modifier.height(8.dp))

                Row(modifier = Modifier
                    .width(346.dp)
                    .height(60.dp)
                    .background(Color(0xFF21D200)),
                    verticalAlignment = Alignment.Bottom

                ){

                }

            }

            Icon(painter = painterResource(id = R.drawable.vector),
                contentDescription = "",
                tint = Color.Green
                ,
                modifier = Modifier
                    .size(20.dp)
            )

        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)

            .height(182.dp)
            .background(Color(0xFF21D200)),

        ) {

            Row(verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Text(text = "Calories",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    lineHeight = 14.sp,
                    color = Color.Black

                )

            }
            Spacer(modifier = Modifier.height(8.dp))

            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .padding(start = 262.dp)
            ) {
                Text(text = "1800/2800 kcal",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    color = Color.White

                )

            }


            Row(modifier = Modifier
                .fillMaxWidth()
                ,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ) {
                Column(modifier = Modifier
                    .width(88.dp)
                    .height(20.dp)
                    .background(Color(0xFFBDB2D0))
                ) {

                }

                Column(modifier = Modifier
                    .width(124.dp)
                    .height(20.dp)
                    .background(Color(0xFF548CAC))

                ) {

                }

                Column(modifier = Modifier
                    .width(72.dp)
                    .height(20.dp)
                    .background(Color(0xFFF4B628))

                ) {

                }

                Column(modifier = Modifier
                    .width(72.dp)
                    .height(14.dp)
                    .background(Color.Black)

                ) {

                }

            }
            Spacer(modifier = Modifier.height(16.dp))

            Row(verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Text(text = "Macros",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                    lineHeight = 14.sp,
                    color = Color.Black

                )

            }

            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "Pro : 27 / 107",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    color = Color.Black

                )

                Text(text = "Fats : 14 / 40",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    color = Color.Black

                )

                Text(text = "Carbs: 45 / 128",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    color = Color.Black

                )


            }

        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(text = "Food Log",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                color = Color.White

            )

        }

          Row(verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start,
        ) {
              AddFood(text = "breakfast", calories = 0)
        }

        Spacer(modifier = Modifier.height(8.dp))

        
        Row(verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start,
        ) {
              AddFood(text = "Lunch", calories = 0)
        }

        Spacer(modifier = Modifier.height(8.dp))


        Row(verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start,
        ) {
              AddFood(text = "Diner", calories = 0)
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
fun AddFood(text:String,calories:Int){
   Column( modifier = Modifier
       .fillMaxWidth()
       .padding(16.dp)
       .height(130.dp)
       .background(Color(0xFF21D200)),
   ){
       Row(verticalAlignment = Alignment.CenterVertically,
           horizontalArrangement = Arrangement.SpaceBetween,
           modifier = Modifier
               .padding(8.dp)
               .fillMaxWidth()) {
           Text(text = text,
               fontWeight = FontWeight.SemiBold,
               fontSize = 20.sp,
               lineHeight = 14.sp,
               color = Color.White

           )
           Text(text = "$calories Kcal",
               fontWeight = FontWeight.SemiBold,
               fontSize = 20.sp,
               lineHeight = 14.sp,
               color = Color.White

           )

       }
       Spacer(modifier = Modifier.height(16.dp))

       Row(
           Modifier
               .fillMaxWidth()
               .height(2.dp)
               .background(Color.White)) {

       }
       Spacer(modifier = Modifier.height(16.dp))

       Button(onClick = { /*TODO*/ },
           colors = ButtonDefaults.buttonColors (Color(0xFF080402)),
           modifier = Modifier
               .padding(start = 32.dp, end = 32.dp)
               .fillMaxWidth()
               .height(34.dp)
           ,
           shape = RoundedCornerShape(size = 10.dp),


       ) {
           Row(
               horizontalArrangement = Arrangement.Center,
               verticalAlignment = Alignment.CenterVertically
           ) {
               Text(
                   text = "+    ",
                   style = TextStyle(
                       fontSize = 18.sp,
                       lineHeight = 14.sp,
                       //fontFamily = FontFamily(Font(R.font.inter)),
                       fontWeight = FontWeight(500),
                       color = Color(0xFFFFFFFF),
                       textAlign = TextAlign.Center,
                   )
               )
               Text(
                   text = "Add Food",
                   style = TextStyle(
                       fontSize = 18.sp,
                       lineHeight = 14.sp,
                       //fontFamily = FontFamily(Font(R.font.inter)),
                       fontWeight = FontWeight(500),
                       color = Color(0xFFFFFFFF),
                       textAlign = TextAlign.Center,
                   )
               )
           }

       }


   }
}