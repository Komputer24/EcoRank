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
import androidx.compose.ui.platform.LocalContext
import com.example.ecorank.ui.theme.EcoRankTheme
import android.content.Intent
import android.app.Activity

@Composable
fun ActivitySwitch(destination: Class<out Activity>, buttonText: String){
    val context = LocalContext.current

    Button(
        onClick = {
            val intent = Intent(context, destination)
            context.startActivity(intent)
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF236476),
            contentColor = Color.White
        ),
        modifier = Modifier
            .size(width = 105.dp, height = 40.dp),
        shape = RectangleShape
    ){
        Text(
            text = buttonText, fontSize = 18.sp,
        )
    }
}