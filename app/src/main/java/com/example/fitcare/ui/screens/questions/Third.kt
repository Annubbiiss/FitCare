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
fun ThirdQuestion(navController: NavHostController) {

    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxSize()
    ) {


        Row(Modifier.padding(top = 30.dp)) {
            Logo()

        }

        Spacer(modifier = Modifier.size(108.dp))




        Row(
            Modifier.padding( start = 20.dp),
            verticalAlignment = Alignment.Top
        ) {
            Text(
                text = "Are you currently taking any " +
                        "medications or supplements that may " +
                        "affect your exercise or nutrition plan ?",
                style = TextStyle(
                    fontSize = 22.sp,
                    lineHeight = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Green,
                    baselineShift = BaselineShift.Subscript
                ),
                maxLines = 3
            )
        }

        Spacer(modifier = Modifier.size(86.dp))

        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Top, modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
        ) {

            SelectOption()

        }

        Spacer(modifier = Modifier.size(42.dp))

        Row(verticalAlignment = Alignment.Bottom,
            modifier = Modifier.padding(start = 320.dp, top = 84.dp)
        ) {
            Row(modifier = Modifier
                .clickable { navController.navigate(Constants.ForthQuestion.route) }
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