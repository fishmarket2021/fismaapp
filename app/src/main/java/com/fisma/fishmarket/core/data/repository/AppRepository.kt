package com.fisma.fishmarket.core.data.repository

import com.fisma.fishmarket.core.data.source.local.LocalDataSource
import com.fisma.fishmarket.core.data.source.remote.RemoteDataSource
import com.fisma.fishmarket.core.data.source.remote.network.Resource
import com.fisma.fishmarket.core.data.source.remote.request.CreateTokoRequest
import com.fisma.fishmarket.core.data.source.remote.request.LoginRequest
import com.fisma.fishmarket.core.data.source.remote.request.RegisterRequest
import com.fisma.fishmarket.core.data.source.remote.request.UpdateProfileRequest
import com.fisma.fishmarket.util.Prefs
import com.inyongtisto.myhelper.extension.getErrorBody
import com.inyongtisto.myhelper.extension.logs
import kotlinx.coroutines.flow.flow
import okhttp3.MultipartBody
import java.lang.Exception

class AppRepository(val local: LocalDataSource, val remote: RemoteDataSource) {

    fun login(data: LoginRequest) = flow {
        emit(Resource.loading(null))
        try {
            remote.login(data).let {
                if (it.isSuccessful) {
                    Prefs.isLogin = true
                    val body = it.body()
                    val user = body?.data
                    Prefs.setUser(user)
                    emit(Resource.success(user))
                    logs("succes:" + body.toString())
                } else {
                    emit(Resource.error(it.getErrorBody()?.message ?: "Default error dongs", null))
                    logs("Error:" + "keteragan error")
                }
            }
        } catch (e: Exception) {
            emit(Resource.error(e.message ?: "Terjadi Kesalahan", null))
            logs("Error:" + e.message)
        }
    }

    fun register(data: RegisterRequest) = flow {
        emit(Resource.loading(null))
        try {
            remote.register(data).let {
                if (it.isSuccessful) {
                    Prefs.isLogin = true
                    val body = it.body()
                    val user = body?.data
                    Prefs.setUser(user)
                    emit(Resource.success(user))
                    logs("succes:" + body.toString())
                } else {
                    emit(Resource.error(it.getErrorBody()?.message ?: "Default error dongs", null))
                    logs("Error:" + "keteragan error")
                }
            }
        } catch (e: Exception) {
            emit(Resource.error(e.message ?: "Terjadi Kesalahan", null))
            logs("Error:" + e.message)
        }
    }

    fun updateUser(data: UpdateProfileRequest) = flow {
        emit(Resource.loading(null))
        try {
            remote.updateUser(data).let {
                if (it.isSuccessful) {
                    val body = it.body()
                    val user = body?.data
                    Prefs.setUser(user)
                    emit(Resource.success(user))
                } else {
                    emit(Resource.error(it.getErrorBody()?.message ?: "Default error dongs", null))
                }
            }
        } catch (e: Exception) {
            emit(Resource.error(e.message ?: "Terjadi Kesalahan", null))
        }
    }

    fun uploadUser(id: Int? = null, fileImage: MultipartBody.Part? = null) = flow {
        emit(Resource.loading(null))
        try {
            remote.uploadUser(id, fileImage).let {
                if (it.isSuccessful) {
                    val body = it.body()
                    val user = body?.data
                    Prefs.setUser(user)
                    emit(Resource.success(user))
                } else {
                    emit(Resource.error(it.getErrorBody()?.message ?: "Default error dongs", null))
                }
            }
        } catch (e: Exception) {
            emit(Resource.error(e.message ?: "Terjadi Kesalahan", null))
        }
    }

    fun createToko(data: CreateTokoRequest) = flow {
        emit(Resource.loading(null))
        try {
            remote.createToko(data).let {
                if (it.isSuccessful) {
                    val body = it.body()?.data
                    emit(Resource.success(body))
                } else {
                    emit(Resource.error(it.getErrorBody()?.message ?: "Default error dongs", null))
                }
            }
        } catch (e: Exception) {
            emit(Resource.error(e.message ?: "Terjadi Kesalahan", null))
        }
    }

    fun getUser(id: Int? = null) = flow {
        emit(Resource.loading(null))
        try {
            remote.getUser(id).let {
                if (it.isSuccessful) {
                    val body = it.body()
                    val user = body?.data
                    Prefs.setUser(user)
                    emit(Resource.success(user))
                } else {
                    emit(Resource.error(it.getErrorBody()?.message ?: "Default error dongs", null))
                }
            }
        } catch (e: Exception) {
            emit(Resource.error(e.message ?: "Terjadi Kesalahan", null))
        }
    }

}