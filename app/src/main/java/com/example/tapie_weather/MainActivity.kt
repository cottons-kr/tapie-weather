package com.example.tapie_weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tapie_weather.components.AdditionalInfo
import com.example.tapie_weather.components.WeatherInfo
import com.example.tapie_weather.components.WeeklyWeather
import com.example.tapie_weather.components.WeeklyWeatherOverview
import com.example.tapie_weather.ui.theme.TapieweatherTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      TapieweatherTheme {
        Surface(
          modifier = Modifier
            .background(color = MaterialTheme.colorScheme.background)
            .fillMaxSize()
            .padding(16.dp),
          color = MaterialTheme.colorScheme.background,
        ) {
          Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
          ) {
            WeatherInfo()
            WeeklyWeatherOverview()
            AdditionalInfo()
            WeeklyWeather()
          }
        }
      }
    }
  }
}


