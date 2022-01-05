package com.fisma.fishmarket.core.di

import com.fisma.fishmarket.core.data.repository.AppRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { AppRepository(get(), get()) }
}