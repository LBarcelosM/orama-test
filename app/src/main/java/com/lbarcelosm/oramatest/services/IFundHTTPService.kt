package com.lbarcelosm.oramatest.services

import com.lbarcelosm.oramatest.models.Fund
import retrofit2.Call
import retrofit2.http.GET

interface IFundHTTPService {
    @GET("json/fund_detail_full.json?serializ%20er=fund_detail_full")
    fun getFunds(): Call<List<Fund>?>
}