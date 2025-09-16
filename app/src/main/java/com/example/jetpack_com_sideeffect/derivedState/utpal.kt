package com.example.jetpack_com_sideeffect.derivedState

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun DerivedStateDemo() {
    var number by remember { mutableStateOf(0) }

    // Derived state: number * 2, শুধুমাত্র number change হলে update হবে
    val doubleNumber by remember {
        derivedStateOf { number * 2 }
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Number: $number")
        Text("Double: $doubleNumber")

        Button(onClick = { number++ }) {
            Text("Increment")
        }
    }
}
