package com.inyongtisto.fishmarket.core.data.source.remote.response

import com.inyongtisto.fishmarket.core.data.source.model.User

data class LoginResponse(
    val code: Int? = null,
    val message: String? = null,
    val data: User? = null
)