package com.e.spacex.network

import com.e.spacex.network.model.MissionResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MissionApiInterface {

    @GET("/v3/launches?order=desc")
    suspend fun fetchMissionAsync(
        @Query("order") order :String,
        @Query("limit") limit : Int,
        @Query("offset") offset : Int ): MissionResponse
}