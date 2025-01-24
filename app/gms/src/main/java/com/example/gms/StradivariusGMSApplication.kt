package com.example.gms

import android.app.Application
import com.example.api.di.apiModule
import com.example.common.di.commonModule
import com.example.google.di.googleModule
import com.example.home.di.homeModule
import com.example.legacy.di.legacyModule
import com.example.repository.di.repositoryModule
import com.example.splash.di.splashModule
import com.example.support.di.supportModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class StradivariusGMSApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@StradivariusGMSApplication)
            modules(
                listOf(
                    apiModule,
                    repositoryModule,
                    homeModule,
                    splashModule,
                    commonModule,
                    legacyModule,
                    googleModule,
                )
            )
        }
    }
}