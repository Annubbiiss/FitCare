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
import com.example.fitcare.constants.BottomNavItem

@Composable
fun SixthQuestion(navController: NavHostController) {

    val firstList: List<String> = listOf(
        "Diabetes", "Cholesterol", "PCOS", "Thyroid"
    )
    val secondList: List<String> = listOf(
        "Pre-Diabetes", "Hypertension", "Physical Injury", "None"
    )


    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
    ) {


        Row(Modifier.padding(top = 30.dp)) {
            Logo()

        }

        Spacer(modifier = Modifier.size(68.dp))

        Row(
            Modifier.padding(start = 20.dp),
            verticalAlignment = Alignment.Top
        ) {
            Text(
                text = "Any Medical Condition We " +
                        "should be aware of ?",
                style = TextStyle(
                    fontSize = 28.sp,
                    lineHeight = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFFFFF),
                )
            )
        }

        Spacer(modifier = Modifier.size(40.dp))

        Row(
            Modifier.padding(start = 20.dp),
            verticalAlignment = Alignment.Top
        ) {
            Text(
                text = "This info will help us guide you to your " +
                        "fitness goals safety and quickly",
                style = TextStyle(
                    fontSize = 18.sp,
                    lineHeight = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Green,
                    baselineShift = BaselineShift.Subscript
                ),
                maxLines = 2
            )
        }

        Spacer(modifier = Modifier.size(58.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top,
            modifier = Modifier
                .padding(start = 28.dp)
        ) {


            MedicalConditions(list1 = firstList, list2 = secondList)

        }

        Spacer(modifier = Modifier.size(32.dp))

        Row(
            modifier = Modifier.padding(start = 320.dp)
        ) {
            Row(modifier = Modifier
                .clickable { //navController.navigate(Constants.SecondQuestion.route)
                    navController.navigate(BottomNavItem.HOME.route)
                 }
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