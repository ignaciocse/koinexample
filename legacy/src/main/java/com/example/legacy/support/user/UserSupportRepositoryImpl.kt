package com.example.legacy.support.user

import com.example.support.user.UserSupportRepository

class UserSupportRepositoryImpl: UserSupportRepository {
    override fun getLegacyUser(): String = "Sir Michael"

}