package com.example.repository.user

import com.example.datasource.user.UserRemoteDataSource

class UserRepositoryImpl(private val remote: UserRemoteDataSource): UserRepository {
    override fun getUser(): String = remote.getUser()
}