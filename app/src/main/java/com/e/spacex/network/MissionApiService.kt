package com.e.spacex.network

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object MissionApiService {

    private const val BASE_URL = "https://api.spacexdata.com"

   private val apiClient = OkHttpClient().newBuilder().build()

    private val retrofit = Retrofit.Builder().client(apiClient)
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()

    val missionApi: MissionApiInterface = retrofit.create(MissionApiInterface::class.java)
}