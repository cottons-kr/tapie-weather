package com.example.tapie_weather.components.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tapie_weather.R

enum class Weather {
  CLOUDY,
  PARTLY_CLOUDY,
  SNOW
}

@Composable
fun WeatherIcon(
  weather: Weather,
  size: Int = 32
) {
  val imageModifier = Modifier.size(size.dp)
  when (weather) {
    Weather.CLOUDY -> {
      Image(
        modifier = imageModifier,
        painter = painterResource(id = R.drawable.cloudy),
        contentDescription = "Cloudy"
      )
    }
    Weather.PARTLY_CLOUDY -> {
      Image(
        modifier = imageModifier,
        painter = painterResource(id = R.drawable.partly_cloudy),
        contentDescription = "Partly Cloudy"
      )
    }
    Weather.SNOW -> {
      Image(
        modifier = imageModifier,
        painter = painterResource(id = R.drawable.snow),
        contentDescription = "Snow"
      )
    }
  }
}
