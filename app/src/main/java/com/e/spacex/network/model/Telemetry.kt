package com.e.spacex.network.model


import com.squareup.moshi.Json


data class Telemetry(

	@Json(name="flight_club")
	val flightClub: Any? = null
)