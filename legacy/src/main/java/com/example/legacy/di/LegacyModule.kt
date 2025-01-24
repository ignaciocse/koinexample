package com.example.legacy.di

import com.example.legacy.support.user.LegacySupportRepositoryImpl
import com.example.legacy.support.user.SupportRepositoryImpl
import com.example.support.user.SupportRepository
import org.koin.dsl.module

val legacyModule = module {
    single<SupportRepository> { SupportRepositoryImpl() }
    single<SupportRepository> { LegacySupportRepositoryImpl() }
}