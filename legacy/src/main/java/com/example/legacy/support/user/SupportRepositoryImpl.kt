package com.example.legacy.support.user

import com.example.support.user.SupportRepository

class SupportRepositoryImpl: SupportRepository {
    override fun getLegacyUser(): String = "Sir Michael Junior"

}