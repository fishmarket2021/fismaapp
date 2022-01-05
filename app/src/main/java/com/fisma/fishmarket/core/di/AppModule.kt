package com.fisma.fishmarket.core.di

import com.fisma.fishmarket.core.data.source.local.LocalDataSource
import com.fisma.fishmarket.core.data.source.remote.RemoteDataSource
import com.fisma.fishmarket.core.data.source.remote.network.ApiConfig
import org.koin.dsl.module

val appModule = module {
    single { ApiConfig.provideApiService }

    single { RemoteDataSource(get()) }

    single { LocalDataSource() }
}