package com.mbj.restaurantapp.ui_component.config

import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import com.mbj.restaurantapp.ui_component.theme.color.ColorSet

data class ComponentConfig(
    val colors: ColorSet,
    val typography: Typography,
    val shapes: Shapes,
    val isDarkTheme: Boolean
)
