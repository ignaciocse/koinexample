package com.example.api.user

import com.example.datasource.user.UserRemoteDataSource

class UserRemoteDataSourceImpl(
//    userWs: UserWs
): UserRemoteDataSource {
    override fun getUser(): String = "Sir Nicholas"
}