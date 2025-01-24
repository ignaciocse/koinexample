package com.example.google.di

import com.example.google.maps.GoogleMapManagerImpl
import com.example.marketservices.maps.MarketMapManager
import org.koin.dsl.module

val googleModule = module {
    factory<MarketMapManager> { GoogleMapManagerImpl() }
}