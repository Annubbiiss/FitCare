package com.example.fitcare.ui.screens.main.home.workout

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.fitcare.R
import com.example.fitcare.constants.Constants


@Composable
fun Slide22(){
    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxSize()
        .verticalScroll(rememberScrollState()),

    ) {
        Spacer(modifier = Modifier.height(34.dp))

        Column(modifier = Modifier
            .padding(6.dp)
            .background(Color(0xFF21D200))
            .fillMaxWidth()
            .height(114.dp),

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
                                .height(2.dp)
                                .padding(start = 5.dp)
                                .background(Color.Black)

                        ) {

                        }
                    }


                }



            }
        }

        Spacer(modifier = Modifier.height(8.dp))


            Text(text = "choice of Treadmill : jog , Bike , Cross Trainer",
                fontWeight = FontWeight.SemiBold,
                fontSize = 15.sp,
                lineHeight = 14.sp,
                color = Color(0x99FFFFFF),
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center


            )



        Spacer(modifier = Modifier.height(8.dp))

        Exercise(
            R.drawable.warm_up,
            height = 108,
            width = 36,
            text1 = "Warm up",
            text2 = "Sets / Rounds",
            text3 ="Reps / Duration" ,
            num = 1, sec = "5 Minutes")

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Circuit",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 14.sp,
            color = Color(0xFFFFFFFF),
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
            )
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Perform the Following 8 exercises as a circuit . Take2 Minutes rest between each round.",
            fontWeight = FontWeight.SemiBold,
            fontSize = 15.sp,
            lineHeight = 14.sp,
            color = Color(0xFFFFFFFF),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            maxLines = 2
        )

        Spacer(modifier = Modifier.height(12.dp))


        Exercise(
            R.drawable.squat,
            height = 89,
            width = 59,
            text1 = "Squat", text2 = "Sets / Rounds",
            text3 ="Reps / Duration" ,
            num = 3,
            sec = "25 Seconds"

        )

        Spacer(modifier = Modifier.height(22.dp))

        Exercise(
            R.drawable.isolate,
            height = 96,
            width = 54,
            text1 = "Isolated Squat Hold", text2 = "Sets / Rounds",
            text3 ="Reps / Duration" ,
            num = 1,
            sec = "25 Seconds   "

        )

        Spacer(modifier = Modifier.height(22.dp))

        Exercise(
            R.drawable.plank,
            height = 43,
            width = 103,
            text1 = "plank", text2 = "Sets / Rounds",
            text3 ="Reps / Duration" ,
            num = 1,
            sec = "25 Seconds   "

        )

        Spacer(modifier = Modifier.height(22.dp))

        Exercise(
            R.drawable.push_up,
            height = 55,
            width = 109,
            text1 = "Push Ups", text2 = "Sets / Rounds",
            text3 ="Reps / Duration" ,
            num = 1,
            sec = "25 Seconds   "

        )

        Spacer(modifier = Modifier.height(22.dp))

        Exercise(
            R.drawable.burpee,
            height = 94,
            width = 50,
            text1 = "Burpee", text2 = "Sets / Rounds",
            text3 ="Reps / Duration" ,
            num = 1,
            sec = "25 Seconds   "

        )

        Spacer(modifier = Modifier.height(22.dp))

        Exercise(
            R.drawable.glut,
            height = 100,
            width = 130,
            text1 = "Glut Bridge", text2 = "Sets / Rounds",
            text3 ="Reps / Duration" ,
            num = 1,
            sec = "25 Seconds   "

        )

        Spacer(modifier = Modifier.height(22.dp))

        Exercise(
            R.drawable.split,
            height = 350,
            width = 100,
            text1 = "Split Squat", text2 = "Sets / Rounds",
            text3 ="Reps / Duration" ,
            num = 1,
            sec = "25 Seconds   "

        )

        Spacer(modifier = Modifier.height(22.dp))

        Exercise(
            R.drawable.lunges_left,
            height = 98,
            width = 130,
            text1 = "Lunges", text2 = "Sets / Rounds",
            text3 ="Reps / Duration" ,
            num = 1,
            sec = "25 Seconds   "

        )

        Spacer(modifier = Modifier.height(22.dp))

        Exercise(
            R.drawable.lunges_right,
            height = 98,
            width = 130,
            text1 = "Reverse Lunges", text2 = "Sets / Rounds",
            text3 ="Reps / Duration" ,
            num = 1,
            sec = "25 Seconds   "

        )

        Spacer(modifier = Modifier.height(22.dp))

        Exercise(
            R.drawable.high_knee,
            height = 96,
            width = 31,
            text1 = "High Knees Run In Place", text2 = "Sets / Rounds",
            text3 ="Reps / Duration" ,
            num = 1,
            sec = "25 Seconds   "

        )

        Spacer(modifier = Modifier.height(44.dp))

        Text(text = "Choice of Walk ot Jog",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 14.sp,
            color = Color(0xFFFFFFFF),
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center


        )

        Spacer(modifier = Modifier.height(44.dp))

        Exercise(
            R.drawable.cool_down,
            height = 75,
            width = 103,
            text1 = "Cool Down", text2 = "Sets / Rounds",
            text3 ="Reps / Duration" ,
            num = 1,
            sec = "25 Seconds   "

        )

        Spacer(modifier = Modifier.height(44.dp))


        Button(onClick = {}
            ,
            colors = ButtonDefaults.buttonColors (Color.White),
            shape = RoundedCornerShape(size = 15.dp),
            modifier = Modifier
                .padding(start = 86.dp, end = 86.dp)
                .width(264.dp)
                .height(44.dp)
                .border(
                    width = 1.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(size = 15.dp)
                )

        ){
            Row(
            modifier = Modifier
                .fillMaxSize()
            ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly

        ){

            Icon(painter = painterResource(id = R.drawable.play),
                contentDescription = "",
                modifier = Modifier
                    .size(30.dp)
                //.clickable { navHostController.navigate(Constants.BMICALC.route) }
                ,
                tint = Color.Black
            )

            Spacer(modifier = Modifier.width(4.dp))

            Text(text = "Play Workouts",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                color = Color.Black

            )

        }
        }

        Column(modifier = Modifier
            .padding(16.dp)
            .background(Color.Black)
            .fillMaxWidth()
            .height(120.dp)

        ) {

        }
    }
}

