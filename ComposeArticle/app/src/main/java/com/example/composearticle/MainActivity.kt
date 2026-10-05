package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign

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
    Column(
        modifier=Modifier.fillMaxSize()
    ){
        Image(
            painter=painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
            modifier=Modifier.fillMaxWidth(),
            contentScale=ContentScale.Fit
        )

        Text(
            text= stringResource(R.string.tutorial_text),
            fontSize=24.sp,
            modifier=Modifier.padding(16.dp)
        )

        Text(
            text=stringResource(R.string.modern_toolkit_text),
            textAlign = TextAlign.Justify,
            modifier=Modifier.padding(16.dp)
        )

        Text(
            text=stringResource(R.string.build_simple_text),
            textAlign = TextAlign.Justify,
            modifier=Modifier.padding(16.dp)
        )
    }
}