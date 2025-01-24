package com.example.splash.ui

import androidx.lifecycle.ViewModel
import com.example.marketservices.maps.MarketMapManager
import com.example.splash.domain.GetLegacyUserUseCase
import com.example.splash.domain.GetUserUseCase

class SplashViewModel(
    private val getUserUseCase: GetUserUseCase,
    private val getLegacyUserUseCase: GetLegacyUserUseCase,
    private val marketMapManager: MarketMapManager,
) : ViewModel() {

    fun getUser() = getUserUseCase()

    fun getLegacyUser() = getLegacyUserUseCase()

    fun getMarkerPosition() = marketMapManager.getMarkerPosition()
}