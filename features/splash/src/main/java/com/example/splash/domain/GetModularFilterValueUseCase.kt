package com.example.splash.domain

import com.example.common.modularfilter.ModularFilterManager

interface GetModularFilterValueUseCase {
    operator fun invoke(): String
}

class GetModularFilterValueUseCaseImpl(
    private val modularFilterManager: ModularFilterManager,
): GetModularFilterValueUseCase {
    override operator fun invoke(): String = modularFilterManager.modularFilterValue
}