package com.example.repository.di

import com.example.repository.user.UserRepository
import com.example.repository.user.UserRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    factory<UserRepository> { UserRepositoryImpl(get()) }
}