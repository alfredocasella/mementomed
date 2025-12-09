package com.mementomed.core.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.mementomed.core.ui.theme.MementoMedTheme

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MementoMedTheme {
        content()
    }
}

