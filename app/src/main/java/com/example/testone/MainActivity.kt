package com.example.testone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testone.ui.theme.TestOneTheme
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.runtime.*
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestOneTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    loginTheme()
                }
            }
        }
    }
}
@Composable
fun loginTheme(){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.fillMaxSize().background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFFFFFFFF), Color.White),
                    startY = 0f,
                    endY = 0f,
                )
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.startshape),
            contentDescription = "Top Right Image",
            modifier = Modifier
                .size(230.dp)
                .align(Alignment.TopEnd)
                .offset(x = 100.dp, y = (-70).dp)
        )

        Image(
            painter = painterResource(id = R.drawable.endshape),
            contentDescription = "Bottom Left Image",
            modifier = Modifier
                .size(300.dp)
                .align(Alignment.BottomStart)
                .offset(x = (-120).dp, y = 140.dp)
        )
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp).fillMaxHeight(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Login",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF000000),
                modifier = Modifier.padding(bottom = 5.dp)
            )

            Text(
                text = "Please login to continue",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF777777),
                modifier = Modifier.padding(bottom = 32.dp)
            )

            Text(
                text = "Email: ",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
            )
            Box(
                modifier = Modifier.border(1.dp, Color.White, RoundedCornerShape(0.dp))
            ){
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                leadingIcon = {
                    val icon: Painter = painterResource(id = R.drawable.email_1_svgrepo_com)
                    Image(
                        painter = icon,
                        contentDescription = "Email Icon",
                        modifier = Modifier.padding(end = 8.dp).size(22.dp)
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 30.dp)
                    .shadow(4.dp) // Thêm bóng đổ
                    .background(Color.White),
            )
            }




            Text(
                text = "Password: ",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
            )
            Box(
                modifier = Modifier.border(1.dp, Color.White, RoundedCornerShape(0.dp))
            ){
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                leadingIcon = {
                    val icon: Painter = painterResource(id = R.drawable.lock_svgrepo_com)
                    Image(
                        painter = icon,
                        contentDescription = "Password Icon",
                        modifier = Modifier.padding(end = 8.dp).size(22.dp)
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
                    .shadow(4.dp) // Thêm bóng đổ
                    .background(Color.White),
            )
            }


            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    onClick = {},
                    modifier = Modifier.height(50.dp).width(100.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    ),
                    shape = RoundedCornerShape(18.dp),
                    contentPadding = PaddingValues()
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize().background(
                                brush = Brush.linearGradient(
                                    colors = listOf(Color(0xFFFFEB80), Color(0xFFFF9800))
                                ),
                                shape = RoundedCornerShape(18.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Login",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp)
                    }
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    loginTheme()
}