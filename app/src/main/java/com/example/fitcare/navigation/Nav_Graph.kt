package com.example.fitcare.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fitcare.constants.BottomNavItem
import com.example.fitcare.constants.Constants
import com.example.fitcare.ui.screens.main.BottomNavGraph
import com.example.fitcare.ui.screens.questions.FifthQuestion
import com.example.fitcare.ui.screens.questions.FirstQuestion
import com.example.fitcare.ui.screens.questions.ForthQuestion
import com.example.fitcare.ui.screens.questions.SecondQuestion
import com.example.fitcare.ui.screens.questions.SixthQuestion
import com.example.fitcare.ui.screens.questions.ThirdQuestion
import com.example.fitcare.ui.screens.registration.forgetpassword.ResetPasswordDialog
import com.example.fitcare.ui.screens.registration.SingnInScreen
import com.example.fitcare.ui.screens.registration.SingnUpScreen
import com.example.fitcare.ui.screens.registration.StartScreen
import com.example.fitcare.ui.screens.registration.forgetpassword.CreateNewPasswordDialog
import com.example.fitcare.ui.screens.registration.forgetpassword.VerificationPasswordDialog

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun setUpNavGraph(){
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Constants.GetStarted.route ){
        composable(route = Constants.GetStarted.route){
            StartScreen(navHostController)
        }
        composable(route = Constants.Login.route){
            SingnInScreen(navController = navHostController)
        }
        composable(route = Constants.SignUp.route){
            SingnUpScreen(navController = navHostController)
        }
        composable(route = Constants.ResetPassword.route){
            ResetPasswordDialog({},navController = navHostController)
        }
        composable(route = Constants.OtpVerification.route){
            VerificationPasswordDialog({},navController = navHostController)
        }
        composable(route = Constants.CreateNewPassword.route){
            CreateNewPasswordDialog({},navController = navHostController)
        }



          composable(route = Constants.FirstQuestion.route,){
                  FirstQuestion(navController = navHostController)
        }
          slideComposable(route = Constants.SecondQuestion.route){
            SecondQuestion(navController = navHostController)
        }
        slideComposable(route = Constants.ThirdQuestion.route){
            ThirdQuestion(navController = navHostController)
        }
        slideComposable(route = Constants.ForthQuestion.route){
            ForthQuestion(navController = navHostController)
        }
        slideComposable(route = Constants.FifthQuestion.route){
            FifthQuestion(navController = navHostController)
        }
        slideComposable(route = Constants.SixthQuestion.route){
            SixthQuestion(navController = navHostController)
        }

        slideComposable(route = BottomNavItem.HOME.route)
        { BottomNavGraph(navHostController = navHostController) }


    }

}