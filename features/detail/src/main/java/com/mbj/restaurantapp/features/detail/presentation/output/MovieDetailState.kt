package com.mbj.restaurantapp.features.detail.presentation.output

sealed class RestaurantDetailState {
    object Initial: RestaurantDetailState()
    class Main(val detailEntity: com.mbj.restaurantapp.core.entity.RestaurantDetailEntity): RestaurantDetailState()
}
