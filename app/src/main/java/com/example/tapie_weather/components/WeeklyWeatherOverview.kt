package com.example.tapie_weather.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tapie_weather.components.common.Section
import com.example.tapie_weather.components.common.Weather
import com.example.tapie_weather.components.common.WeatherIcon

@Composable
fun WeeklyWeatherOverview() {
  val (selectedDay, setSelectedDay) = remember { androidx.compose.runtime.mutableStateOf("지금") }

  @Composable
  fun WrappedDailyOverview(
    label: String,
    weather: Weather,
    temperature: Int,
  ) {
    DailyOverview(
      label = label,
      weather = weather,
      temperature = temperature,
      selectedDay = selectedDay,
      setSelectedDay = setSelectedDay,
    )
  }

  Section(
    modifier = Modifier.fillMaxWidth(),
  ) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(top = 8.dp, bottom = 8.dp),
      horizontalArrangement = Arrangement.SpaceBetween,
    ) {
      WrappedDailyOverview(label = "지금", weather = Weather.CLOUDY, temperature = -1)
      WrappedDailyOverview(label = "05", weather = Weather.CLOUDY, temperature = -1)
      WrappedDailyOverview(label = "06", weather = Weather.CLOUDY, temperature = -1)
      WrappedDailyOverview(label = "07", weather = Weather.PARTLY_CLOUDY, temperature = -1)
      WrappedDailyOverview(label = "08", weather = Weather.SNOW, temperature = -4)
      WrappedDailyOverview(label = "09", weather = Weather.SNOW, temperature = -4)
    }
  }
}

@Composable
fun DailyOverview(
  label: String,
  weather: Weather,
  temperature: Int,
  selectedDay: String,
  setSelectedDay: (String) -> Unit,
) {
  val selected = selectedDay == label
  Column(
    modifier = Modifier
      .clip(RoundedCornerShape(10.dp))
      .background(color = if (selected) Color.Gray.copy(alpha = 0.07f) else Color.Transparent)
      .padding(12.dp, 8.dp)
      .clickable { setSelectedDay(label) },
    horizontalAlignment = Alignment.CenterHorizontally,
  ) {
    Text(
      text = label,
      fontSize = 11.sp,
      color = Color.LightGray,
    )
    Spacer(modifier = Modifier.padding(4.dp))
    WeatherIcon(weather = weather)
    Spacer(modifier = Modifier.padding(4.dp))
    Text(
      text = "$temperature°",
      fontSize = 14.sp,
      fontWeight = FontWeight.SemiBold,
    )
  }
}