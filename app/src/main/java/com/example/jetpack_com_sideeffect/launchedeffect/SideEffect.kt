package com.example.jetpack_com_sideeffect.launchedeffect

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay



@Composable
fun TimerScreen() {
    var counter by remember { mutableStateOf(0) }

    // একবারই coroutine চালু হবে
    LaunchedEffect(Unit) {
        while (counter < 10) {
            delay(1000)
            counter++
        }
    }

    Text("Count: $counter")
}
