package com.example.tapie_weather.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tapie_weather.R

val wantedSansFamily = FontFamily(
  Font(R.font.wantedsans_regular, FontWeight.Normal),
  Font(R.font.wantedsans_medium, FontWeight.Medium),
  Font(R.font.wantedsans_semibold, FontWeight.SemiBold),
  Font(R.font.wantedsans_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
  bodyLarge = TextStyle(
    fontFamily = wantedSansFamily,
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,
    lineHeight = 24.sp,
    letterSpacing = 0.5.sp
  )
)