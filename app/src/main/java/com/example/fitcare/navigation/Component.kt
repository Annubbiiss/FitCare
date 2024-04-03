package com.example.fitcare.navigation

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.fitcare.constants.BottomNavItem




@Composable
fun EnterAnimation(content: @Composable () -> Unit) {
    AnimatedVisibility(
        visibleState = MutableTransitionState(
            initialState = false
        ).apply { targetState = true },
        modifier = Modifier,
        enter = slideInVertically(
            initialOffsetY = { -40 }
        ) + expandVertically(
            expandFrom = Alignment.Top
        ) + fadeIn(initialAlpha = 0.3f),
        exit = slideOutVertically() + shrinkVertically() + fadeOut(),
    ) {
        content()
    }
}



private const val TIME_DURATION = 300
val enterTransition: AnimatedContentTransitionScope<NavBackStackEntry>.() -> EnterTransition = {
    slideInHorizontally( initialOffsetX = { it },
        animationSpec = tween(durationMillis = TIME_DURATION,
            easing = LinearOutSlowInEasing) )
}
val exitTransition: AnimatedContentTransitionScope<NavBackStackEntry>.() -> ExitTransition = {
    slideOutHorizontally( targetOffsetX = { -it / 3 },
        animationSpec = tween(durationMillis = TIME_DURATION,
            easing = LinearOutSlowInEasing) )

}
val popEnterTransition: AnimatedContentTransitionScope<NavBackStackEntry>.() -> EnterTransition = {

    slideInHorizontally( initialOffsetX = { -it / 3 },
        animationSpec = tween(durationMillis = TIME_DURATION,
            easing = LinearOutSlowInEasing) )
}
val popExitTransition: AnimatedContentTransitionScope<NavBackStackEntry>.() -> ExitTransition =
    { slideOutHorizontally( targetOffsetX = { it },
        animationSpec = tween(durationMillis = TIME_DURATION,
        easing = LinearOutSlowInEasing)
    ) }

@ExperimentalAnimationApi
fun NavGraphBuilder.slideComposable(route: String, arguments: List<NamedNavArgument> = emptyList(), content: @Composable() (
AnimatedContentScope.(NavBackStackEntry) -> Unit)
)
{
    composable( route, arguments = arguments, enterTransition = enterTransition, exitTransition = exitTransition, popEnterTransition = popEnterTransition, popExitTransition = popExitTransition, content = content ) }