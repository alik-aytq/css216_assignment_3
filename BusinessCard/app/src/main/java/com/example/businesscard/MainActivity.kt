package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity: ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            MaterialTheme{
                Surface(
                    modifier=Modifier.fillMaxSize()
                ){
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(){
    Column(
        modifier=Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ){

        Image(
            painter=painterResource(R.drawable.android_logo),
            contentDescription = "Android logo",
            modifier= Modifier.size(100.dp)
        )

        Spacer(modifier=Modifier.height(8.dp))

        Text(
            text="Alikhan Aitkaliev",
            fontSize = 32.sp
        )

        Text(
            text="Android Developer",
            fontSize=16.sp,
            color=Color(0xFF006D3B)
        )
    }
}

@Composable
fun ContactInformation(){
    Column(
        horizontalAlignment = Alignment.Start
    ){
        Text(
            text="+7 778 853 27 49",
            fontSize = 16.sp
        )

        Spacer(modifier=Modifier.height(12.dp))

        Text(
            text="@android_procrastinator",
            fontSize=16.sp
        )

        Spacer(modifier=Modifier.height(12.dp))

        Text(
            text="240118014@sdu.edu.kz",
            fontSize=16.sp
        )
    }
}

