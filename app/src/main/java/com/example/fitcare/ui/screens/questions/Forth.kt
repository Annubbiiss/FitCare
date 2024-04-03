package com.example.fitcare.ui.screens.questions


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.fitcare.R
import com.example.fitcare.constants.Constants

@Composable
fun ForthQuestion(navController: NavHostController) {
    val upperList: List<String> = listOf(
        "Little ro No activity",
        "Lightly Active", "Moderately Active", "Very Active"
    )

    val lowerList: List<String> = listOf(
        "Mostly sitting through the " + "day(eg.Desk Jop ,Banker Teller)",
        "Mostly standing through the day (eg." + "Sales Associate , Teacher)",
        "Mostly Walking or doing physical" + " activities through the day(eg.Tour" + "Guide ,Waiter",
        "Mostly doing heavy physical " + "activities through the day(eg." + "Construction Worker"
    )

    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
    ) {


        Row(Modifier.padding(top = 30.dp)) {
            Logo()

        }

        Spacer(modifier = Modifier.size(18.dp))

        Row(
            Modifier.padding(start = 20.dp),
            verticalAlignment = Alignment.Top
        ) {
            Text(
                text = "How active are you",
                style = TextStyle(
                    fontSize = 32.sp,
                    lineHeight = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFFFFF),
                )
            )
        }

        Spacer(modifier = Modifier.size(20.dp))

        Row(
            Modifier.padding(start = 20.dp),
            verticalAlignment = Alignment.Top
        ) {
            Text(
                text = "Based on your lifestyle,we can access " +
                        "your daily calories requirements",
                style = TextStyle(
                    fontSize = 22.sp,
                    lineHeight = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Green,
                    baselineShift = BaselineShift.Subscript
                ),
                maxLines = 2
            )
        }

        Spacer(modifier = Modifier.size(28.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top,
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp)
        ) {

            SelectOptions_(upperText = upperList, lowerText = lowerList)

        }

        Spacer(modifier = Modifier.size(22.dp))

        Row(
            modifier = Modifier.padding(start = 320.dp)
        ) {
            Row(modifier = Modifier
                .clickable { navController.navigate(Constants.FifthQuestion.route) }
                .size(68.dp)
                .clip(CircleShape)
                .background(Color(0xFF3DED1D)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ) {

                Icon(painter = painterResource(id = R.drawable.arrow_next),
                    contentDescription = "",
                    modifier = Modifier
                        .size(40.dp)
                    ,
                    tint = Color.Black

                )
            }
        }

    }
}