package com.lbarcelosm.oramatest.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

data class Fees(
    val maximum_administration_fee: String,
    val anticipated_retrieval_fee_value: String,
    val administration_fee: String,
    val anticipated_retrieval_fee: String,
    @SerializedName("performance_fee")
    val performanceFee: String,
    val has_anticipated_retrieval: Boolean
): Serializable {
}