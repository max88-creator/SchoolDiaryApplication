package com.max_grank.schooldiaryapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.max_grank.schooldiaryapp.R

// Set of Material typography styles to start with


val AppFontFamily = FontFamily(
    Font(R.font.poppins_bold, FontWeight.Bold)
)

val Typography =Typography().let { base ->
    Typography(
        bodyLarge = base.bodyLarge.copy(fontFamily = com.max_grank.schooldiaryapp.ui.theme.AppFontFamily),
        titleLarge = base.titleLarge.copy(fontFamily = com.max_grank.schooldiaryapp.ui.theme.AppFontFamily),
    )
}

val Typography2 = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)