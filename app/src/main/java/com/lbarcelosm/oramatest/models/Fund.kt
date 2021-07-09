package com.lbarcelosm.oramatest.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Fund(
    val initial_date: String,
    val performance_audios: List<Any>,
    val fees: Fees,
    val is_simple: Boolean,
    val description_seo: String,
    val operability: Operability,
    @SerializedName("full_name")
    val fullName: String,
    val opening_date: Any,
    val id: Int,
    val is_closed: Boolean,
    @SerializedName("simple_name")
    val simpleName: String,
    val target_fund: Any,
    val documents: List<Documents>,
    val specification: Specification,
    val quota_date: String,
    val tax_classification: String,
    val cnpj: String,
    val description: Description,
    val performance_videos: List<Any>,
    val is_active: Boolean,
    val benchmark: Benchmark,
    val orama_standard: Boolean,
    val slug: Boolean,
    val fund_situation: FundSituation,
    @SerializedName("volatility_12m")
    val volatility12m: String,
    val strategy_video: Any,
    val insurance_company_code: Any,
    val profitabilities: Profitabilities,
    val closed_to_capture_explanation: String,
    val closing_date: Any,
    val show_detailed_review: Boolean,
    val net_patrimony_12m: String,
    val is_closed_to_capture: Boolean,
    val fund_manager: FundManager,
    val esg_seal: Boolean
): Serializable {
}
