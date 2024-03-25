package com.mbj.restaurantapp.core.entity

import java.io.Serializable

open class RestaurantFeedItemEntity(
    open val id: Int = 0,
    open val neighborhood: String = "",
    open val name: String = "",
    open val photograph: String = "",
    open val rating: Float = 0f
): Serializable
