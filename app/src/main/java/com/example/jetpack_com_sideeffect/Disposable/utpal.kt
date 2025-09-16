package com.example.jetpack_com_sideeffect.Disposable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun TimerScreen() {
    var seconds by remember { mutableStateOf(0) }

    // Timer শুরু হবে Composable আসার সাথে
    DisposableEffect(Unit) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            while (true) {
                delay(1000)
                seconds++
                println("Timer tick: $seconds")
            }
        }

        onDispose {
            // Composable চলে গেলে Timer বন্ধ হবে
            job.cancel()
            println("Timer cancelled")
        }
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Seconds: $seconds")
        Spacer(modifier = Modifier.height(16.dp))
        Text("এই স্ক্রিন থেকে বের হলে Timer বন্ধ হয়ে যাবে")
    }
}
