package com.inyongtisto.fishmarket.core.di

import com.inyongtisto.fishmarket.ui.auth.AuthViewModel
import com.inyongtisto.fishmarket.ui.navigation.NavViewModel
import com.inyongtisto.fishmarket.ui.toko.TokoViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { AuthViewModel(get()) }
    viewModel { TokoViewModel(get()) }
    viewModel { NavViewModel(get()) }
}