package com.example.splash.domain

import com.example.common.modularfilter.ModularFilterManager
import com.example.common.modularfilter.RaptorManager

interface GetRaptorValueUseCase {
    operator fun invoke(): String
}

class GetRaptorValueUseCaseImpl(
    private val raptorManager: RaptorManager,
): GetRaptorValueUseCase {
    override operator fun invoke(): String = raptorManager.raptorValue
}