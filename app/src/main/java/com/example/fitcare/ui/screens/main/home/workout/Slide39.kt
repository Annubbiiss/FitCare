package com.example.fitcare.ui.screens.main.home.workout

import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabPosition
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
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
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Slide39(){
    val tabTitles = listOf("Community", "Direct")
    var selectedTab = remember { mutableStateOf(false) }
    val selectedTabb = remember { mutableIntStateOf(0) }


    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF080402))

    ) {
            Row(modifier = Modifier
                .padding(6.dp)
                .background(Color(0xFF21D200))
                .clip(RoundedCornerShape(12.dp))
                .fillMaxWidth()
                .height(49.dp)
                ,
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceEvenly

            ){

                Icon(
                    painter = painterResource(id = R.drawable.back),
                    contentDescription = "",
                    modifier = Modifier
                        //.padding(end = 6.dp)
                        .size(16.dp),
                    tint = Color.Black
                    //.clickable { navHostController.navigate(Constants.BMICALC.route) }
                )

                Row {


                    Button(
                        onClick = {
                            selectedTab.value = false
                            selectedTabb.intValue = 0
                                  },
                        colors = ButtonDefaults.buttonColors (Color(0xFF21D200)),
                        modifier = Modifier
                        ,
                        shape = RoundedCornerShape(size = 10.dp),


                        ) {
                        Column {

                            Row(
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {

                                Text(
                                    text = "Communities",
                                    style = TextStyle(
                                        fontSize = 20.sp,
                                        lineHeight = 14.sp,
                                        //fontFamily = FontFamily(Font(R.font.inter)),
                                        fontWeight = FontWeight(500),
                                        color = Color.Black,
                                        textAlign = TextAlign.Center,
                                    )
                                )

                            }
                            if (selectedTab.value == false){
                                Row(
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .width(108.dp)
                                        .height(
                                            4.dp,
                                        )

                                        .background(
                                            color = Color.Black,
                                        ),

                                    )
                                {}
                            }
                        }


                    }
                }

                Button(onClick = {    selectedTab.value = true
                    selectedTabb.intValue = 1 },
                    colors = ButtonDefaults.buttonColors (Color(0xFF21D200)),
                    modifier = Modifier
                    ,
                    shape = RoundedCornerShape(size = 10.dp),


                    ) {
                    Column {

                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Text(
                                text = "Direct",
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
                        if (selectedTab.value == true){
                            Row(
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .width(52.dp)
                                    .height(
                                        4.dp,
                                    )

                                    .background(
                                        color = Color.Black,
                                    ),

                                )
                            {}
                        }
                    }

                }

            }


        }
    }


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PagingScreen(){
    val coroutineScope = rememberCoroutineScope()
    val pagerState = rememberPagerState{2}

    val tabRowItems = listOf(
        TabItem(
            text = "Profile",
            screen = { Communities() }
        ),
        TabItem(
            text = "Settings",
            screen = { Direct() }
        ),

    )

    Column(modifier = Modifier.fillMaxSize()) {
        TabRow(
            modifier = Modifier
                .background(Color.Transparent.copy(0.3f))
                .padding(vertical = 4.dp, horizontal = 8.dp)
                .clip(RoundedCornerShape(50)),//Consistent look
            selectedTabIndex = pagerState.currentPage,
            containerColor = Color(0xFF21D200),
            contentColor = Color(0xFF21D200),

        ) {
            tabRowItems.forEachIndexed { index, item ->
                Tab(
                    text = { Text(text = item.text)},
                    selected = pagerState.currentPage == index,
                    onClick = { coroutineScope.launch {
                        pagerState.animateScrollToPage(index)
                    } },
                    selectedContentColor = Color.Black
                )
            }
        }
        HorizontalPager(
            state = pagerState,
        ) {
            tabRowItems[pagerState.currentPage].screen()
        }
    }
}

data class TabItem(
    val text: String,//Tab Title
    val screen: @Composable ()->Unit//Tab Screen(can also take params)
)

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun CustomIndicator(tabPositions: List<TabPosition>, pagerState: PagerState) {
    val transition = updateTransition(pagerState.currentPage, label = "")//Do transition of current page
    val indicatorStart by transition.animateDp(//Indicator start transition animation
        transitionSpec = {
            if (initialState < targetState) {
                spring(dampingRatio = 1f, stiffness = 50f)//Using spring
            } else {
                spring(dampingRatio = 1f, stiffness = 100f)//Change stiffness according to your need
            }
        }, label = ""
    ) {
        tabPositions[it].left
    }

    val indicatorEnd by transition.animateDp(//Indicator end transition animation
        transitionSpec = {
            if (initialState < targetState) {
                spring(dampingRatio = 1f, stiffness = 100f)//Or you can change your anim here
            } else {
                spring(dampingRatio = 1f, stiffness = 50f)
            }
        }, label = ""
    ) {
        tabPositions[it].right
    }

    Box(//Using a whole box around the Tab
        Modifier
            .offset(x = indicatorStart)
            .wrapContentSize(align = Alignment.BottomStart)
            .width(indicatorEnd - indicatorStart)
            .fillMaxSize()
            .padding(5.dp)
    )//You can also add a background, but then also use zIndex
}