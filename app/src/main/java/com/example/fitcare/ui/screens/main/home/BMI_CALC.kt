package com.example.fitcare.ui.screens.main.home


import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.fitcare.R
import com.example.fitcare.constants.Constants

@Composable
fun BMIScreen(navController: NavHostController) {
    var weightCounter by rememberSaveable { mutableStateOf(0) }
    var ageCounter by rememberSaveable { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())

    )
     {
         Spacer(modifier = Modifier.height(64.dp))

         Row(
             Modifier
                 .fillMaxWidth()
                 .padding(16.dp)
         ) {

             Column(modifier = Modifier
                 .height(170.dp)
                 .width(170.dp)
                 .background(Color(0xFF21D200)),
                 verticalArrangement = Arrangement.Top,
                 horizontalAlignment = Alignment.CenterHorizontally

             ) {

                 Spacer(modifier = Modifier.height(30.dp))


                 Icon(painter = painterResource(id = R.drawable.male),
                     contentDescription = "",

                     Modifier.size(82.dp)


                 )

                 Text(text = "Male",
                     fontWeight = FontWeight.SemiBold,
                     fontSize = 20.sp,
                     lineHeight = 14.sp,
                     modifier = Modifier
                         .padding(10.dp)

                 )
             }
             Spacer(modifier = Modifier.width(30.dp))


             Column(modifier = Modifier
                 .height(170.dp)
                 .width(170.dp)
                 .background(Color(0xFF21D200)),
                 verticalArrangement = Arrangement.Top,
                 horizontalAlignment = Alignment.CenterHorizontally

             ) {
                 Spacer(modifier = Modifier.height(30.dp))

                 Icon(painter = painterResource(id = R.drawable.female),
                     contentDescription = "",

                     Modifier.size(82.dp)


                 )

                 Text(text = "Female",
                     fontWeight = FontWeight.SemiBold,
                     fontSize = 20.sp,
                     lineHeight = 14.sp,
                     modifier = Modifier
                         .padding(10.dp)

                 )
             }
         }
         Spacer(modifier = Modifier.height(34.dp))


         Column(modifier = Modifier
             .padding(12.dp)
             .fillMaxWidth()
             .background(Color(0xFF21D200)),
             verticalArrangement = Arrangement.Top,
             horizontalAlignment = Alignment.CenterHorizontally

         ){

             Text(text = "Height",
                 fontWeight = FontWeight.SemiBold,
                 fontSize = 25.sp,
                 lineHeight = 14.sp,
                 modifier = Modifier
                     .padding(10.dp)

             )
             Text(text = "166 cm",
                 fontWeight = FontWeight.SemiBold,
                 fontSize = 20.sp,
                 lineHeight = 14.sp,
                 modifier = Modifier
                     .padding(10.dp)

             )
         }

         Spacer(modifier = Modifier.height(30.dp))

         Row(
             Modifier
                 .fillMaxWidth()
                 .padding(18.dp)
             , verticalAlignment = Alignment.CenterVertically,
             horizontalArrangement = Arrangement.Center
         ) {

             Column(modifier = Modifier
                 .height(100.dp)
                 .width(170.dp)
                 .background(Color(0xFF21D200)),
             verticalArrangement = Arrangement.Top,
             horizontalAlignment = Alignment.CenterHorizontally

             )  {
                 Text(text = "Weight",
                     fontWeight = FontWeight.SemiBold,
                     fontSize = 20.sp,
                     lineHeight = 14.sp,
                     modifier = Modifier
                         .padding(12.dp)

                 )

                 Spacer(modifier = Modifier.width(30.dp))

                 Row(
                     verticalAlignment = Alignment.Top,
                     horizontalArrangement = Arrangement.SpaceBetween

                 ) {

                     Spacer(modifier = Modifier.height(30.dp))


                     Text(text = "+",
                         fontWeight = FontWeight.SemiBold,
                         fontSize = 20.sp,
                         lineHeight = 14.sp,
                         modifier = Modifier
                             .padding(10.dp)
                             .clickable { weightCounter++ }
                         ,
                         color = Color.White

                     )

                     Spacer(modifier = Modifier.height(30.dp))


                     Text(text = weightCounter.toString(),
                         fontWeight = FontWeight.SemiBold,
                         fontSize = 20.sp,
                         lineHeight = 14.sp,
                         modifier = Modifier
                             .padding(10.dp),
                         color = Color.White

                     )



                     Text(text = "-",
                         fontWeight = FontWeight.SemiBold,
                         fontSize = 20.sp,
                         lineHeight = 14.sp,
                         modifier = Modifier
                             .padding(10.dp)
                              .clickable {
                                 if (weightCounter > 0) {
                                     weightCounter--
                                 }
                             }
                         ,
                         color = Color.White

                     )
                 }
             }

             Spacer(modifier = Modifier.width(30.dp))


             Column(modifier = Modifier
                 .height(100.dp)
                 .width(170.dp)
                 .background(Color(0xFF21D200)),
                 verticalArrangement = Arrangement.Top,
                 horizontalAlignment = Alignment.CenterHorizontally

             )  {
                 Text(text = "Age",
                     fontWeight = FontWeight.SemiBold,
                     fontSize = 20.sp,
                     lineHeight = 14.sp,
                     modifier = Modifier
                         .padding(12.dp)

                 )

                 Spacer(modifier = Modifier.width(30.dp))


                 Row(
                     verticalAlignment = Alignment.Top,
                     horizontalArrangement = Arrangement.SpaceBetween

                 ) {

                     Spacer(modifier = Modifier.height(30.dp))


                     Text(text = "+",
                         fontWeight = FontWeight.SemiBold,
                         fontSize = 20.sp,
                         lineHeight = 14.sp,
                         modifier = Modifier
                             .padding(10.dp)
                             .clickable { ageCounter++ }
                         ,
                         color = Color.White

                     )

                     Spacer(modifier = Modifier.height(30.dp))


                     Text(text = ageCounter.toString(),
                         fontWeight = FontWeight.SemiBold,
                         fontSize = 20.sp,
                         lineHeight = 14.sp,
                         modifier = Modifier
                             .padding(10.dp),
                         color = Color.White

                     )



                     Text(text = "-",
                         fontWeight = FontWeight.SemiBold,
                         fontSize = 20.sp,
                         lineHeight = 14.sp,
                         modifier = Modifier
                             .padding(10.dp)
                             .clickable {
                                 if (ageCounter > 0) {
                                     ageCounter--
                                 }
                             }
                         ,
                         color = Color.White

                     )
                 }
             }
         }

         Spacer(modifier = Modifier.height(20.dp))


         Button(onClick = {
             navController.navigate(Constants.BMIRES.route) }
         ,
             colors = ButtonDefaults.buttonColors (Color(0xFF21D200)),
             shape = RoundedCornerShape(size = 15.dp),
             modifier = Modifier
                 .padding(start = 20.dp, top = 30.dp)
                 .width(368.dp)
                 .height(52.dp)
                 .border(
                     width = 1.dp,
                     color = Color.Black,
                     shape = RoundedCornerShape(size = 8.dp)
                 )

         ) {
             Row(
                 horizontalArrangement = Arrangement.Center,
                 verticalAlignment = Alignment.CenterVertically
                 , modifier = Modifier.padding(start = 10.dp)
             ) {

                 Text(
                     text = "Calculate BMI",
                     Modifier
                         .padding(top = 5.dp, end = 10.dp)
                         .width(200.dp)
                         .height(30.dp),
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

