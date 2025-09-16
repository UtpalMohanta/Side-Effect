package com.example.jetpack_com_sideeffect.RememberUpdateState

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
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun Myhq()
{
    var message by remember { mutableStateOf("hello") }
    val currentmessage by rememberUpdatedState(message)

    LaunchedEffect(Unit)
    {
        while (true){
            delay(3000)
            println("Currentmessage: $currentmessage")
        }
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Message: $message", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { message = "Hi!" }) {
            Text("Change Message")
        }
    }
}
