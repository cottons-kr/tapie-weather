package com.example.tapie_weather.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tapie_weather.components.common.Section

@Composable
fun AdditionalInfo() {
  Row(
    modifier = Modifier.padding(top = 16.dp),
  ) {
    Section(
      modifier = Modifier.weight(1f).height(100.dp),
    ) {
      Text(
        text = "정보",
        fontSize = 14.sp,
        color = Color.Gray,
      )
    }
    Spacer(modifier = Modifier.padding(6.dp))
    Section(
      modifier = Modifier.weight(1f).height(100.dp),
    ) {
      Text(
        text = "정보",
        fontSize = 14.sp,
        color = Color.Gray,
      )
    }
  }
}