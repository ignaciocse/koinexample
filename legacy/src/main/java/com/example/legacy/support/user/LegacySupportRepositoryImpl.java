package com.example.legacy.support.user;

import androidx.annotation.NonNull;

import com.example.support.user.SupportRepository;

public class LegacySupportRepositoryImpl implements SupportRepository {

    @NonNull
    @Override
    public String getLegacyUser() {
        return "Sir Michael Father";
    }
}
