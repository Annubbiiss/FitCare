package com.example.fitcare.ui.screens.registration.component

import android.annotation.SuppressLint
import android.util.Patterns
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.repeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput

fun isValidCredentialsSignIn(email: String, password: String): Boolean {
    val emailPattern:Boolean =  (Patterns.EMAIL_ADDRESS.matcher(email).matches())
    val passwordRegex = "(?=.*\\d)(?=.*[a-z])(?=.*[a-z])(?=.*[@#\$^&+=]).{8,}".toRegex()
    return emailPattern && password.matches(passwordRegex)
}

fun isEmailValid(email: String): Boolean {
    return (Patterns.EMAIL_ADDRESS.matcher(email).matches())
}
fun isPasswordValid(password: String): Boolean {
    val passwordRegex = "(?=.*\\d)(?=.*[a-z])(?=.*[a-z])(?=.*[@#\$^&+=]).{8,}".toRegex()
    return password.matches(passwordRegex)
}
fun isPassworsMatch(password: String,confirmPassword: String): Boolean {
    return password == confirmPassword
}

fun isValidCredentialsSignUp(email: String, password: String, confirmPassword:String): Boolean {
    val emailPattern:Boolean =  (Patterns.EMAIL_ADDRESS.matcher(email).matches())
    val passwordRegex = "(?=.*\\d)(?=.*[a-z])(?=.*[a-z])(?=.*[@#\$^&+=]).{8,}".toRegex()
    return emailPattern && password.matches(passwordRegex) && password == confirmPassword
}
fun isValidCredentialsResetPassword(password: String, confirmPassword:String): Boolean {
    val passwordRegex = "(?=.*\\d)(?=.*[a-z])(?=.*[a-z])(?=.*[@#\$^&+=]).{8,}".toRegex()
    return  password.matches(passwordRegex)&& password == confirmPassword
}

enum class ButtonState { Pressed, Idle }
@SuppressLint("RememberReturnType")

fun Modifier.bounceClick() = composed {
    var buttonState by remember { mutableStateOf(ButtonState.Idle) }
    val scale by animateFloatAsState(if (buttonState == ButtonState.Pressed) 0.70f else 1f)

    this
        .graphicsLayer {
            scaleX = scale
            scaleY = scale
        }
        .clickable(
            interactionSource = remember { MutableInteractionSource() },
            indication = null,
            onClick = {  }
        )
        .pointerInput(buttonState) {
            awaitPointerEventScope {
                buttonState = if (buttonState == ButtonState.Pressed) {
                    waitForUpOrCancellation()
                    ButtonState.Idle
                } else {
                    awaitFirstDown(false)
                    ButtonState.Pressed
                }
            }
        }

}



fun Modifier.shake() = composed {
    var buttonState by remember { mutableStateOf(ButtonState.Idle) }

    val tx by animateFloatAsState(
        targetValue = if (buttonState == ButtonState.Pressed) 0f else -50f,
        animationSpec = repeatable(
            iterations = 2,
            animation = tween(durationMillis = 50, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        ), label = ""
    )
    this
        .graphicsLayer {
            translationX = tx
        }
        .clickable(
            interactionSource = remember { MutableInteractionSource() },
            indication = null,
            onClick = { }
        )
        .pointerInput(buttonState) {
            awaitPointerEventScope {
                buttonState = if (buttonState == ButtonState.Pressed) {
                    waitForUpOrCancellation()
                    ButtonState.Idle
                } else {
                    awaitFirstDown(false)
                    ButtonState.Pressed
                }
            }
        }
}