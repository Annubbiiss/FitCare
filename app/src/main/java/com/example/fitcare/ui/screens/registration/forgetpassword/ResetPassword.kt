package com.example.fitcare.ui.screens.registration.forgetpassword

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavHostController
import com.example.fitcare.R
import com.example.fitcare.constants.Constants
import com.example.fitcare.ui.screens.registration.component.bounceClick
import com.example.fitcare.ui.screens.registration.component.isEmailValid
import com.example.fitcare.ui.screens.registration.component.shake
import kotlinx.coroutines.android.awaitFrame

@Composable
fun ResetPasswordDialog( onDismiss: () -> Unit,navController: NavHostController) {
    var email by remember {
        mutableStateOf("")
    }
    var validateEmail by remember { mutableStateOf(false) }


    val focusRequester = remember { FocusRequester() }

    Dialog(
        onDismissRequest = onDismiss::invoke,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Column(
            modifier = Modifier
                .background(color = Color.Black)
                .fillMaxSize()

        ) {
                Icon(
                    painterResource(id = R.drawable.arrow_back),
                    contentDescription = "Close Icon",
                    modifier = Modifier
                        .clickable{
                            navController.popBackStack()
                        }
                        .padding(24.dp)
                        .size(24.dp),
                    tint = Color.Green

                )


            Row(
                modifier = Modifier.padding(24.dp),
            ) {
                Icon(
                    painterResource(id = R.drawable.locked),
                    contentDescription = "Close Icon",
                    modifier = Modifier
                        .padding(end = 15.dp)
                        .size(32.dp),
                    tint = Color.Green



                )

                Text(
                    text = "Reset Password",
                    style = TextStyle(
                        fontSize = 36.sp,
                        lineHeight = 14.sp,
                        //fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White,

                        textAlign = TextAlign.Start,
                    )
                )
            }

            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 16.dp),
                colors = CardDefaults.cardColors(Color(0xB28DED1D)),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(6.dp)
                ) {

                    Text(
                        text = "Forget Password ?",
                        modifier = Modifier.padding(18.dp),
                        style = TextStyle(
                            fontSize = 32.sp,
                            lineHeight = 14.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFF000000),

                            textAlign = TextAlign.Start,
                        )
                    )

                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 18.dp),
                        text = "Please Enter E-mail address or phone" +
                                " Number to receive a verification code",
                        style = TextStyle(
                            fontSize = 19.sp,
                            lineHeight = 30.sp,
                            //fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xA6080402),
                            //textAlign = TextAlign.Start,
                            letterSpacing = (1.sp)

                        )
                        , maxLines = 2
                    )
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 36.dp, top = 28.dp),
                        text = "E-mail",
                        style = TextStyle(
                            fontSize = 19.sp,
                            lineHeight = 30.sp,
                            //fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xA6080402),

                        )
                    )

                    BasicTextField(
                        value = email,
                        onValueChange = { newValue ->
                            email = newValue
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Email
                        ),
                        modifier = Modifier.focusRequester(focusRequester)
                    )
                    {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(10.dp),

                            ) {

                            Column(
                                modifier = Modifier.padding(20.dp),

                                ) {

                                Row {
                                    Icon(painter = painterResource(id = R.drawable.email), contentDescription = "",
                                        modifier = Modifier
                                            .size(20.dp)
                                            .padding(top = 6.dp)
                                    )

                                    Text(
                                        modifier = Modifier.padding(start = 10.dp, bottom = 4.dp),
                                        text = email,
                                        style = MaterialTheme.typography.titleLarge,
                                        textAlign = TextAlign.Start,
                                        maxLines = 1
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(4.dp)
                                        .background(Color.Black),
                                )

                                if(validateEmail){
                                    Spacer(modifier = Modifier.size(14.dp))
                                    Text(
                                        modifier = Modifier.padding(start = 6.dp),
                                        text = "Invalid E-mail",
                                        style = TextStyle(
                                            fontSize = 14.sp,
                                            lineHeight = 16.sp,
                                            //fontFamily = FontFamily(Font(R.font.inter)),
                                            fontWeight = FontWeight(500),
                                            color = Color.Red,

                                            )
                                    )
                                }


                            }

                        }
                    }


                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 28.dp),
                        text = "Use Phone number",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xA6080402),

                            )
                    )

                    Button(onClick = {
                        if (isEmailValid(email)){
                        navController.navigate(Constants.OtpVerification.route) }
                        validateEmail = !isEmailValid(email)

                    }

                        ,
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(size = 15.dp),
                        modifier = Modifier
                            .padding(20.dp)
                            .padding(start = 26.dp)
                            .width(375.dp)
                            .height(45.dp)
                            .shake()
                            .then(
                                if (isEmailValid(email)) {
                                    Modifier
                                        .bounceClick()
                                        .defaultMinSize(1.dp, 1.dp)
                                } else {
                                    Modifier
                                }
                            )


                    ) {
                        Text(
                            text = "Send",
                            Modifier.height(30.dp),
                            style = TextStyle(
                                fontSize = 20.sp,
                                lineHeight = 14.sp,
                                //fontFamily = FontFamily(Font(R.font.inter)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFF3DED1D),

                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                }
            }
        }


    }
    LaunchedEffect(focusRequester) {
        awaitFrame()
        focusRequester.requestFocus()
    }
}

