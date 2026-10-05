package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale

class MainActivity: ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            MaterialTheme{
                Surface(
                    modifier=Modifier.fillMaxSize()
                ){
                    ComposeArticle()
                }
            }
        }
    }
}

@Composable
fun ComposeArticle(){
    Column{
        Image(
            painter=painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
            modifier=Modifier.fillMaxWidth(),
            contentScale=ContentScale.Crop
        )

        Text(
            text="Jetpack Compose tutorial",
            fontSize=24.sp,
            modifier=Modifier.padding(16.dp)
        )

        Text(
            text="Jetpack Compose is a modern toolkit for building native Android UI.",
            modifier=Modifier.padding(16.dp)
        )

        Text(
            text="In this tutorial, you build a simple UI component with declarative functions.",
            modifier=Modifier.padding(16.dp)
        )
    }
}