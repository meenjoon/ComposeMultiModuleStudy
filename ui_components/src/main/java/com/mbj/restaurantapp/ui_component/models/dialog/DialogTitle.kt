package com.mbj.restaurantapp.ui_component.models.dialog

sealed class DialogTitle(
    open val text: String
) {
    data class Default(
        override val text: String
    ): DialogTitle(text)

    data class Header(
        override val text: String
    ): DialogTitle(text)

    data class Large(
        override val text: String
    ): DialogTitle(text)
}
