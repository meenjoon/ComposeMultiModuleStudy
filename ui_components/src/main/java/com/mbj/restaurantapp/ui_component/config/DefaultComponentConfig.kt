package com.mbj.restaurantapp.ui_component.config

import com.mbj.restaurantapp.ui_component.theme.Shapes
import com.mbj.restaurantapp.ui_component.theme.color.ColorSet
import com.mbj.restaurantapp.ui_component.theme.Typography

object DefaultComponentConfig {
    val RED_THEME = ComponentConfig(
        colors = ColorSet.Red,
        shapes = Shapes,
        typography = Typography,
        isDarkTheme = false
    )

    val BLUE_THEME = ComponentConfig(
        colors = ColorSet.Blue,
        shapes = Shapes,
        typography = Typography,
        isDarkTheme = false
    )

    private var currentConfig = RED_THEME
    private var themeColorSet: ColorSet = ColorSet.Red
}

