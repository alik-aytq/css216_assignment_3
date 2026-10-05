package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment

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
    Box(
        modifier=Modifier.fillMaxSize()
    ){
        Column(
            modifier=Modifier.align(Alignment.Center),
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

        Box(
            modifier=Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom=48.dp)
        ){
            ContactInformation()
        }
    }
}

@Composable
fun ContactInformation(){
    Column{
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                imageVector = Icons.Filled.Phone,
                contentDescription = null,
                tint= Color(0xFF006D3B)
            )

            Spacer(modifier=Modifier.width(16.dp))

            Text(
                text="+7 778 853 27 49",
                fontSize = 16.sp
            )
        }

        Spacer(modifier=Modifier.height(12.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                imageVector = Icons.Filled.Share,
                contentDescription = null,
                tint=Color(0xFF006D3B)
            )

            Spacer(modifier=Modifier.width(16.dp))

            Text(
                text="@android_procrastinator",
                fontSize=16.sp
            )
        }

        Spacer(modifier=Modifier.height(12.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                imageVector = Icons.Filled.Email,
                contentDescription = null,
                tint=Color(0xFF006D3B)
            )

            Spacer(modifier=Modifier.width(16.dp))

            Text(
                text="240118014@sdu.edu.kz",
                fontSize=16.sp
            )
        }
    }
}

