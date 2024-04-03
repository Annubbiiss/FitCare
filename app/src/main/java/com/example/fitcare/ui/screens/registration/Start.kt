package com.example.fitcare.ui.screens.registration

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.example.fitcare.R
import com.example.fitcare.constants.BottomNavItem
import com.example.fitcare.constants.Constants
import com.example.fitcare.ui.screens.registration.component.bounceClick


@Composable
fun StartScreen(navController: NavHostController) {


   Column {
      ConstraintLayout(modifier = Modifier.fillMaxSize()) {

         val (image, row, column,text1,button,text2,fff) = createRefs()

         Image(

            painter = painterResource(id = R.drawable.bg),
            contentDescription = "background image",
            modifier = Modifier
               .fillMaxSize()
               .drawWithContent {
                  drawContent()
                  drawRect(
                     brush = Brush.verticalGradient(
                        colors = listOf(
                           Color.White.copy(alpha = 0.1f),
                           Color.Black.copy(alpha = 0.5f)
                        ),
                        startY = size.height - (700),
                        endY = size.height
                     )
                  )
               }
               .constrainAs(image) {
                  top.linkTo(parent.top)
                  start.linkTo(parent.start)
               },
            contentScale = ContentScale.Crop
         )

         Row(
            Modifier
               .padding(top = 29.dp)
               .constrainAs(row) {
                  top.linkTo(parent.top)
                  start.linkTo(parent.start)
                  end.linkTo(parent.end)
               },
            verticalAlignment = Alignment.CenterVertically

         ) {
            Image(
               painter = painterResource(id = R.drawable.logo),
               contentDescription = "image description",
               Modifier
                  .width(60.dp)
                  .height(34.dp),

               contentScale = ContentScale.FillBounds,


            )

            Text(
               text = "FitCare",
               style = TextStyle(
                  fontSize = 30.sp,
                  lineHeight = 14.sp,
                  //fontFamily = FontFamily(Font(R.font.inter)),
                  fontWeight = FontWeight(700),
                  color = Color(0xFFFFFFFF),

                  textAlign = TextAlign.Center,
               ),
            )

         }
         Column(
            modifier = Modifier
               .constrainAs(column) {
                  top.linkTo(row.bottom)
                  start.linkTo(parent.start)
                  end.linkTo(parent.end)
               }
               .padding(top = 150.dp),
            horizontalAlignment = Alignment.CenterHorizontally
         ) {
            Text(
               text = "ENERGIZE FOR LIFE",
               Modifier
                  .width(409.dp)
                  .height(209.dp),
               style = TextStyle(
                  fontSize = 40.sp,
                  //fontFamily = FontFamily(Font(R.font.inter)),
                  fontWeight = FontWeight(600),
                  color = Color(0xFFFFFFFF),

                  textAlign = TextAlign.Center,
               )
            )

         }
         Row(
            modifier = Modifier
               .constrainAs(text1) {
                  top.linkTo(column.bottom)
                  start.linkTo(parent.start)
                  end.linkTo(parent.end)
                  bottom.linkTo(image.bottom)
               }
               .padding(bottom = 580.dp)
            ,
         ) {
            Text(
               text = "Thrive for fitness and health",
               Modifier
                  .width(382.dp)
                  .height(85.dp),
               style = TextStyle(
                  fontSize = 25.sp,
                  //fontFamily = FontFamily(Font(R.font.inter)),
                  fontWeight = FontWeight(500),
                  color = Color(0xFFFFFFFF),

                  textAlign = TextAlign.Center,
               )
            )

         }

         Button(onClick = { navController.navigate(BottomNavItem.HOME.route) },
           modifier =  Modifier
               .width(382.dp)
               .height(56.dp)
               .padding(top = 310.dp)
              .defaultMinSize(1.dp,1.dp)
              .bounceClick()
               .constrainAs(button) {
                  top.linkTo(image.top)
                  start.linkTo(parent.start)
                  end.linkTo(parent.end)
                  bottom.linkTo(image.bottom)
               }
               .background(
                  color = Color(0xFF3DED1D),
                  shape = RoundedCornerShape(size = 15.dp)
               )


         ) {
            Text(
               modifier = Modifier.fillMaxWidth()
                  .height(40.dp),
               text = "Get Started",
               style = TextStyle(
                  fontSize = 25.sp,
                  //fontFamily = FontFamily(Font(R.font.inter)),
                  fontWeight = FontWeight(500),
                  color = Color(0xFF080402),
                  textAlign = TextAlign.Center,
               )
            )
         }
         Text(
            text = "Get Started",
            Modifier
               .padding(top = 172.dp)
               .constrainAs(fff) {
                  top.linkTo(button.top)
                  start.linkTo(parent.start)
                  end.linkTo(parent.end)
                  bottom.linkTo(image.bottom)
               }

            ,
            color = Color.Black,
            style = TextStyle(
               fontSize = 25.sp,
               //fontFamily = FontFamily(Font(R.font.inter)),
               fontWeight = FontWeight(500)

            )
         )

         Row (
            Modifier
               .padding(top = 320.dp)
               .constrainAs(text2) {
                  top.linkTo(button.top)
                  start.linkTo(parent.start)
                  end.linkTo(parent.end)
                  bottom.linkTo(image.bottom)
               },){
            Text(
               text = "Already have an account?",
               style = TextStyle(
                  fontSize = 20.sp,
                  //fontFamily = FontFamily(Font(R.font.inter)),
                  fontWeight = FontWeight(500),
                  color = Color(0xFFFFFFFF),

                  textAlign = TextAlign.Center,
               )
            )
            Spacer(modifier = Modifier.size(5.dp))
            Text(
               text = "Sign in",
               modifier = Modifier.clickable { navController.navigate(Constants.Login.route) },
               style = TextStyle(
                  fontSize = 20.sp,
                  //fontFamily = FontFamily(Font(R.font.inter)),
                  fontWeight = FontWeight(500),
                  color = Color(0xFF3DED1D),

                  textAlign = TextAlign.Center,
               )
            )



         }
      }
   }
}