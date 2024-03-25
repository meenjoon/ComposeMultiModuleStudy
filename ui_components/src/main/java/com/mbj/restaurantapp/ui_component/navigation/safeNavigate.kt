package com.mbj.restaurantapp.ui_component.navigation

import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.NavDeepLinkRequest

fun NavController.safeNavigate(url: String) {
//    currentDestination?.getAction(direction.actionId)?.run { navigate(direction) }

    currentDestination?.run {
        navigate(
            NavDeepLinkRequest.Builder
                .fromUri(uri = url.toUri())
                .build()
        )
    }
}
