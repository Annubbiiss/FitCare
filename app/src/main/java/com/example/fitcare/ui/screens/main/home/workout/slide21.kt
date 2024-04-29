package com.example.fitcare.ui.screens.main.home.workout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitcare.R

@Composable
fun Slide21(){
    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Column(modifier = Modifier
            .padding(6.dp)
            .background(Color(0xFF21D200))
            .fillMaxWidth()
            .height(114.dp)

        ) {
            Row(Modifier.padding(8.dp)) {
                Icon(painter = painterResource(id = R.drawable.back),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(top = 6.dp)
                        .size(16.dp)
                        //.clickable { navHostController.navigate(Constants.BMICALC.route) }
                    ,
                )
                
                Spacer(modifier = Modifier.width(4.dp))

                Text(text = "Workout Plan",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 25.sp,
                    lineHeight = 14.sp,
                    color = Color(0xA6080402)

                )

            }
            Row(Modifier.padding(8.dp)) {

                Spacer(modifier = Modifier.width(20.dp))

                Text(text = "Bodyweight Training Program",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    lineHeight = 14.sp,
                    color = Color(0xFF080402)

                )

            }

            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start

            ) {

                Spacer(modifier = Modifier.width(20.dp))

                Text(text = "Beginner Level",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    color = Color(0xFF080402)

                )
                Spacer(modifier = Modifier.width(154.dp))

                  Text(text = "12 Week Plan",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    color = Color(0xA6080402)

                )


            }



        }

        Spacer(modifier = Modifier.height(34.dp))

        Row(
            Modifier
                .padding(6.dp)
                .background(Color(0xFF21D200))
                .fillMaxWidth()
                .height(22.dp)
                .horizontalScroll(rememberScrollState()),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            val weakNum = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
            var selectedOption by remember { mutableIntStateOf(weakNum[0]) }
            weakNum.forEach {              weakNum ->

            Column(

            ) {


                Text(text = "Week $weakNum",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    color = Color(0xA6080402),
                    modifier = Modifier
                        .padding(start = 6.dp, end = 22.dp)
                        .clickable { selectedOption = weakNum }


                )
                if (weakNum == selectedOption) {
                    Column(
                        modifier = Modifier
                            .width(58.dp)
                            .height(1.dp)
                            .padding(start = 5.dp)
                            .background(Color.Black)

                    ) {

                    }
                }


            }



            }
        }

        Spacer(modifier = Modifier.height(34.dp))


        Row(
            modifier = Modifier
                .padding(6.dp)
                .background(Color(0xFF21D200))
                .fillMaxWidth()
                .height(96.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start

        ) {
            Image(painter = painterResource(id = R.drawable.running_man_looking_and_pointing_at_his_smartwatch),
                contentDescription = "",
                modifier = Modifier
                    .padding(8.dp)
                    .size(82.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(text = "Legs , Chest , Abs & Metabolic",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    color = Color(0xFF080402),
                    modifier = Modifier
                        .padding(start = 6.dp, end = 22.dp)
                        //.clickable {   }


                )
                Spacer(modifier = Modifier.height(16.dp))


                Text(text = "Workout 1",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    color = Color(0xFF080402),
                    modifier = Modifier
                        .padding(start = 6.dp, end = 22.dp)
                        //.clickable {   }


                )
                Spacer(modifier = Modifier.height(8.dp))

             Text(text = "Exercises 10",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    color = Color(0xFF080402),
                    modifier = Modifier
                        .padding(start = 6.dp, end = 22.dp)
                        //.clickable {   }


                )

            }
        }

      Spacer(modifier = Modifier.height(34.dp))


        Row(
            modifier = Modifier
                .padding(6.dp)
                .background(Color(0xFF21D200))
                .fillMaxWidth()
                .height(96.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start

        ) {
            Image(painter = painterResource(id = R.drawable.running_man_looking_and_pointing_at_his_smartwatch),
                contentDescription = "",
                modifier = Modifier
                    .padding(8.dp)
                    .size(82.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(text = "Legs , Chest , Abs & Metabolic",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    color = Color(0xFF080402),
                    modifier = Modifier
                        .padding(start = 6.dp, end = 22.dp)
                        //.clickable {   }


                )
                Spacer(modifier = Modifier.height(16.dp))


                Text(text = "Workout 2",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    color = Color(0xFF080402),
                    modifier = Modifier
                        .padding(start = 6.dp, end = 22.dp)
                        //.clickable {   }


                )
                Spacer(modifier = Modifier.height(8.dp))

             Text(text = "Exercises 10",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    color = Color(0xFF080402),
                    modifier = Modifier
                        .padding(start = 6.dp, end = 22.dp)
                        //.clickable {   }


                )

            }
        }

      Spacer(modifier = Modifier.height(34.dp))


        Row(
            modifier = Modifier
                .padding(6.dp)
                .background(Color(0xFF21D200))
                .fillMaxWidth()
                .height(96.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start

        ) {
            Image(painter = painterResource(id = R.drawable.running_man_looking_and_pointing_at_his_smartwatch),
                contentDescription = "",
                modifier = Modifier
                    .padding(8.dp)
                    .size(82.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(text = "Legs , Chest , Abs & Metabolic",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    color = Color(0xFF080402),
                    modifier = Modifier
                        .padding(start = 6.dp, end = 22.dp)
                        //.clickable {   }


                )
                Spacer(modifier = Modifier.height(16.dp))


                Text(text = "Workout 3",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    color = Color(0xFF080402),
                    modifier = Modifier
                        .padding(start = 6.dp, end = 22.dp)
                        //.clickable {   }


                )
                Spacer(modifier = Modifier.height(8.dp))

             Text(text = "Exercises 10",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    color = Color(0xFF080402),
                    modifier = Modifier
                        .padding(start = 6.dp, end = 22.dp)
                        //.clickable {   }


                )

            }
        }

    }
}