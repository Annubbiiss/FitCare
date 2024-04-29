package com.example.fitcare.ui.screens.main.home.workout

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import com.example.fitcare.R
import com.example.fitcare.ui.screens.main.home.DailySteps

@Composable
fun Slide26(){

    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxSize()
        .verticalScroll(rememberScrollState()),

        ){
        Spacer(modifier = Modifier.height(32.dp))

        Row(
            Modifier
                .padding(8.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFF21D200))
                .fillMaxWidth()
                .height(48.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {

            Spacer(modifier = Modifier.width(18.dp))

            Icon(
                painter = painterResource(id = R.drawable.back),
                contentDescription = "",
                modifier = Modifier
                    //.padding(top = 6.dp)
                    .size(16.dp)
                //.clickable { navHostController.navigate(Constants.BMICALC.route) }
                ,
            )

            Spacer(modifier = Modifier.width(14.dp))

            Text(text = "Habits & Goals",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                color = Color.Black

            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Weekly Habits",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 14.sp,
            color = Color(0x99FFFFFF),
            modifier = Modifier.padding(start = 34.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))
        WeeklyHabits(text1 = "Get Up early", text2 = "Every Day")

        Spacer(modifier = Modifier.height(32.dp))
        WeeklyHabits(text1 = "Get Up early", text2 = "Every Day")

        Spacer(modifier = Modifier.height(32.dp))
        WeeklyHabits(text1 = "Get Up early", text2 = "Every Day")
        Spacer(modifier = Modifier.height(32.dp))

        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors (Color.White),
            shape = RoundedCornerShape(size = 20.dp),
            modifier = Modifier

                .padding(start = 48.dp, end = 48.dp)
                .border(
                    width = 2.dp,
                    color =Color(0xFF21D200),
                    shape = RoundedCornerShape(size = 20.dp)
                )
                .fillMaxWidth()
                .height(37.dp)
                        ,


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
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                    )
                )
                Text(
                    text = "Add Habit",
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 14.sp,
                        //fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                    )
                )
            }
        }

    }
}

@Composable
fun WeeklyHabits(text1: String,text2: String){

    Column(
        Modifier
            .padding(8.dp)
            .background(Color(0xFF21D200))
            .fillMaxWidth()
            .height(132.dp),
        verticalArrangement = Arrangement.SpaceBetween,
    ){
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = text1,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                lineHeight = 14.sp,
                modifier = Modifier
                    .padding(16.dp),
                color = Color.Black

            )
            Text(
                text = text2,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                lineHeight = 14.sp,
                modifier = Modifier
                    .padding(16.dp),
                color = Color.Black

            )

        }
        Spacer(modifier = Modifier.height(12.dp))

        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 18.dp, end = 18.dp, bottom = 6.dp),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween) {
            DailyStep(text = "S", color = Color(0xFFFF0000) )
            DailyStep(text = "M", color = Color(0xFFFFFF00) )
            DailyStep(text = "T", color = Color(0xFFFFC0CB) )
            DailyStep(text = "W", color = Color(0xFF008000) )
            DailyStep(text = "TH", color = Color(0xFFFFA500) )
            DailyStep(text = "F", color = Color(0xFF00BFFF) )
            DailyStep(text = "S", color = Color(0xFF800080) )
        }

    }
}
@Composable
fun DailyStep(text:String,color: Color) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(10.dp)) {

        Text(text = text,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            lineHeight = 14.sp,
        )

        Spacer(modifier = Modifier.size(10.dp))

        Row(modifier = Modifier
            .clip(CircleShape)
            .size(14.dp)
            .background(color)
        ) {}



    }

}