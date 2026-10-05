package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity: ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            MaterialTheme{
                Surface(
                    modifier=Modifier.fillMaxSize()
                ){
                    TaskManager()
                }
            }
        }
    }
}

@Composable
fun TaskManager(){
    Column(
        modifier=Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text="All tasks completed",
            fontSize=24.sp,
            modifier=Modifier.padding(top = 24.dp)
        )

        Text(
            text="Nice work",
            fontSize=16.sp,
            modifier = Modifier.padding(top=8.dp)
        )
    }
}