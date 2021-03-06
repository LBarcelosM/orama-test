package com.lbarcelosm.oramatest.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Operability(
    val has_operations_on_thursdays: Boolean,
    val retrieval_liquidation_days_type: String,
    val application_quotation_days_type: String,
    val retrieval_quotation_days: Int,
    val anticipated_retrieval_quotation_days_type: String,
    val anticipated_retrieval_quotation_days_str: String,
    val retrieval_quotation_days_type: String,
    val anticipated_retrieval_quotation_days: Int,
    val has_operations_on_wednesdays: Boolean,
    val minimum_balance_permanence: String,
    val has_operations_on_mondays: Boolean,
    val has_grace_period: Boolean,
    val application_time_limit: String,
    val retrieval_time_limit: String,
    val has_operations_on_fridays: Boolean,
    val anticipate_retrieval_liquidation_days: Int,
    @SerializedName("minimum_initial_application_amount")
    val minimumInitialApplicationAmount: String,
    val anticipate_retrieval_liquidation_days_type: String,
    val retrieval_special_type: String,
    val anticipate_retrieval_liquidation_days_str: String,
    val application_quotation_days_str: String,
    val grace_period_in_days_str: Any,
    val retrieval_quotation_days_str: String,
    val grace_period_in_days: Int,
    val retrieval_liquidation_days_str: String,
    val minimum_subsequent_retrieval_amount: String,
    val retrieval_direct: Boolean,
    val retrieval_liquidation_days: Int,
    val application_quotation_days: Int,
    val max_balance_permanence: String,
    val maximum_initial_application_amount: String,
    val has_operations_on_tuesdays: Boolean,
    val minimum_subsequent_application_amount: String
): Serializable {
}