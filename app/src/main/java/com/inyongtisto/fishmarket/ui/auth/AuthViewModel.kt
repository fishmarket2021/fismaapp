package com.inyongtisto.fishmarket.ui.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.inyongtisto.fishmarket.core.data.repository.AppRepository
import com.inyongtisto.fishmarket.core.data.source.remote.request.LoginRequest
import com.inyongtisto.fishmarket.core.data.source.remote.request.RegisterRequest
import com.inyongtisto.fishmarket.core.data.source.remote.request.UpdateProfileRequest
import okhttp3.MultipartBody

class AuthViewModel(val repo: AppRepository) : ViewModel() {

    fun login(data: LoginRequest) = repo.login(data).asLiveData()

    fun register(data: RegisterRequest) = repo.register(data).asLiveData()

    fun updateUser(data: UpdateProfileRequest) = repo.updateUser(data).asLiveData()

    fun uploadUser(id: Int? = null, fileImage: MultipartBody.Part? = null) = repo.uploadUser(id, fileImage).asLiveData()
}