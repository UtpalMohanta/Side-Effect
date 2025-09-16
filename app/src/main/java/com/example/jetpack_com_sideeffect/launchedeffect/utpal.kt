package com.example.jetpack_com_sideeffect.launchedeffect

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun Myscreen()
{
    var counter by remember{ mutableStateOf(0) }
    var key by remember { mutableStateOf(1) }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "Count: $counter", fontSize = 24.sp)

        Spacer( modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                key++
                counter=0
            }
        ) {
            Text("rester timer")
        }
        LaunchedEffect(key) {
            while (counter<10)
            {
                delay(1000)
                counter++
            }
        }
    }

}