package com.example.common.di

import com.example.common.currrencies.CurrencyFormatManager
import com.example.common.currrencies.CurrencyFormatManagerImpl
import com.example.common.modularfilter.MSpotsManager
import com.example.common.modularfilter.ModularFilterManager
import com.example.common.modularfilter.PrinterManager
import com.example.common.modularfilter.RaptorManager
import org.koin.dsl.module

val commonModule = module {
    single<CurrencyFormatManager> { CurrencyFormatManagerImpl() }
    single { MSpotsManager() }
    single { ModularFilterManager() }
    single { PrinterManager() }
    single { RaptorManager(get()) }
}