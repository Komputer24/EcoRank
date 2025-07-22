package com.example.ecorank

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.material3.Button
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.example.ecorank.ui.theme.EcoRankTheme

class SignupActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EcoRankTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color(0xFF003153)),
                        contentAlignment = Alignment.Center,
                    ){
                        Box(
                            modifier = Modifier
                                .padding(innerPadding)
                                .width(330.dp)
                                .background(Color(0xFF236476)),
                        ){
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Spacer(modifier = Modifier.height(12.dp))
                                Text(
                                    text = "Signup",
                                    fontSize = 50.sp,
                                )
                                Spacer(modifier = Modifier.height(20.dp))

                                var username by remember { mutableStateOf("") }
                                var password by remember { mutableStateOf("") }

                                TextField(
                                    value = username,
                                    onValueChange = { username = it },
                                    placeholder = { Text("Email or username") },
                                    shape = RoundedCornerShape(25.dp),
                                    colors = TextFieldDefaults.colors(
                                        focusedContainerColor = Color(0xFF85AAB3),
                                        unfocusedContainerColor = Color(0xFF85AAB3),
                                        focusedTextColor = Color.White,
                                        unfocusedTextColor = Color.White,
                                        focusedIndicatorColor = Color.Transparent,
                                        unfocusedIndicatorColor = Color.Transparent,
                                        disabledIndicatorColor = Color.Transparent,
                                        focusedPlaceholderColor = Color.White,
                                        unfocusedPlaceholderColor = Color.White
                                    ),
                                    textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp)
                                )

                                Spacer(modifier = Modifier.height(12.dp))
                                TextField(
                                    value = password,
                                    onValueChange = { password = it },
                                    placeholder = { Text("Password") },
                                    shape = RoundedCornerShape(25.dp),
                                    colors = TextFieldDefaults.colors(
                                        focusedContainerColor = Color(0xFF85AAB3),
                                        unfocusedContainerColor = Color(0xFF85AAB3),
                                        focusedTextColor = Color.White,
                                        unfocusedTextColor = Color.White,
                                        focusedIndicatorColor = Color.Transparent,
                                        unfocusedIndicatorColor = Color.Transparent,
                                        disabledIndicatorColor = Color.Transparent,
                                        focusedPlaceholderColor = Color.White,
                                        unfocusedPlaceholderColor = Color.White
                                    ),
                                    textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp)
                                )

                                Spacer(modifier = Modifier.height(12.dp))

                                val context = LocalContext.current
                                Button(
                                    onClick = {
                                        val intent = Intent(context, LoginActivity::class.java)
                                        context.startActivity(intent)
                                    },
                                    modifier = Modifier.size(width = 280.dp, height = 50.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(0xFFAAAAAA),
                                        contentColor = Color.White
                                    )
                                ){
                                    Text(text = "Create Account", fontSize = 23.sp)
                                }
                                Spacer(modifier = Modifier.height(30.dp))
                            }
                        }
                    }
                }
            }
        }
    }
}