package com.lbarcelosm.oramatest.models

import java.util.*

data class Fees(
    val maximum_administration_fee: String,
    val anticipated_retrieval_fee_value: String,
    val administration_fee: String,
    val anticipated_retrieval_fee: String,
    val performance_fee: String,
    val has_anticipated_retrieval: Boolean
) {
}