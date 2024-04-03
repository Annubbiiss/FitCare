package com.example.fitcare.ui.screens.questions

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.InfiniteTransition
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitcare.R



@Composable
fun Logo(){
     Row(
         verticalAlignment = Alignment.Top,
         horizontalArrangement = Arrangement.Center,
         modifier = Modifier
            .fillMaxWidth()
    )  {

         Image(painter = painterResource(id = R.drawable.logo),
             contentDescription = "",
             modifier = Modifier
                 .size(80.dp)
             ,

         )

         Text(text = "FitCare",
             style = TextStyle(
                 fontSize = 30.sp,
                 lineHeight = 14.sp,
                 fontWeight = FontWeight.Bold,
                 color = Color(0xFFFFFFFF),
             ),
             modifier = Modifier.padding(top = 22.dp)

         )
    }

}


@Composable
fun SelectOptions(upperText: List<String>, lowerText: List<String>){
    val radioOptions = listOf(0,1,2,3)
    var selectedOption by remember { mutableIntStateOf(radioOptions[0]) }

    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(28.dp)
    ) {

        radioOptions.forEach { index ->


        Card( modifier = Modifier
            .height(90.dp)
            .width(400.dp),
            colors = CardDefaults.cardColors(Color(0xBF3DED1D))) {
            Row(verticalAlignment = Alignment.Top, modifier = Modifier
                .padding(start = 10.dp, top = 20.dp)) {

                Row(modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(50.dp)
                    )
                    .padding(2.dp)
                    .width(26.dp)
                    .height(26.dp)
                    .background(color = Color(0xFF000000))) {
                    RadioButton(
                        selected = (index == selectedOption),
                        onClick = { selectedOption = index },
                        colors = RadioButtonDefaults.colors(
                            selectedColor = Color(0xFF3DED1D),
                            unselectedColor = Color(0xFF3DED1D)
                            )

                        ,

                        modifier = Modifier.scale(1.8f)
                    )
                }




                Spacer(modifier = Modifier.size(20.dp))

                Column(verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start,

                    ) {

                    Text(text = upperText[index],
                        style = TextStyle(
                            fontSize = 22.sp,
                            lineHeight = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1E1E1E),
                        ),
                        maxLines = 1

                    )

                    Spacer(modifier = Modifier.size(8.dp))
                    
                    Text(text = lowerText[index],
                        style = TextStyle(
                            fontSize = 18.sp,
                            lineHeight = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1E1E1E),
                        ),
                        maxLines = 3

                    )

                }

            }
        }
        }


    }
}

@Composable
fun HorizontalBouncingIcon(infiniteTransition: InfiniteTransition) {
//1
    val startColor = Color.Green
    val endColor = Color.Black
//2
    val animatedColor by infiniteTransition.animateColor(
        initialValue = startColor,
        targetValue = endColor,
        animationSpec = infiniteRepeatable(
            tween(800, easing = FastOutLinearInEasing),
            RepeatMode.Reverse,
        ), label = ""
    )
//3
    val position by infiniteTransition.animateFloat(
        initialValue = -60f,
        targetValue = 60f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                800,
                easing = FastOutLinearInEasing
            ),
            repeatMode = RepeatMode.Reverse
        ), label = ""
    )
//4
    Icon(
        painterResource(id = R.drawable.arrow_next ),
        contentDescription = "Hear icon",
        tint = animatedColor,
        modifier = Modifier
            .size(50.dp)
            .offset(x = position.dp)
    )
}


