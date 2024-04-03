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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.fitcare.R
import com.example.fitcare.constants.Constants
import com.example.fitcare.ui.screens.registration.component.bounceClick
import com.example.fitcare.ui.screens.registration.component.shake

@Composable
fun FirstQuestion(navController: NavHostController) {
    val upperList:List<String> = listOf("To Be Healthier",
        "Lose Weight","Improve Endurance","Build Muscles")

    val lowerList:List<String> = listOf("Regular exercise and Lifestyle",
        "Diet & Lifestyle Regulation","Athletics exercise"," Muscle Group exercise")

    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxSize()
    ) {


        Row(Modifier.padding(top = 30.dp)) {
            Logo()

        }

        Spacer(modifier = Modifier.size(40.dp))

         Row(Modifier.padding( start = 20.dp),
             verticalAlignment = Alignment.Top
         ) {
             Text(
                 text = "I Would like to :",
                 style = TextStyle(
                     fontSize = 32.sp,
                     lineHeight = 30.sp,
                     fontWeight = FontWeight.Bold,
                     color = Color(0xFFFFFFFF),
                 )
             )
        }

        Spacer(modifier = Modifier.size(28.dp))

        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Top, modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
        ) {

            SelectOptions(upperText = upperList, lowerText = lowerList)

        }

        Spacer(modifier = Modifier.size(36.dp))

        Row(modifier = Modifier.padding(start = 320.dp)
        ) {
            Row(modifier = Modifier
                .clickable { navController.navigate(Constants.SecondQuestion.route) }
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