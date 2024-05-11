package com.example.tapie_weather.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tapie_weather.components.common.Section
import com.example.tapie_weather.components.common.Weather
import com.example.tapie_weather.components.common.WeatherIcon

@Composable
fun WeeklyWeather() {
  Spacer(modifier = Modifier.padding(8.dp))
  Section(
    modifier = Modifier.fillMaxWidth()
  ) {
    Column {
      Text(
        text = "주간 예보",
        fontSize = 14.sp,
        color = Color.Gray,
      )
      Spacer(modifier = Modifier.padding(2.dp))
      Column {
        DailyContent(
          label = "화",
          weather = Weather.SNOW,
          minimumTemperature = 13,
          maximumTemperature = 31,
          progress = 0.7f,
          selected = true,
        )
        DailyContent(
          label = "수",
          weather = Weather.SNOW,
          minimumTemperature = 30,
          maximumTemperature = 21,
          progress = 0.7f,
        )
        DailyContent(
          label = "목",
          weather = Weather.SNOW,
          minimumTemperature = 8,
          maximumTemperature = 14,
          progress = 0.7f,
        )
        DailyContent(
          label = "금",
          weather = Weather.SNOW,
          minimumTemperature = 20,
          maximumTemperature = 10,
          progress = 0.7f,
        )
        DailyContent(
          label = "토",
          weather = Weather.SNOW,
          minimumTemperature = 31,
          maximumTemperature = 16,
          progress = 0.7f,
        )
      }
    }
  }
}

@Composable
fun DailyContent(
  label: String,
  weather: Weather,
  minimumTemperature: Int,
  maximumTemperature: Int,
  progress: Float,
  selected: Boolean = false,
) {
  val color = if (selected) Color.LightGray else Color.Gray

  Row(
    modifier = Modifier
      .drawBehind {
        drawLine(
          color = Color.Gray.copy(alpha = 0.08f),
          start = Offset(0f, size.height),
          end = Offset(size.width, size.height),
          strokeWidth = 1.dp.toPx()
        )
      }
      .padding(0.dp, 12.dp)
      .fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.CenterVertically,
  ) {
    Text(
      text = label,
      fontSize = 13.sp,
      fontWeight = FontWeight.SemiBold,
      color = color,
    )
    WeatherIcon(
      weather = weather,
      size = 22
    )
    TemperatureBar(
      minimumTemperature = minimumTemperature,
      maximumTemperature = maximumTemperature,
      progress = progress,
      color = color,
    )
  }
}

@Composable
fun TemperatureBar(
  minimumTemperature: Int,
  maximumTemperature: Int,
  progress: Float,
  color: Color,
) {
  Row(
    verticalAlignment = Alignment.CenterVertically,
  ) {
    Text(
      text = "$minimumTemperature°",
      fontSize = 12.sp,
      color = color,
    )
    Spacer(modifier = Modifier.padding(5.dp))
    Box(
      modifier = Modifier
        .clip(RoundedCornerShape(2.dp))
        .width(100.dp)
        .height(5.dp)
    ) {
      Spacer(
        modifier = Modifier
          .fillMaxWidth()
          .height(5.dp)
          .background(color = Color.Gray.copy(alpha = 0.1f))
      )
      Spacer(
        modifier = Modifier
          .clip(RoundedCornerShape(2.dp))
          .background(color = MaterialTheme.colorScheme.primary)
          .width(100.dp * progress)
          .height(5.dp),
      )
    }
    Spacer(modifier = Modifier.padding(5.dp))
    Text(
      text = "$maximumTemperature°",
      fontSize = 12.sp,
      fontWeight = FontWeight.Medium,
      color = color,
    )
  }
}