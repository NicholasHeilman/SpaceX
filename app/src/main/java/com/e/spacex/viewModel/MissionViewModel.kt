package com.e.spacex.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.e.spacex.network.MissionApiService
import com.e.spacex.repository.MissionRepo
import kotlinx.coroutines.Dispatchers

class MissionViewModel : ViewModel() {
    private val missionRepository : MissionRepo = MissionRepo(MissionApiService.missionApi)
    val missionLiveData = liveData(Dispatchers.IO) {
        val data = missionRepository.getMissions()
        emit(data)

    }
}