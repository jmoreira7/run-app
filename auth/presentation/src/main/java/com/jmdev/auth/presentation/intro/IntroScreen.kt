package com.jmdev.auth.presentation.intro

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.jmdev.core.presentation.designsystem.RunAppTheme
import com.jmdev.core.presentation.designsystem.components.GradientBackground

@Composable
fun IntroScreenRoot(
    onSignUpClick: () -> Unit,
    onSignInClick: () -> Unit,
) {
    IntroScreen { action ->
        when (action) {
            IntroAction.OnSignInClick -> onSignInClick()
            IntroAction.OnSignUpClick -> onSignUpClick()
        }
    }
}

@Composable
fun IntroScreen(
    onAction: (IntroAction) -> Unit,
) {
    GradientBackground {
        // ToDo
    }
}

@Preview
@Composable
fun IntroScreenPreview() {
    RunAppTheme {
        IntroScreen(
            onAction = {}
        )
    }
}