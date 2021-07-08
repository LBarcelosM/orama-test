package com.lbarcelosm.oramatest.services

import com.google.gson.GsonBuilder
import com.lbarcelosm.oramatest.utils.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FundHTTPService: HTTPServiceBase() {
    fun getService() : IFundHTTPService
    {
        val retrofit = getRetrofit()
        return retrofit.create(IFundHTTPService::class.java)
    }
}