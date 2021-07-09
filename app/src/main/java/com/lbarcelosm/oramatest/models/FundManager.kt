package com.lbarcelosm.oramatest.models

import java.io.Serializable

data class FundManager(
    val description: String,
    val id: Int,
    val full_name: String,
    val logo: String,
    val slug: String,
    val name: String
): Serializable {
}