package com.example.fitcare.ui.screens.main.home.workout

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.fitcare.R

@Composable
private fun MyTabIndicator(
    indicatorWidth: Dp,
    indicatorOffset: Dp,
    indicatorColor: Color,
) {
    Row(
        modifier = Modifier
            .width(120.dp)
            .height(
                5.dp,
            )
            .offset(
                x = indicatorOffset,
            )
            .padding(
                top = 2.dp, start = 2.dp
            )

            .background(
                color = Black,
            ),

    )
    {}
}

@Composable
private fun MyTabItem(
    isSelected: Boolean,
    onClick: () -> Unit,
    tabWidth: Dp,
    text: String,
) {
    val tabTextColor: Color by animateColorAsState(
        targetValue = if (isSelected) {
            White
        } else {
            Black
        },
        animationSpec = tween(easing = LinearEasing), label = "",
    )
    Row(modifier = Modifier
        .wrapContentSize()
        .height(24.dp)
        .padding(end = 80.dp)
    ) {
        Text(
            modifier = Modifier
                .clickable {
                    onClick()
                }
                .width(tabWidth)

            ,
            text = text,
            color = tabTextColor,
            textAlign = TextAlign.Center
        )
    }

}

@Composable
fun CustomTab(
    selectedItemIndex: Int,
    items: List<String>,
    modifier: Modifier = Modifier,
    tabWidth: Dp = 130.dp,
    onClick: (index: Int) -> Unit,
) {
    val indicatorOffset: Dp by animateDpAsState(
        targetValue = tabWidth * selectedItemIndex,
        animationSpec = tween(easing = LinearEasing), label = "",
        )


    Column(
        modifier = modifier
            .background(Color(0xFF21D200))
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        //horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically ,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier//.clip(CircleShape),
                     )
        {
            items.mapIndexed { index, text ->
            val isSelected = index == selectedItemIndex
            MyTabItem(
                isSelected = isSelected,
                onClick = {
                    onClick(index)
                },
                tabWidth = tabWidth,
                text = text,
            )
        }

    }

            MyTabIndicator(
                indicatorWidth = tabWidth,
                indicatorOffset = indicatorOffset,
                indicatorColor = androidx.compose.material3.MaterialTheme.colorScheme.primary,
            )




    }
    Column(modifier = Modifier.width(50.dp)) {}
    Spacer(modifier = Modifier.width(50.dp))

}

@Composable
fun CustomTabSample() {
    val (selected, setSelected) = remember {
        mutableIntStateOf(1)
    }

    Column {
        Row(
            Modifier
                .padding(6.dp)
                .background(Color(0xFF21D200))
                .fillMaxWidth()
                .height(52.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){


            Row(
                modifier = Modifier
                    //.padding(top = 6.dp)
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                CustomTab(
                    items = listOf("Communities", "Direct"),
                    selectedItemIndex = selected,
                    onClick = setSelected,
                    )

            }

        }


    }


}