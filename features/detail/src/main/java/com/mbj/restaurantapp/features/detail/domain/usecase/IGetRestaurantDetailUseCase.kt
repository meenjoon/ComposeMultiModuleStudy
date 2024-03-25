package com.mbj.restaurantapp.features.detail.domain.usecase

import com.mbj.restaurantapp.core.entity.RestaurantDetailEntity

interface IGetRestaurantDetailUseCase {
    suspend operator fun invoke(id: Int): com.mbj.restaurantapp.core.entity.RestaurantDetailEntity
}
