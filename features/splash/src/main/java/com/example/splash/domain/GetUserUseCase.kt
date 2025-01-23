package com.example.splash.domain

import com.example.repository.user.UserRepository

interface GetUserUseCase {
    operator fun invoke(): String
}

class GetUserUseCaseImpl(private val userRepository: UserRepository): GetUserUseCase {
    override operator fun invoke() = userRepository.getUser()
}