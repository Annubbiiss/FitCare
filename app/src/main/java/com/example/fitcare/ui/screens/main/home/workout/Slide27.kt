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

@Composable
fun Slide27(){

    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxSize()
        .verticalScroll(rememberScrollState()),

) {
    Spacer(modifier = Modifier.height(32.dp))

    Row(
        Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .height(48.dp),
        verticalAlignment = Alignment.CenterVertically,
        //horizontalArrangement = Arrangement.Start
    ) {

        Spacer(modifier = Modifier.width(18.dp))

        Icon(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "",
            modifier = Modifier
                //.padding(top = 6.dp)
                .size(16.dp),
            tint = Color.Green
            //.clickable { navHostController.navigate(Constants.BMICALC.route) }
            ,
        )

        Spacer(modifier = Modifier.width(14.dp))

        Text(
            text = "Water Intake Tracer",
            fontWeight = FontWeight.SemiBold,
            fontSize = 25.sp,
            lineHeight = 14.sp,
            color = Color.White

        )

    }

        Spacer(modifier = Modifier.height(62.dp))

        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Log your water intake",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                color = Color.White

            )
        }
        Spacer(modifier = Modifier.height(62.dp))

        Column(
            Modifier
                .padding(start = 60.dp, end = 60.dp)
                .background(Color.White)
                .border(
                    width = 2.dp,
                    color = Color(0xFF21D200),
                )
                .height(120.dp)
                .width(312.dp)
            ,
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            Text(
                text = "Total volume",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                color = Color.Black

            )

            //Spacer(modifier = Modifier.height(40.dp))

            Text(
                text = "0 ml",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                color = Color.Black

            )
        }

        Spacer(modifier = Modifier.height(60.dp))

        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Text(
                text = "Your Daily Goal :",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                color = Color.White,

            )
             Text(
                text = " 1500 ml",
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                lineHeight = 14.sp,
                color = Color(0xFF21D200),

            )


        }

        Spacer(modifier = Modifier.height(100.dp))

        Row(

            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){

          Column {
              Icon(
                  painter = painterResource(id = R.drawable.mug),
                  contentDescription = "",
                  modifier = Modifier
                      //.padding(top = 6.dp)
                      .width(37.dp)
                      .height(28.dp),
                  tint = Color.Green
                  //.clickable { navHostController.navigate(Constants.BMICALC.route) }
                  ,
              )

              Spacer(modifier = Modifier.height(14.dp))

              Text(
                  text = "250 ml",
                  fontWeight = FontWeight.SemiBold,
                  fontSize = 12.sp,
                  lineHeight = 14.sp,
                  color = Color.White

              )

              Spacer(modifier = Modifier.height(14.dp))

              Column(modifier = Modifier
                  .clip(CircleShape)
                  .size(34.dp)
                  .background(Color.White),
                  verticalArrangement = Arrangement.Center,
                  horizontalAlignment = Alignment.CenterHorizontally
              ){
                  Icon(
                      painter = painterResource(id = R.drawable.plus),
                      contentDescription = "",
                      modifier = Modifier
                          //.padding(top = 6.dp)
                          .size(14.dp),
                      //.clickable { navHostController.navigate(Constants.BMICALC.route) }

                  )
              }

          }

            Column {
                Icon(
                    painter = painterResource(id = R.drawable.drink),
                    contentDescription = "",
                    modifier = Modifier
                        //.padding(top = 6.dp)
                        .width(37.dp)
                        .height(28.dp),
                    tint = Color.Green
                    //.clickable { navHostController.navigate(Constants.BMICALC.route) }
                    ,
                )

                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = "500 ml",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    color = Color.White

                )

                Spacer(modifier = Modifier.height(20.dp))

                Column(modifier = Modifier
                    .clip(CircleShape)
                    .size(34.dp)
                    .background(Color.White),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        painter = painterResource(id = R.drawable.plus),
                        contentDescription = "",
                        modifier = Modifier
                            //.padding(top = 6.dp)
                            .size(14.dp),
                        //.clickable { navHostController.navigate(Constants.BMICALC.route) }

                    )
                }

            }
            Column {
                Icon(
                    painter = painterResource(id = R.drawable.water),
                    contentDescription = "",
                    modifier = Modifier
                        //.padding(top = 6.dp)
                        .width(37.dp)
                        .height(28.dp),
                    tint = Color.Green
                    //.clickable { navHostController.navigate(Constants.BMICALC.route) }
                    ,
                )

                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = "1000 ml",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    color = Color.White

                )

                Spacer(modifier = Modifier.height(20.dp))

                Column(modifier = Modifier
                    .clip(CircleShape)
                    .size(34.dp)
                    .background(Color.White),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        painter = painterResource(id = R.drawable.plus),
                        contentDescription = "",
                        modifier = Modifier
                            //.padding(top = 6.dp)
                            .size(14.dp),
                        //.clickable { navHostController.navigate(Constants.BMICALC.route) }

                    )
                }

            }
            Column {
                Icon(
                    painter = painterResource(id = R.drawable.custom),
                    contentDescription = "",
                    modifier = Modifier
                        //.padding(top = 6.dp)
                        .width(37.dp)
                        .height(28.dp),
                    tint = Color.Green
                    //.clickable { navHostController.navigate(Constants.BMICALC.route) }
                    ,
                )

                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = "Custom",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    color = Color.White,
                    maxLines = 2

                )
                Text(
                    text = "amount",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    color = Color.White,
                    maxLines = 2

                )


                Spacer(modifier = Modifier.height(8.dp))

                Column(modifier = Modifier
                    .clip(CircleShape)
                    .size(34.dp)
                    .background(Color.White),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        painter = painterResource(id = R.drawable.plus),
                        contentDescription = "",
                        modifier = Modifier
                            //.padding(top = 6.dp)
                            .size(14.dp),
                        //.clickable { navHostController.navigate(Constants.BMICALC.route) }

                    )
                }

            }
        }
        Spacer(modifier = Modifier.height(52.dp))

        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors (Color(0xFF21D200)),
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
                    text = "Save",
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

