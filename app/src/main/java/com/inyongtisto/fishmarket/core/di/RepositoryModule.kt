package com.inyongtisto.fishmarket.core.di

import com.inyongtisto.fishmarket.core.data.repository.AppRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { AppRepository(get(), get()) }
}