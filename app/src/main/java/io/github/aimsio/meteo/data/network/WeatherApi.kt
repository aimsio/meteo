package io.github.aimsio.meteo.data.network

import io.github.aimsio.meteo.data.model.weather.CurrentWeather
import io.github.aimsio.meteo.data.model.weather.FutureWeather
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("data/2.5/weather")
    suspend fun getCurrentWeather(
        @Query("q") city: String,
        @Query("appid") key: String = "<YOUR_TOKEN>"
    ): CurrentWeather

    @GET("data/2.5/forecast")
    suspend fun getFutureWeather(
        @Query("q") city: String,
        @Query("cnt") count: Int,
        @Query("appid") key: String = "<YOUR_TOKEN>"
    ): FutureWeather

}