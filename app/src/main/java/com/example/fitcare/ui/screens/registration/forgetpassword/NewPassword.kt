package com.example.fitcare.ui.screens.registration.forgetpassword


import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavHostController
import com.example.fitcare.R
import com.example.fitcare.constants.Constants
import com.example.fitcare.ui.screens.registration.component.bounceClick
import com.example.fitcare.ui.screens.registration.component.isPasswordValid
import com.example.fitcare.ui.screens.registration.component.isPassworsMatch
import com.example.fitcare.ui.screens.registration.component.isValidCredentialsResetPassword
import com.example.fitcare.ui.screens.registration.component.isValidCredentialsSignUp
import com.example.fitcare.ui.screens.registration.component.shake
import kotlinx.coroutines.android.awaitFrame

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateNewPasswordDialog( onDismiss: () -> Unit,navController: NavHostController) {
    var passwordVisible by remember { mutableStateOf(false) }
    var Password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var isPasswordVisible by remember { mutableStateOf(false) }
    var validatePassword by remember { mutableStateOf(false) }
    var validateConfirmPassword by remember { mutableStateOf(false) }
    val trailingIcon = @Composable {
        IconButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
            Icon(
                if (isPasswordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                contentDescription = "",
                tint =  Color(0xFF3DED1D)
            )
        }

    }
    val trailingIcon1 = @Composable {

        IconButton(onClick = { passwordVisible = !passwordVisible }) {
            Icon(
                if (passwordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                contentDescription = "none",
                tint =  Color(0xFF3DED1D)
            )
        }
    }

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

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, top = 5.dp),
            ) {

                Text(
                    text = "Create New Password",
                    style = TextStyle(
                        fontSize = 36.sp,
                        lineHeight = 14.sp,
                        //fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White,

                        textAlign = TextAlign.Start,
                    ),
                    maxLines = 1

                )

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 14.dp),
                    text = "This Password should be different from the previous password",
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 30.sp,
                        //fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xB3FFFFFF),
                        ),
                    maxLines = 2

                )


            }


            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 32.dp),
                colors = CardDefaults.cardColors(Color(0xB28DED1D)),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(6.dp)
                ) {




                    Row(modifier = Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {

                        Column() {
                            Text(
                                text = "New password",
                                Modifier
                                    .width(160.dp)
                                    .height(40.dp)
                                    .padding(start = 10.dp)
                                ,
                                style = TextStyle(
                                    fontSize = 20.sp,
                                    lineHeight = 14.sp,
                                    //fontFamily = FontFamily(Font(R.font.inter)),
                                    fontWeight = FontWeight(500),
                                    color = Color.Black,

                                    )
                            )

                            OutlinedTextField(
                                value = Password,
                                onValueChange = { Password = it },
                                textStyle = TextStyle(
                                    fontSize = 18.sp,
                                    lineHeight = 12.sp,
                                    color = Color(0xFFFFFFFF),

                                    ),
                                colors = TextFieldDefaults.outlinedTextFieldColors(Color.Black)
                                ,
                                modifier = Modifier
                                    .width(350.dp)
                                    .height(52.dp)
                                    .clip(RoundedCornerShape(size = 15.dp))
                                    .border(
                                        width = 1.dp,
                                        color = Color(0xB28DED1D),
                                    )

                                    .background(color = Color(0xFF000000)),
                                        trailingIcon = trailingIcon,
                                keyboardOptions = KeyboardOptions(
                                    imeAction = ImeAction.Done,
                                    keyboardType = KeyboardType.Password
                                ),

                                singleLine = true,
                                visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation()

                            )
                            if(validatePassword){
                                Spacer(modifier = Modifier.size(12.dp))
                                Text(
                                    modifier = Modifier.padding(start = 6.dp),
                                    text = "Invalid Password",
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
                    Row(modifier = Modifier
                        .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Column(modifier = Modifier.padding(top = 10.dp)) {
                            Text(
                                text = "Confirm password",
                                Modifier
                                    .width(180.dp)
                                    .height(40.dp)
                                    .padding(start = 10.dp),
                                style = TextStyle(
                                    fontSize = 20.sp,
                                    lineHeight = 18.sp,
                                    //fontFamily = FontFamily(Font(R.font.inter)),
                                    fontWeight = FontWeight(500),
                                    color = Color.Black,
                                    ),
                                maxLines = 1
                            )

                            OutlinedTextField(
                                value = confirmPassword,
                                onValueChange = { confirmPassword = it },
                                textStyle = TextStyle(
                                    fontSize = 18.sp,
                                    lineHeight = 12.sp,
                                    color = Color(0xFFFFFFFF),

                                    ),
                                modifier = Modifier
                                    .width(350.dp)
                                    .height(52.dp)
                                    .clip(RoundedCornerShape(size = 15.dp))
                                    .border(
                                        width = 1.dp,
                                        color = Color(0xB28DED1D),
                                    )

                                    .background(color = Color(0xFF000000)),
                                trailingIcon = trailingIcon1,
                                keyboardOptions = KeyboardOptions(
                                    imeAction = ImeAction.Done,
                                    keyboardType = KeyboardType.Password
                                ),

                                singleLine = true,
                                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation()

                            )
                            if(validateConfirmPassword){
                                Spacer(modifier = Modifier.size(12.dp))
                                Text(
                                    modifier = Modifier.padding(start = 6.dp),
                                    text = "Passwords Doesn't match",
                                    style = TextStyle(
                                        fontSize = 14.sp,
                                        lineHeight = 14.sp,
                                        //fontFamily = FontFamily(Font(R.font.inter)),
                                        fontWeight = FontWeight(500),
                                        color = Color.Red,

                                        )
                                )
                            }
                        }

                    }

                    Button(onClick = {
                        if (isValidCredentialsResetPassword(Password,confirmPassword)){
                        navController.navigate(Constants.Login.route) }
                        validatePassword = !isPasswordValid(Password)
                        validateConfirmPassword = !isPassworsMatch(Password,confirmPassword)
                                     },
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(size = 15.dp),
                        modifier = Modifier
                            .padding(20.dp)
                            .padding(top = 30.dp, bottom = 20.dp, start = 26.dp)
                            .width(375.dp)
                            .height(45.dp)
                            .shake()
                            .then(
                                if (isValidCredentialsResetPassword(Password, confirmPassword)) {
                                    Modifier
                                        .bounceClick()
                                        .defaultMinSize(1.dp, 1.dp)
                                } else {
                                    Modifier
                                }
                            )



                    ) {
                        Text(
                            text = "Reset Password",
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

