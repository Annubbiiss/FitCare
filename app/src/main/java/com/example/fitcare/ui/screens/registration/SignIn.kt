package com.example.fitcare.ui.screens.registration

import android.util.Patterns
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.fitcare.R
import com.example.fitcare.constants.Constants
import com.example.fitcare.ui.screens.questions.HorizontalBouncingIcon
import com.example.fitcare.ui.screens.registration.component.bounceClick
import com.example.fitcare.ui.screens.registration.component.isEmailValid
import com.example.fitcare.ui.screens.registration.component.isPasswordValid
import com.example.fitcare.ui.screens.registration.component.isValidCredentialsSignIn
import com.example.fitcare.ui.screens.registration.component.shake

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SingnInScreen(navController: NavHostController){
    var Email by remember { mutableStateOf("") }
    var Password by remember { mutableStateOf("") }
    var isPasswordVisible by remember { mutableStateOf(false) }
    var validateEmail by remember { mutableStateOf(false) }
    var validatepassword by remember { mutableStateOf(false) }
    val trailingIcon = @Composable {
        IconButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
            Icon(
                if (isPasswordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                contentDescription = "",
                tint =  Color(0xFF3DED1D)
            )
        }
    }



    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(0xFF080402))
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
            .padding(top = 30.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){

        Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "image description",
        alignment = Alignment.TopCenter,
        modifier = Modifier
            .width(100.dp)
            .height(60.dp),

                contentScale = ContentScale.FillBounds
    )
        Text(
            text = "WELCOME BACK",
            Modifier
                .width(216.dp)
                .height(70.dp)
                .padding(top = 15.dp)
            ,
            style = TextStyle(
                fontSize = 25.sp,
                lineHeight = 14.sp,
                //fontFamily = FontFamily(Font(R.font.inter)),
                fontWeight = FontWeight(700),
                color = Color(0xFFFFFFFF),

                textAlign = TextAlign.Center,
            )
        )
}
Column(
    Modifier
        .fillMaxWidth()
        .padding(start = 20.dp, end = 20.dp, bottom = 20.dp)) {
    Text(
        text = "Your E-mail",
        Modifier
            .width(175.dp)
            .height(40.dp),
        style = TextStyle(
            fontSize = 20.sp,
            lineHeight = 14.sp,
            //fontFamily = FontFamily(Font(R.font.inter)),
            fontWeight = FontWeight(500),
            color = Color(0xFFFFFFFF),

            )
    )
    OutlinedTextField(
        value = Email,
        onValueChange = { Email = it },
        textStyle = TextStyle(
            fontSize = 18.sp,
            lineHeight = 14.sp,
            color = Color(0xFFFFFFFF),

            ),
        modifier = Modifier
            .width(375.dp)
            .height(52.dp)
            .border(
                width = 2.dp,
                color = Color(0xFF3DED1D),
                shape = RoundedCornerShape(size = 10.dp)
            )
            .background(color = Color(0xFF000000)), shape = RoundedCornerShape(size = 10.dp)

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
    Spacer(modifier = Modifier.size(10.dp))
    Text(
        text = "Password",
        Modifier
            .width(175.dp)
            .height(40.dp),
        style = TextStyle(
            fontSize = 20.sp,
            lineHeight = 14.sp,
            //fontFamily = FontFamily(Font(R.font.inter)),
            fontWeight = FontWeight(500),
            color = Color(0xFFFFFFFF),

            )
    )
    OutlinedTextField(
        value = Password,
        onValueChange = { Password = it },
        textStyle = TextStyle(
            fontSize = 18.sp,
            lineHeight = 14.sp,
            color = Color(0xFFFFFFFF),


        ),
        modifier = Modifier
            .width(375.dp)
            .height(52.dp)
            .border(
                width = 2.dp,
                color = Color(0xFF3DED1D),
                shape = RoundedCornerShape(size = 10.dp)
            )
            .background(color = Color(0xFF000000)), shape = RoundedCornerShape(size = 10.dp),
        trailingIcon = trailingIcon,
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Done,
            keyboardType = KeyboardType.Password
        ),

                singleLine = true,
        visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation()
    )
    if(validatepassword){
        Spacer(modifier = Modifier.size(16.dp))
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

        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 16.dp)) {
            Row(
                Modifier
                    .fillMaxWidth(0.4f)
                    ){

                RemmemberMe()
                Spacer(modifier = Modifier.size(10.dp))

                Text(
                    text = "Remember Me",
                    Modifier
                        .width(104.dp)
                        .height(24.dp),
                    style = TextStyle(
                        fontSize = 15.sp,
                        lineHeight = 14.sp,
                        //fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),

                        )
                )
            }


            Text(
                text = "Forget password?",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 60.dp)
                    .clickable {
                        navController.navigate(Constants.ResetPassword.route)
                    }
                ,

                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 14.sp,
                    //fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF3DED1D),

                    textAlign = TextAlign.Start,
                ),
            )
        }
        Button(onClick = {

            if (isValidCredentialsSignIn(Email,Password)) {
                navController.navigate(Constants.FirstQuestion.route)
                                                    }
            validateEmail = !isEmailValid(Email)
            validatepassword = !isPasswordValid(Password)

        },

            colors = ButtonDefaults.buttonColors(Color(0xFF3DED1D)),
            shape = RoundedCornerShape(size = 15.dp),
        modifier = Modifier
            .padding(20.dp)
            .padding(top = 18.dp, bottom = 12.dp, start = 24.dp)
            .width(375.dp)
            .height(45.dp)
            .shake()
            .then(
                if (isValidCredentialsSignIn(Email, Password)) {
                    Modifier
                        .bounceClick()
                        .defaultMinSize(1.dp, 1.dp)
                } else {
                    Modifier
                }
            )

        )
        {
            Text(
                text = "LOGIN",
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 14.sp,
                    //fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF000000),

                    textAlign = TextAlign.Center,
                )
            )
        }
     Row(
         Modifier
             .padding(start = 20.dp, end = 20.dp)
             .fillMaxWidth()) {
         Divider(
             Modifier
                 .padding(top = 10.dp)
                 .fillMaxWidth(0.45f)
                 .height(1.dp),
             color = Color(0xFF3DED1D)





         )
         Text(
             modifier = Modifier
                 .padding(bottom = 15.dp)
                 .fillMaxWidth(0.25f),
             text = "or",
             style = TextStyle(
                 fontSize = 20.sp,
                 lineHeight = 14.sp,
                 //fontFamily = FontFamily(Font(R.font.inter)),
                 fontWeight = FontWeight(700),
                 color = Color(0xFFFFFFFF),
                 textAlign = TextAlign.Center,
             )
         )

         Divider(
             Modifier
                 .padding(top = 10.dp)
                 .fillMaxWidth(1f)
                 .height(1.dp),
                     color = Color(0xFF3DED1D)


         )
     }
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors (Color(0xFF080402)),
            shape = RoundedCornerShape(size = 15.dp),
            modifier = Modifier
                .padding(start = 20.dp, top = 10.dp)
                .width(375.dp)
                .height(45.45454.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFFFFFFFF),
                    shape = RoundedCornerShape(size = 15.dp)
                )

        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
                , modifier = Modifier.padding(start = 10.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.apple),
                    contentDescription = "image description",
                            modifier = Modifier
                                .padding(top = 1.dp, start = 3.dp)
                                .width(28.dp)
                                .height(28.dp)
                )
                Text(
                    text = "Login with Apple",
                    Modifier
                        .padding(top = 5.dp, end = 10.dp)
                        .width(200.dp)
                        .height(30.dp),
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 14.sp,
                        //fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),

                        textAlign = TextAlign.Center,
                    )
                )
            }

        }
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors (Color(0xFF080402)),
            shape = RoundedCornerShape(size = 15.dp),
            modifier = Modifier
                .padding(start = 20.dp, top = 30.dp)
                .width(375.dp)
                .height(45.45454.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFFFFFFFF),
                    shape = RoundedCornerShape(size = 15.dp)
                )

        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
                , modifier = Modifier.padding(start = 10.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "image description",
                    modifier = Modifier
                        .padding(top = 1.dp, start = 3.dp)
                        .width(28.dp)
                        .height(28.dp)
                )
                Text(
                    text = "Login with Google",
                    Modifier
                        .padding(top = 5.dp, end = 10.dp)
                        .width(200.dp)
                        .height(30.dp),
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 14.sp,
                        //fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),

                        textAlign = TextAlign.Center,
                    )
                )
            }

        }

        Row(
            Modifier
                .width(361.dp)
                .height(100.dp)
                .padding(20.dp)
                .padding(start = 40.dp, top = 20.dp)
                    ,horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Don’t have account? ",
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 14.sp,
                    //fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFFFFFFFF),

                    textAlign = TextAlign.Center,
                )
            )
            Text(
                text = "SIGN UP",
                modifier = Modifier.clickable {
                    navController.navigate(Constants.SignUp.route)
                },
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 14.sp,
                    //fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(500),
                    color =Color(0xFF3DED1D),

                    textAlign = TextAlign.Center,
                )
            )
        }


}

}

@Composable
fun RemmemberMe() {
    var selectedOption by remember { mutableStateOf(false) }
    Column(Modifier.selectableGroup()) {

            Row(

                Modifier
                    .border(
                        width = 2.dp,
                        color = Color(0xFF3DED1D),
                        shape = RoundedCornerShape(50.dp)
                    )
                    .padding(2.dp)
                    .width(16.dp)
                    .height(16.dp)
                    .background(color = Color(0xFF000000))
                    .selectable(
                        selected = (selectedOption),
                        onClick = {
                            selectedOption = !selectedOption
                        },
                        role = Role.RadioButton
                    )
                ,
            ) {
                RadioButton(
                    selected = ( selectedOption),
                    onClick = {selectedOption = !selectedOption},
                    colors = RadioButtonDefaults.colors( Color(0xFF3DED1D))
                )

            }

    }
}