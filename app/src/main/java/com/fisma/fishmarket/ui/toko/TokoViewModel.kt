package com.fisma.fishmarket.ui.toko

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.fisma.fishmarket.core.data.repository.AppRepository
import com.fisma.fishmarket.core.data.source.remote.request.CreateTokoRequest

class TokoViewModel(val repo: AppRepository) : ViewModel() {
    fun createToko(data: CreateTokoRequest) = repo.createToko(data).asLiveData()
}