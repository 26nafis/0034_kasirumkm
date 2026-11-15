package com.example.kasirumkm.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val AppColors = lightColorScheme(
    primary = PrimaryBlue,
    secondary = DarkBlue,
    background = SurfaceGray,
    surface = androidx.compose.ui.graphics.Color.White,
    onPrimary = androidx.compose.ui.graphics.Color.White,
    onBackground = DarkText,
    onSurface = DarkText
)

@Composable
fun KasirUMKMTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = AppColors,
        content = content
    )
}
