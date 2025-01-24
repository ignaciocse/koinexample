package com.example.common.currrencies

interface CurrencyFormatManager {
    fun convertToString(number: Number): String
}

class CurrencyFormatManagerImpl : CurrencyFormatManager {
    override fun convertToString(number: Number): String =  number.toString()

}