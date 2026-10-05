package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            MaterialTheme{
                ComposeQuadrant()
            }
        }
    }
}

@Composable
fun ComposeQuadrant(){
    Column(
        modifier=Modifier.fillMaxSize()
    ){
        Row(
            modifier=Modifier.weight(1f)
        ){
            Quadrant(
                color=Color(0xFFB69DF8),
                modifier= Modifier.weight(1f)
            )

            Quadrant(
                color=Color(0xFFF6EDFF),
                modifier=Modifier.weight(1f)
            )
        }

        Row(
            modifier=Modifier.weight(1f)
        ){
            Quadrant(
                color=Color(0xFFF6EDFF),
                modifier=Modifier.weight(1f)
            )

            Quadrant(
                color=Color(0xFFB69DF8),
                modifier=Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun Quadrant(
    color: Color,
    modifier:Modifier = Modifier
){
    Column(
        modifier=modifier
            .fillMaxHeight()
            .background(color)
    ){

    }
}