package com.lbarcelosm.oramatest.models

import java.io.Serializable

data class Documents(
    val position: Int,
    val document_type: String,
    val name: String,
    val document_url: String
    ): Serializable {
}