package com.example.fooddelivery.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

private  val  InriasanFontFamily = FontFamily(

    Font(R.font.font_bold,FontWeight.Bold, FontStyle.Normal),
            Font(R.font.font_regular,FontWeight.Normal, FontStyle.Normal),
Font(R.font.font_light,FontWeight.Light, FontStyle.Normal)

)

@Immutable
data class  AppFont