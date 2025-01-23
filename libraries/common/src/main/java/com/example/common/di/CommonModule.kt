package com.example.common.di

import com.example.common.currrencies.CurrencyFormatManager
import com.example.common.currrencies.CurrencyFormatManagerImpl
import org.koin.dsl.module

val commonModule = module {
    single<CurrencyFormatManager> { CurrencyFormatManagerImpl() }
}