@Composable
fun Exercise(id:Int,height:Int,width: Int,
    text1:String, text2:String, text3:String, num:Int,sec:String ){
    Row(
        modifier = Modifier
            .padding(6.dp)
            .background(Color(0xFF21D200))
            .fillMaxWidth()
            .height(120.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly

    ) {
        Image(painter = painterResource(id = id),
            contentDescription = "",
            modifier = Modifier
                .padding(8.dp)
                .height(height.dp)
                .width(width.dp)
            ,
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column {
            Text(text = text1,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                lineHeight = 14.sp,
                color = Color(0xFF080402),
                modifier = Modifier
                    .padding(start = 6.dp, end = 22.dp)
                //.clickable {   }


            )
            Spacer(modifier = Modifier.height(16.dp))

            Row {
                Column( modifier = Modifier
                    .padding(start = 6.dp, end = 22.dp)) {
                    Text(text = text2,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 12.sp,
                        lineHeight = 14.sp,
                        color = Color(0xFF080402),
                        modifier = Modifier
                            .padding(top = 8.dp)
                        //.clickable {   }


                    )

                    Text(text = text3,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 12.sp,
                        lineHeight = 14.sp,
                        color = Color(0xFF080402),
                        modifier = Modifier
                            .padding(top = 8.dp)
                        //.clickable {   }


                    )
                }

                Spacer(modifier = Modifier.height(8.dp))


                Column( modifier = Modifier
                    .padding(start = 6.dp, end = 22.dp))  {
                    Text(text = num.toString(),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 12.sp,
                        lineHeight = 14.sp,
                        color = Color(0xFF080402),
                        modifier = Modifier
                            .padding(top = 8.dp)
                        //.clickable {   }


                    )

                    Text(text = sec,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 12.sp,
                        lineHeight = 14.sp,
                        color = Color(0xFF080402),
                        modifier = Modifier
                            .padding(top = 8.dp)
                        //.clickable {   }


                    )
                }
            }




        }
    }
}