package com.example.jetpack_com_sideeffect.produceState

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay

@Preview
@Composable
fun UserProfileScreen() {
    val userName by produceState(initialValue = "Loading...") {
        // pretend API call
        delay(3000)
        value = "Utpal Mohanta" // লোড হয়ে গেলে UI আপডেট
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("User name: $userName")
    }
}
