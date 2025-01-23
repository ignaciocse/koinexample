package com.example.home.ui

import androidx.lifecycle.ViewModel
import com.example.common.currrencies.CurrencyFormatManager
import com.example.common.currrencies.CurrencyFormatManagerImpl
import org.koin.core.component.KoinComponent
import org.koin.java.KoinJavaComponent.inject
//import org.koin.core.component.inject

/* With punctual injection */
class HomeViewModel : ViewModel() {
    private val currencyFormatManager: CurrencyFormatManager by inject(CurrencyFormatManager::class.java)
    fun printNumber(number: Number): String = currencyFormatManager.convertToString(number)
}

/* KoinComponent */
//class HomeViewModel : ViewModel(), KoinComponent {
//    private val currencyFormatManager: CurrencyFormatManager by inject()
//    fun printNumber(number: Number): String = currencyFormatManager.convertToString(number)
//}

/* Better option */
//class HomeViewModel(
//    private val currencyFormatManager: CurrencyFormatManager,
//) : ViewModel() {
//    fun printNumber(number: Number): String = currencyFormatManager.convertToString(number)
//}