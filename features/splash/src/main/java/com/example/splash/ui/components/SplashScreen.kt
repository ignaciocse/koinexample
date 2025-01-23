package com.example.splash.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.splash.ui.SplashViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun SplashScreen(
    viewModel: SplashViewModel = koinViewModel()
) {
    MaterialTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Hello ${viewModel.getUser()}")
        }
    }
}