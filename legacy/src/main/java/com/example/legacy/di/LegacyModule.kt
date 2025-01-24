package com.example.legacy.di

import com.example.legacy.support.user.UserSupportRepositoryImpl
import com.example.support.user.UserSupportRepository
import org.koin.dsl.module

val legacyModule = module {
    single<UserSupportRepository> { UserSupportRepositoryImpl() }
}