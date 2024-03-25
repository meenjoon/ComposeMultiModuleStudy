package com.mbj.restaurantapp.ui_component.models.buttons

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LeadingIconData(
    @DrawableRes val iconDrawable: Int,
    @StringRes val iconContentDescription: Int?
)
