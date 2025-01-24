package com.example.huawei.di

import com.example.huawei.maps.HuaweiMapManagerImpl
import com.example.marketservices.maps.MarketMapManager
import org.koin.dsl.module

val huaweiModule = module {
    factory<MarketMapManager> { HuaweiMapManagerImpl() }
}