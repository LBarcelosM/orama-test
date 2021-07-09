package com.lbarcelosm.oramatest.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Description(
    val objective: String,
    val movie_url: Any,
    @SerializedName("target_audience")
    val targetAudience: String,
    val strengths: String,
    val strategy: String
): Serializable {
}