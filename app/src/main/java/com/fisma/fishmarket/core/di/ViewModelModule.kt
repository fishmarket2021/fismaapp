package com.fisma.fishmarket.core.di

import com.fisma.fishmarket.ui.auth.AuthViewModel
import com.fisma.fishmarket.ui.navigation.NavViewModel
import com.fisma.fishmarket.ui.toko.TokoViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { AuthViewModel(get()) }
    viewModel { TokoViewModel(get()) }
    viewModel { NavViewModel(get()) }
}