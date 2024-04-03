package com.example.fitcare.ui.screens.registration.forgetpassword


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
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
import kotlinx.coroutines.android.awaitFrame

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VerificationPasswordDialog( onDismiss: () -> Unit,navController: NavHostController) {
    var otpCode by remember {
        mutableStateOf("")
    }
    var isEmpty by remember {
        mutableStateOf(false)
    }
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
                    .clickable {
                        navController.popBackStack()
                    }
                    .padding(24.dp)
                    .size(24.dp),
                tint = Color.Green

            )

            Row(
                modifier = Modifier
                    .padding(32.dp)
                    .padding(start = 10.dp),
            ) {

                Text(
                    text = "Verification",
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
                    .padding(top = 28.dp),
                colors = CardDefaults.cardColors(Color(0xB28DED1D)),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(6.dp)
                ) {

                    Text(
                        text = "Verify Password ",
                        modifier = Modifier
                            .padding(28.dp)
                            .padding(top = 10.dp,),
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
                        text = "Please Enter 4 digital code sent to your E-mail or Phone number",
                        style = TextStyle(
                            fontSize = 19.sp,
                            lineHeight = 30.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFF333232),
                            //textAlign = TextAlign.Start,
                            letterSpacing = (1.sp)

                        )
                        , maxLines = 2
                    )
                    Row(modifier = Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        BasicTextField(
                            value = otpCode,
                            onValueChange = { newValue ->
                                otpCode = newValue
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.NumberPassword
                            ),
                            modifier = Modifier.focusRequester(focusRequester)

                        )
                        {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(15.dp),
                                verticalAlignment = Alignment.CenterVertically

                            ) {
                                repeat(4) { index ->
                                    val number = when {
                                        index >= otpCode.length -> ""
                                        else -> otpCode[index].toString()
                                    }
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.spacedBy(6.dp),

                                        ) {
                                        Text(
                                            text = number,
                                            style = MaterialTheme.typography.titleLarge,
                                        )



                                        Box(
                                            modifier = Modifier
                                                .width(40.dp)
                                                .height(4.dp)
                                                .background(Color.Black),
                                        )


                                    }
                                }

                            }
                        }

                    }
                    if(isEmpty){
                        Spacer(modifier = Modifier.size(24.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                modifier = Modifier
                                //.padding(start = 60.dp)
                                ,
                                text = "Invalid OTP Code",
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
                    LaunchedEffect(focusRequester) {
                        awaitFrame()
                        focusRequester.requestFocus()
                    }

                    Button(onClick = {
                        if (otpCode.length < 4){
                            isEmpty = true
                        }
                        else
                        {
                        navController.navigate(Constants.CreateNewPassword.route)}


                                     },
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(size = 15.dp),
                        modifier = Modifier
                            .padding(20.dp)
                            .padding(top = 30.dp, bottom = 20.dp)
                            .width(375.dp)
                            .height(45.45454.dp)


                    ) {
                        Text(
                            text = "Continue",
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
}


@Composable
fun OTPTextField(validateEmpty:Boolean) {
    var otpCode by remember {
        mutableStateOf("")
    }
    var isEmpty by remember {
        mutableStateOf(false)
    }
    val focusRequester = remember { FocusRequester() }


    BasicTextField(
        value = otpCode,
        onValueChange = { newValue ->
            otpCode = newValue
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.NumberPassword
        ),
                modifier = Modifier.focusRequester(focusRequester)

    )
    {
        Row(
            horizontalArrangement = Arrangement.spacedBy(15.dp),
            verticalAlignment = Alignment.CenterVertically

            ) {
            repeat(4) { index ->
                val number = when {
                    index >= otpCode.length -> ""
                    else -> otpCode[index].toString()
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(6.dp),

                    ) {
                    Text(
                        text = number,
                        style = MaterialTheme.typography.titleLarge,
                    )



                    Box(
                        modifier = Modifier
                            .width(40.dp)
                            .height(4.dp)
                            .background(Color.Black),
                    )


                }
            }

        }
    }
    if(otpCode.isEmpty()){
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
    LaunchedEffect(focusRequester) {
        awaitFrame()
        focusRequester.requestFocus()
    }
}


