package com.example.splash.di

import com.example.splash.domain.GetLegacyUserUseCase
import com.example.splash.domain.GetLegacyUserUseCaseImpl
import com.example.splash.domain.GetUserUseCase
import com.example.splash.domain.GetUserUseCaseImpl
import com.example.splash.ui.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val splashModule = module {
    single<GetUserUseCase> { GetUserUseCaseImpl(get()) }
    single<GetLegacyUserUseCase> { GetLegacyUserUseCaseImpl(get()) }
    viewModel { SplashViewModel(get(), get(), get()) }
}