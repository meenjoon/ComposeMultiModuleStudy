package com.mbj.restaurantapp.features.detail.domain.usecase

import javax.inject.Inject

class GetRestaurantDetailUseCase @Inject constructor(
    private val dataSource: com.mbj.restaurantapp.core.repository.IRestaurantDataSource
) : IGetRestaurantDetailUseCase {
    override suspend fun invoke(id: Int): com.mbj.restaurantapp.core.entity.RestaurantDetailEntity {
        return dataSource.getRestaurantDetail(id)
    }
}
