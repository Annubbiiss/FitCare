package com.example.fitcare.ui.screens.main.home.workout

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
fun Slide25() {
    val isCheck1 = remember { mutableStateOf(false) }
    val isCheck2 = remember { mutableStateOf(false) }
    val isCheck3 = remember { mutableStateOf(false) }
    val isCheck4 = remember { mutableStateOf(false) }
    var counter = remember { mutableStateOf(0) }
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

            Icon(painter = painterResource(id = R.drawable.back),
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

        Spacer(modifier = Modifier.height(28.dp))

        Text(text = "Today’s Habits",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 14.sp,
            color = Color(0x99FFFFFF),
            modifier = Modifier.padding(start = 34.dp)
        )
        Spacer(modifier = Modifier.height(40.dp))



        Column(Modifier.padding(8.dp)) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(62.dp)
                .background(Color.White)
                .padding(start = 18.dp, end = 18.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween

            ) {

                Text(text = "Get Up Early",
                    modifier = Modifier
                        .padding(start = 14.dp, top = 2.dp),
                    style = TextStyle(
                        fontSize = 22.sp,
                        lineHeight = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    ),
                    maxLines = 1

                )
                Card(
                    modifier = Modifier.background(Color.White),
                    elevation = CardDefaults.cardElevation(1.dp),
                    shape = CircleShape,
                    border = BorderStroke(2.dp, color = Color(0xBF3DED1D))
                ) {
                    Row(
                        modifier = Modifier
                            .size(32.dp)
                            .background(if (isCheck1.value) Color.Green else Color.Black)
                            .clickable {
                                isCheck1.value = !isCheck1.value

                                if (isCheck1.value == true) {
                                    counter.value++
                                }
                                if (isCheck1.value == false) {
                                    counter.value--
                                }

                            },
                    ) {

                    }
                }



            }

        }
        Spacer(modifier = Modifier.height(20.dp))

        Column(Modifier.padding(8.dp))  {
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(62.dp)
                .background(Color.White)
                .padding(start = 18.dp, end = 18.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween

            ) {

                Text(text = "Exercise",
                    modifier = Modifier
                        .padding(start = 14.dp, top = 2.dp),
                    style = TextStyle(
                        fontSize = 22.sp,
                        lineHeight = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    ),
                    maxLines = 1

                )
                Card(
                    modifier = Modifier.background(Color.White),
                    elevation = CardDefaults.cardElevation(1.dp),
                    shape = CircleShape,
                    border = BorderStroke(2.dp, color = Color(0xBF3DED1D))
                ) {
                    Row(
                        modifier = Modifier
                            .size(32.dp)
                            .background(if (isCheck2.value) Color.Green else Color.Black)
                            .clickable {
                                isCheck2.value = !isCheck2.value

                                if (isCheck2.value == true) {
                                    counter.value++
                                }
                                if (isCheck2.value == false) {
                                    counter.value--
                                }

                            },
                    ) {

                    }
                }



            }

        }
        Spacer(modifier = Modifier.height(20.dp))

        Column(Modifier.padding(8.dp))  {
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(62.dp)
                .background(Color.White)
                .padding(start = 18.dp, end = 18.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween

            ) {

                Text(text = "Meal prep for the week",
                    modifier = Modifier
                        .padding(start = 14.dp, top = 2.dp),
                    style = TextStyle(
                        fontSize = 22.sp,
                        lineHeight = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    ),
                    maxLines = 1

                )
                Card(
                    modifier = Modifier.background(Color.White),
                    elevation = CardDefaults.cardElevation(1.dp),
                    shape = CircleShape,
                    border = BorderStroke(2.dp, color = Color(0xBF3DED1D))
                ) {
                    Row(
                        modifier = Modifier
                            .size(32.dp)
                            .background(if (isCheck3.value) Color.Green else Color.Black)
                            .clickable {
                                isCheck3.value = !isCheck3.value

                                if (isCheck3.value == true) {
                                    counter.value++
                                }
                                if (isCheck3.value == false) {
                                    counter.value--
                                }

                            },
                    ) {

                    }
                }



            }

        }
        Spacer(modifier = Modifier.height(20.dp))

         Column(Modifier.padding(8.dp)) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(62.dp)
                .background(Color.White)
                .padding(start = 18.dp, end = 18.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween

            ) {

                Text(text = "Drink Enough Water",
                    modifier = Modifier
                        .padding(start = 14.dp, top = 2.dp),
                    style = TextStyle(
                        fontSize = 22.sp,
                        lineHeight = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    ),
                    maxLines = 1

                )
                Card(
                    modifier = Modifier.background(Color.White),
                    elevation = CardDefaults.cardElevation(1.dp),
                    shape = CircleShape,
                    border = BorderStroke(2.dp, color = Color(0xBF3DED1D))
                ) {
                    Row(
                        modifier = Modifier
                            .size(32.dp)
                            .background(if (isCheck4.value) Color.Green else Color.Black)
                            .clickable {
                                isCheck4.value = !isCheck4.value

                                if (isCheck4.value == true) {
                                    counter.value++
                                }
                                if (isCheck4.value == false) {
                                    counter.value--
                                }

                            },
                    ) {

                    }
                }



            }

        }
        Spacer(modifier = Modifier.height(28.dp))

        Row(
            Modifier
                .padding(22.dp)
                .clip(RoundedCornerShape(60.dp))
                .background(Color(0x99FFFFFF))
                .fillMaxWidth()
                .height(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ){

        }

        Text(text = "${counter.value} of 4 completed",
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 14.sp,
            color = Color(0x99FFFFFF),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(start = 34.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(32.dp))

        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Image(painter = painterResource(id = R.drawable.add),
                contentDescription = "",
                modifier = Modifier
                    .size(46.dp),
                //.clickable { navHostController.navigate(Constants.BMICALC.route) }

            )
        }

    }
}

