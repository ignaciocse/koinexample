package com.example.api.di

import com.example.api.user.UserRemoteDataSourceImpl
import com.example.datasource.user.UserRemoteDataSource
import org.koin.dsl.module

//fun provideService(retrofit: Retrofit): UserWs =
//    retrofit.create(UserWs::class.java)

val apiModule = module {
//    single { provideHttpClient() }
//    single { provideConverterFactory() }
//    single { provideRetrofit(get(),get()) }
//    single { UserWs(get()) }
    factory<UserRemoteDataSource> { UserRemoteDataSourceImpl() }
}