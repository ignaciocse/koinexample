package com.example.splash.ui

import androidx.lifecycle.ViewModel
import com.example.marketservices.maps.MarketMapManager
import com.example.splash.domain.GetLegacyUserUseCase
import com.example.splash.domain.GetModularFilterValueUseCase
import com.example.splash.domain.GetRaptorValueUseCase
import com.example.splash.domain.GetUserUseCase

class SplashViewModel(
    private val getUserUseCase: GetUserUseCase,
    private val getLegacyUserUseCase: GetLegacyUserUseCase,
    private val getModularFilterValueUseCase: GetModularFilterValueUseCase,
    private val getRaptorValueUseCase: GetRaptorValueUseCase,
    private val marketMapManager: MarketMapManager,
) : ViewModel() {

    fun getUser() = getUserUseCase()

    fun getLegacyUser() = getLegacyUserUseCase()

    fun getMarkerPosition() = marketMapManager.getMarkerPosition()

    fun getModularFilterValue() = getModularFilterValueUseCase()

    fun getRaptorValue() = getRaptorValueUseCase()
}