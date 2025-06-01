package com.jmdev.core.presentation.designsystem

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

val DarkColorScheme = darkColorScheme(
    primary = RunAppDodgerBlue,
    background = RunAppBlack,
    surface = RunAppDarkGray,
    secondary = RunAppWhite,
    tertiary = RunAppWhite,
    primaryContainer = RunAppDodgerBlue30,
    onPrimary = RunAppWhite,
    onBackground = RunAppWhite,
    onSurface = RunAppWhite,
    onSurfaceVariant = RunAppGray,
    error = RunAppDarkRed
)

@Composable
fun RunAppTheme(
    // Dynamic color is available on Android 12+
    content: @Composable () -> Unit
) {
    val colorScheme = DarkColorScheme
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}