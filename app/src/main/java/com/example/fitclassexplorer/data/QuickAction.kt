package com.example.fitclassexplorer.data

import androidx.compose.ui.graphics.vector.ImageVector

data class QuickAction(
    val title: String,
    val icon: ImageVector,
    val onClick: () -> Unit
)
