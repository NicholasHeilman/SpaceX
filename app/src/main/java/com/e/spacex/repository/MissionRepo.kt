package com.e.spacex.repository

import com.e.spacex.network.MissionApiInterface

class MissionRepo (private val apiInterface: MissionApiInterface){

    val offset = 0

    suspend fun  getMissions() = apiInterface.fetchMissionAsync("desc", 10 ,offset)
}
