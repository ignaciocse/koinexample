package com.example.splash.di

import com.example.splash.domain.GetLegacyUserUseCase
import com.example.splash.domain.GetLegacyUserUseCaseImpl
import com.example.splash.domain.GetModularFilterValueUseCase
import com.example.splash.domain.GetModularFilterValueUseCaseImpl
import com.example.splash.domain.GetRaptorValueUseCase
import com.example.splash.domain.GetRaptorValueUseCaseImpl
import com.example.splash.domain.GetUserUseCase
import com.example.splash.domain.GetUserUseCaseImpl
import com.example.splash.ui.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val splashModule = module {
    single<GetUserUseCase> { GetUserUseCaseImpl(get()) }
    single<GetLegacyUserUseCase> { GetLegacyUserUseCaseImpl(get()) }
    single<GetModularFilterValueUseCase> { GetModularFilterValueUseCaseImpl(get()) }
    single<GetRaptorValueUseCase> { GetRaptorValueUseCaseImpl(get()) }
    viewModel { SplashViewModel(get(), get(), get(), get(), get()) }
}