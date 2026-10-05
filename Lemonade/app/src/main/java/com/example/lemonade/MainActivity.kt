package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    LemonadeScreen()
                }
            }
        }
    }
}

@Composable
fun LemonadeScreen() {
    var currentStep by remember { mutableIntStateOf(1) }
    var squeezesNeeded by remember { mutableIntStateOf(0) }
    var squeezesDone by remember { mutableIntStateOf(0) }

    val (image, instruction) = when (currentStep) {
        1 -> Pair(
            R.drawable.lemon_tree,
            "Tap the lemon tree to select a lemon"
        )

        2 -> Pair(
            R.drawable.lemon_squeeze,
            "Keep tapping the lemon to squeeze it"
        )

        3 -> Pair(
            R.drawable.lemon_drink,
            "Tap the lemonade to drink it"
        )

        else -> Pair(
            R.drawable.lemon_restart,
            "Tap the empty glass to start again"
        )
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(image),
            contentDescription = instruction,
            modifier = Modifier
                .size(200.dp)

                .clickable {
                    if (currentStep == 1) {
                        squeezesNeeded = Random.nextInt(2, 5)
                        squeezesDone = 0
                        currentStep = 2

                    } else if (currentStep == 2) {
                        squeezesDone++

                        if (squeezesDone >= squeezesNeeded) {
                            currentStep = 3
                        }

                    } else if (currentStep == 3) {
                        currentStep = 4

                    } else {
                        currentStep = 1
                    }
                }
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = instruction,
            fontSize = 18.sp
        )
    }
}
