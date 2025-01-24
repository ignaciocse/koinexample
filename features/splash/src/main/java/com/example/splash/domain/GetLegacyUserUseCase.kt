package com.example.splash.domain

import com.example.support.user.UserSupportRepository

interface GetLegacyUserUseCase {
    operator fun invoke(): String
}

class GetLegacyUserUseCaseImpl(private val userSupportRepository: UserSupportRepository): GetLegacyUserUseCase {
    override operator fun invoke() = userSupportRepository.getLegacyUser()
}