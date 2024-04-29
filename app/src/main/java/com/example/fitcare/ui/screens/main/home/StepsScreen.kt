package com.example.fitcare.ui.screens.main.home

import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.fitcare.R

@Composable
fun DailyStepsScreen(navController: NavHostController) {
    Column( modifier = Modifier
        .background(Color.Black)
        .fillMaxSize()
        .padding(8.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
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

            Text(text = "Your Daily Steps",
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp,
                lineHeight = 14.sp,
                color = Color.White

                )
        }


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 8.dp, top = 32.dp, end = 8.dp, bottom = 8.dp)
                ,
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp)
                    .background(Color(0xFF21D200))

            )
            {
                Column(modifier = Modifier
                    .clip(CircleShape)
                    .size(96.dp)
                    .background(Color.Black),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "7568",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 25.sp,
                        lineHeight = 14.sp,
                        modifier = Modifier,
                        color = Color.White

                    )
                    Text(
                        text = "steps",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    lineHeight = 14.sp,
                    modifier = Modifier,
                    color = Color.White

                    )
                }

            }

            Spacer(modifier = Modifier.height(48.dp))



            Row(verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(142.dp)
                    .background(Color(0xFF21D200))

            )
            {
                Column()
                 {
                    Text(
                        text = "Summary ",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        lineHeight = 14.sp,
                        modifier = Modifier
                            .padding(12.dp),
                        color = Color.Black

                    )
                     Row() {
                         Column( )
                         {
                             Text(
                                 text = "6 km",
                                 fontWeight = FontWeight.SemiBold,
                                 fontSize = 20.sp,
                                 lineHeight = 14.sp,
                                 modifier = Modifier
                                     .padding(8.dp),
                                 color = Color.White

                             )
                             Text(
                                 text = "Distance",
                                 fontWeight = FontWeight.SemiBold,
                                 fontSize = 20.sp,
                                 lineHeight = 14.sp,
                                 modifier = Modifier
                                     .padding(8.dp),
                                 color = Color.Black

                             )

                         }

                         Column(
                             Modifier
                                 .background(Color.Black)
                                 .height(78.dp)
                                 .width(1.dp)
                         ) {

                         }

                         Column( )
                         {
                             Text(
                                 text = "5432",
                                 fontWeight = FontWeight.SemiBold,
                                 fontSize = 20.sp,
                                 lineHeight = 14.sp,
                                 modifier = Modifier
                                     .padding(8.dp),
                                 color = Color.White

                             )
                             Text(
                                 text = "Steps Remaining",
                                 fontWeight = FontWeight.SemiBold,
                                 fontSize = 20.sp,
                                 lineHeight = 14.sp,
                                 modifier = Modifier
                                     .padding(8.dp),
                                 color = Color.Black

                             )

                         }
                         Column(
                             Modifier
                                 .background(Color.Black)
                                 .height(78.dp)
                                 .width(1.dp)
                         ) {

                         }
                         Column()
                         {
                             Text(
                                 text = "10 km",
                                 fontWeight = FontWeight.SemiBold,
                                 fontSize = 20.sp,
                                 lineHeight = 14.sp,
                                 modifier = Modifier
                                     .padding(8.dp),
                                 color = Color.White

                             )
                             Text(
                                 text = "Goal",
                                 fontWeight = FontWeight.SemiBold,
                                 fontSize = 20.sp,
                                 lineHeight = 14.sp,
                                 modifier = Modifier
                                     .padding(start = 12.dp, top = 8.dp),
                                 color = Color.Black

                             )

                         }
                     }



                 }

            }
            Spacer(modifier = Modifier.height(48.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(210.dp)
                    .background(Color(0xFF21D200))

            ){

                Column(verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                    ) {
                    Text(
                        text = "Your Daily Steps Goal",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        lineHeight = 14.sp,
                        modifier = Modifier
                            .padding(start = 16.dp, top = 16.dp),
                        color = Color.Black

                    )
                }
                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                    Text(
                        text = "Last 7 days",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                        lineHeight = 14.sp,
                        modifier = Modifier
                            .padding(16.dp),
                        color = Color.White

                    )
                    Text(
                            text = "4/7 Archived",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    modifier = Modifier
                        .padding(16.dp),
                    color = Color.White

                    )

                }
                Spacer(modifier = Modifier.height(48.dp))

                Row(Modifier.fillMaxWidth()
                    .padding(start = 18.dp, end = 18.dp),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    DailySteps(text = "S", color = Color(0xFFFF0000) )
                    DailySteps(text = "M", color = Color(0xFFFFFF00) )
                    DailySteps(text = "T", color = Color(0xFFFFC0CB) )
                    DailySteps(text = "W", color = Color(0xFF008000) )
                    DailySteps(text = "TH", color = Color(0xFFFFA500) )
                    DailySteps(text = "F", color = Color(0xFF00BFFF) )
                    DailySteps(text = "S", color = Color(0xFF800080) )
                }
            }


        }


    }

}



@Composable
fun DailySteps(text:String,color: Color) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(10.dp)) {
        Row(modifier = Modifier
            .clip(CircleShape)
            .size(14.dp)
            .background(color)
        ) {}

        Spacer(modifier = Modifier.size(10.dp))

        Text(text = text,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            lineHeight = 14.sp,
        )
        
    }

}