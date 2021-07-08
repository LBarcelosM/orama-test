package com.lbarcelosm.oramatest.services

import com.google.gson.GsonBuilder
import com.lbarcelosm.oramatest.utils.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

open class HTTPServiceBase {
    private var retrofit: Retrofit? = null;


    fun okHttpClient() : OkHttpClient {
        return OkHttpClient()
            .newBuilder()
            .readTimeout(30, TimeUnit.SECONDS)
            .build();
    }

    protected fun getRetrofit() : Retrofit
    {
        if (retrofit == null) {
            val gson = GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                .create()
            val gsonConverterFactory = GsonConverterFactory.create(gson);
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient())
                .addConverterFactory(gsonConverterFactory)
                .build()
        }
        return retrofit!!;
    }
}