package com.example.common.modularfilter;

import org.koin.java.KoinJavaComponent;

public class ModularFilterManager {

    private final MSpotsManager mSpotsManager = KoinJavaComponent.get(MSpotsManager.class);

    public String getModularFilterValue() {
        return mSpotsManager.getMSpotValue();
    }
}
