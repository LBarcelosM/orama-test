package com.lbarcelosm.oramatest.models

import java.io.Serializable

data class FundProfile(
    val score_range_order: Int,
    val name: String
): Serializable {
}