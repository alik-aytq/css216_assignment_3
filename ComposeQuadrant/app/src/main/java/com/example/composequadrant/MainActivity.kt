package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
                title="Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                color=Color(0xFFEADDFF),
                modifier= Modifier.weight(1f)
            )

            Quadrant(
                title="Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                color=Color(0xFFD0BCFF),
                modifier=Modifier.weight(1f)
            )
        }

        Row(
            modifier=Modifier.weight(1f)
        ){
            Quadrant(
                title="Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                color=Color(0xFFB69DF8),
                modifier=Modifier.weight(1f)
            )

            Quadrant(
                title="Column composable",
                description = "description = A layout composable that places its children in a vertical sequence.",
                color=Color(0xFFF6EDFF),
                modifier=Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun Quadrant(
    title:String,
    description:String,
    color: Color,
    modifier:Modifier = Modifier
){
    Column(
        modifier=modifier
            .fillMaxHeight()
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text=title,
            fontWeight = FontWeight.Bold,
            fontSize=16.sp,
            modifier=Modifier.padding(bottom=16.dp)
        )

        Text(
            text=description,
            textAlign = TextAlign.Justify
        )
    }
}