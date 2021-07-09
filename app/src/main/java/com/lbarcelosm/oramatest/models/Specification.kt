package com.lbarcelosm.oramatest.models

import java.io.Serializable

data class Specification(
    val fund_main_strategy_name: String,
    val fund_suitability_profile: FundProfile,
    val fund_risk_profile: FundProfile,
    val fund_main_strategy_explanation: String,
    val fund_type: String,
    val fund_class: String,
    val fund_macro_strategy:  FundStrategy,
    val fund_class_anbima: String,
    val fund_main_strategy: FundStrategy,
    val is_qualified: Boolean
): Serializable {
}