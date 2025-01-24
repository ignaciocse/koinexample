package com.example.splash.domain

import com.example.support.user.SupportRepository

interface GetLegacyUserUseCase {
    operator fun invoke(): String
}

class GetLegacyUserUseCaseImpl(private val supportRepository: SupportRepository): GetLegacyUserUseCase {
    override operator fun invoke() = supportRepository.getLegacyUser()
}