package com.fisma.fishmarket.ui.navigation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.fisma.fishmarket.core.data.repository.AppRepository

class NavViewModel(val repo: AppRepository) : ViewModel() {
    fun getUser(id: Int) = repo.getUser(id).asLiveData()
}