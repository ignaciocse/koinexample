package com.example.hms

import android.app.Application
import android.util.Log
import com.example.api.di.apiModule
import com.example.common.di.commonModule
import com.example.home.di.homeModule
import com.example.huawei.di.huaweiModule
import com.example.legacy.di.legacyModule
import com.example.repository.di.repositoryModule
import com.example.splash.di.splashModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class StradivariusHMSApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@StradivariusHMSApplication)
            modules(
                listOf(
                    apiModule,
                    repositoryModule,
                    homeModule,
                    splashModule,
                    commonModule,
                    legacyModule,
                    huaweiModule,
                )
            )
        }
    }
}