package com.example.fitcare.constants

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.fitcare.R

sealed class Constants(val route : String){
    object GetStarted : Constants("Get_Started")
    object Login : Constants("Login")
    object SignUp : Constants("Sign_Up")


    object ResetPassword : Constants("RESET_PASSWORD")
    object OtpVerification : Constants("OTP_VERIFICATION")
    object CreateNewPassword : Constants("CREATE_NEW_PASSWORD")


    object FirstQuestion : Constants("FIRST_QUESTION")
    object SecondQuestion : Constants("SECOND_QUESTION")
    object ThirdQuestion : Constants("THIRD_QUESTION")
    object ForthQuestion : Constants("FORTH_QUESTION")
    object FifthQuestion : Constants("FIFTH_QUESTION")
    object SixthQuestion : Constants("SIXTH_QUESTION")


}

sealed class BottomNavItem(val route: String, val icon:Int, val label: String) {
    object HOME : BottomNavItem("home", R.drawable.home, "Home")
    object SEARCH : BottomNavItem("search", R.drawable.search, "Search")
    object ADD : BottomNavItem("add",R.drawable.addbookk, "add")
    object SETTINGS : BottomNavItem("settings",R.drawable.statistics,  "settings")
    object PROFILE : BottomNavItem("profile", R.drawable.profile, "Profile")
}
