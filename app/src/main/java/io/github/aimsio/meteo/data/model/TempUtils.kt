package io.github.aimsio.meteo.data.model

object TempUtils {

    fun KelvinToCelsius(kelvin: Double): Double {
        return kelvin - 273.5
    }
}