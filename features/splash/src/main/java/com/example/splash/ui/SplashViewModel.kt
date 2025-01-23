package com.example.splash.ui

import androidx.lifecycle.ViewModel
import com.example.splash.domain.GetUserUseCase

class SplashViewModel(
    private val getUserUseCase: GetUserUseCase
) : ViewModel() {

    fun getUser() = getUserUseCase()
}