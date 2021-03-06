package com.lbarcelosm.oramatest.models

import java.io.Serializable

data class FundStrategy(
    val explanation: String,
    val fund_macro_strategy: Int?,
    val id: Int,
    val name: String
): Serializable {
}