@Composable
fun SelectOptions_(upperText: List<String>, lowerText: List<String>){
    val radioOptions = listOf(0,1,2,3)
    var selectedOption by remember { mutableIntStateOf(radioOptions[0]) }

    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(28.dp)
    ) {

        radioOptions.forEach { index ->


        Card( modifier = Modifier
            .height(90.dp)
            .width(400.dp),
            colors = CardDefaults.cardColors(Color(0xBF3DED1D))) {
            Row(verticalAlignment = Alignment.Top, modifier = Modifier
                .padding(start = 10.dp, top = 10.dp)) {

                Column(Modifier.padding(top = 10.dp)) {
                    Row(modifier = Modifier
                        .border(
                            width = 2.dp,
                            color = Color.Black,
                            shape = RoundedCornerShape(50.dp)
                        )
                        .padding(2.dp)
                        .width(26.dp)
                        .height(26.dp)
                        .background(color = Color(0xFF000000))) {
                        RadioButton(
                            selected = (index == selectedOption),
                            onClick = { selectedOption = index },
                            colors = RadioButtonDefaults.colors(
                                selectedColor = Color(0xFF3DED1D),
                                unselectedColor = Color(0xFF3DED1D)
                            )

                            ,

                            modifier = Modifier.scale(1.8f)
                        )
                    }
                }





                Spacer(modifier = Modifier.size(20.dp))

                Column(verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.padding(bottom = 10.dp)

                    ) {

                    Text(text = upperText[index],
                        style = TextStyle(
                            fontSize = 22.sp,
                            lineHeight = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1E1E1E),
                        ),
                        maxLines = 1

                    )

                    Spacer(modifier = Modifier.size(2.dp))

                    Text(text = lowerText[index],
                        style = TextStyle(
                            fontSize = 17.sp,
                            lineHeight = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1E1E1E),
                        ),
                        maxLines = 3

                    )

                }

            }
        }
        }


    }
}


@Composable
fun SelectOption(){
    val radioOptions = listOf("YES","NO")
    var selectedOption by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(42.dp)
    ) {

        radioOptions.forEach { option ->


        Card( modifier = Modifier
            .height(60.dp)
            .width(400.dp),
            colors = CardDefaults.cardColors(Color(0xBF3DED1D))) {
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .padding(start = 10.dp, top = 14.dp)) {

                Row(modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(50.dp)
                    )
                    .padding(2.dp)
                    .width(26.dp)
                    .height(26.dp)
                    .background(color = Color(0xFF000000))) {
                    RadioButton(
                        selected = (option == selectedOption),
                        onClick = { selectedOption = option },
                        colors = RadioButtonDefaults.colors(
                            selectedColor = Color(0xFF3DED1D),
                            unselectedColor = Color(0xFF3DED1D)
                            )

                        ,

                        modifier = Modifier.scale(1.8f)
                    )
                }

                Spacer(modifier = Modifier.size(20.dp))

                Column(verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start,

                    ) {

                    Text(text = option,
                        style = TextStyle(
                            fontSize = 20.sp,
                            lineHeight = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1E1E1E),
                        ),
                        maxLines = 1

                    )



                }

            }
        }
        }


    }
}

@Composable
fun CheckboxOptions(text:String) {
    val isCheck = remember { mutableStateOf(false) }
    Column {


            Row(modifier = Modifier.wrapContentSize()) {
                Card(
                    modifier = Modifier.background(Color.Black),
                    elevation = CardDefaults.cardElevation(1.dp),
                    shape = CircleShape,
                    border = BorderStroke(2.dp, color = Color(0xBF3DED1D))
                ) {
                    Row(
                        modifier = Modifier
                            .size(32.dp)
                            .background(if (isCheck.value) Color.Green else Color.Black)
                            .clickable {
                                isCheck.value = !isCheck.value
                            },
                    ) {

                    }
                }
                Text(text = text,
                    modifier = Modifier
                        .padding(start = 14.dp, top = 2.dp),
                    style = TextStyle(
                        fontSize = 22.sp,
                        lineHeight = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                    ),
                    maxLines = 1

                )


            }
        }
    }


@Composable
fun MedicalConditions(list1: List<String>,list2: List<String>){

    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {

        Column( modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(46.dp)) {
            list1.forEach {
                CheckboxOptions(text = it)
            }

        }
        Spacer(modifier = Modifier.size(20.dp))
        
        Column( modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(46.dp)) {
            list2.forEach {
                CheckboxOptions(text = it)
            }

        }

    }
}
