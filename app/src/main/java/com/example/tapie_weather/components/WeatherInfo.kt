package com.example.tapie_weather.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WeatherInfo() {
  Column(
    modifier = Modifier
      .padding(24.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
  ) {
    Spacer(modifier = Modifier.padding(2.dp))
    Text(
      text = "서울특별시",
      fontSize = 14.sp,
    )
    Spacer(modifier = Modifier.padding(12.dp))
    Text(
      text = "-0.6°",
      fontSize = 42.sp,
      fontWeight = FontWeight.SemiBold,
      color = MaterialTheme.colorScheme.primary,
    )
    Spacer(modifier = Modifier.padding(8.dp))
    Text(
      text = "흐림",
      fontSize = 14.sp,
    )
    Row(
      modifier = Modifier.padding(4.dp),
    ) {
      DetailedInfo(label = "체감", value = "-0.6")
      DetailedInfo(label = "습도", value = "88%")
      DetailedInfo(label = "북동풍", value = "1m/s")
    }
  }
}

@Composable
fun DetailedInfo(label: String, value: String) {
  Row(
    modifier = Modifier.padding(6.dp),
  ) {
    Text(
      text = label,
      fontSize = 14.sp,
      color = Color.Gray,
    )
    Spacer(modifier = Modifier.padding(2.dp))
    Text(
      text = value,
      fontSize = 14.sp,
      fontWeight = FontWeight.Medium,
    )
  }
}
