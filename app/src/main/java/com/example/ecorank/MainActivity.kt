package com.example.ecorank

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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import com.example.ecorank.ui.theme.EcoRankTheme

class MainActivity : ComponentActivity() {
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
                        contentAlignment = Alignment.Center
                    ){
                        Column(
                            modifier = Modifier.padding(innerPadding),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Row(
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.fillMaxWidth()
                            ){
                                Text(
                                    text = "Eco",
                                    fontSize = 80.sp,
                                    color = Color(0xFF267988),
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "Rank",
                                    fontSize = 80.sp,
                                    color = Color(0xFF88A24A),
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.height(15.dp))
                            Row(
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.fillMaxWidth()
                            ){
                                // Button1
                                ActivitySwitch(LoginActivity::class.java, "Login")

                                Spacer(modifier = Modifier.width(13.dp))

                                // Button2
                                ActivitySwitch(SignupActivity::class.java, "Signup")
                            }
                            Spacer(modifier = Modifier.height(15.dp))
                            Row(
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.fillMaxWidth()
                            ){
                                Text(
                                    text = "Developed by Kaleab Beteselassie",
                                    fontSize = 18.sp,
                                    color = Color.White,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}