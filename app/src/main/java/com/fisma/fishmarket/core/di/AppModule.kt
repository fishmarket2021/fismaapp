package com.inyongtisto.fishmarket.core.di

import com.inyongtisto.fishmarket.core.data.source.local.LocalDataSource
import com.inyongtisto.fishmarket.core.data.source.remote.RemoteDataSource
import com.inyongtisto.fishmarket.core.data.source.remote.network.ApiConfig
import org.koin.dsl.module

val appModule = module {
    single { ApiConfig.provideApiService }

    single { RemoteDataSource(get()) }

    single { LocalDataSource() }
}