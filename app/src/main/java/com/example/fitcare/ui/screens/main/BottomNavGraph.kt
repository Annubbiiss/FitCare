package com.example.fitcare.ui.screens.main

import android.annotation.SuppressLint
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fitcare.R
import com.example.fitcare.constants.BottomNavItem
import com.example.fitcare.navigation.slideComposable

data class NavItemState(
    val selectedIcon: Int,
    val route:String
)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalAnimationApi::class)
@Composable
fun BottomNavGraph(navHostController: NavHostController) {
    val navController = rememberNavController()

    val items = listOf(
        NavItemState(
            selectedIcon = BottomNavItem.HOME.icon,
            route = BottomNavItem.HOME.route
        ),
        NavItemState(
            selectedIcon = BottomNavItem.SEARCH.icon,
            route = BottomNavItem.SEARCH.route
        ),
        NavItemState(
            selectedIcon = BottomNavItem.ADD.icon,
            route = BottomNavItem.ADD.route

        ),
        NavItemState(
            selectedIcon = BottomNavItem.SETTINGS.icon,
            route = BottomNavItem.SETTINGS.route

        ),
        NavItemState(
            selectedIcon =BottomNavItem.PROFILE.icon,
            route = BottomNavItem.PROFILE.route

        ),
    )
    var bottomNavState by rememberSaveable {
        mutableIntStateOf(0)
    }
    Scaffold(containerColor = Color.Black,

            bottomBar ={
            NavigationBar(
                Modifier
                    .fillMaxWidth()
                    .height(108.dp)
                    .padding(24.dp)
                    .clip(RoundedCornerShape(36.dp))
                ,
                containerColor = Color.Green
            ) {
                items.forEachIndexed { index, item ->

                    NavigationBarItem(
                        selected = bottomNavState == index,
                        onClick = {
                            bottomNavState = index
                            navController.navigate(item.route){
                                popUpTo(BottomNavItem.HOME.route)                            }

                                  },
                        icon = {
                                Icon(
                                    painterResource(id = item.selectedIcon) ,
                                    contentDescription = ""
                                )
                        },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = Color.Black,
                            unselectedIconColor = Color.Black,
                            indicatorColor = Color.Green
                            )
                    )
                }
            }
        },

    ) {


        NavHost(navController = navController, startDestination = BottomNavItem.HOME.route ){
            slideComposable(route = BottomNavItem.HOME.route)
            { HomeScreen(navHostController = navController) }

            composable(route = BottomNavItem.SEARCH.route)
            { SearchScreen(navController = navController) }

            composable(route = BottomNavItem.ADD.route)
            { AddScreen(navController = navController) }

            composable(route = BottomNavItem.SETTINGS.route)
            { GraphScreen(navController = navController) }

            composable(route = BottomNavItem.PROFILE.route)
            { ProfileScreen(navController = navController) }
        }
    }

}

