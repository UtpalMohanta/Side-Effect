package com.example.jetpack_com_sideeffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_com_sideeffect.RememberUpdateState.Myhq
import com.example.jetpack_com_sideeffect.launchedeffect.Myscreen
import com.example.jetpack_com_sideeffect.launchedeffect.TimerScreen
import com.example.jetpack_com_sideeffect.produceState.UserProfileScreen
import com.example.jetpack_com_sideeffect.ui.theme.Jetpack_com_sideEffectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

           // TimerScreen()
           // Myscreen()
           // Myhq()
           // TimerScreen()
            UserProfileScreen()
        }
    }
}

