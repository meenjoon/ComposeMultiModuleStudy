package com.mbj.restaurantapp.features.feed.domain.usecase

import javax.inject.Inject

class GetFeedCategoryUseCase @Inject constructor(
    private val dataSource: com.mbj.restaurantapp.core.repository.IRestaurantDataSource
) : IGetFeedCategoryUseCase {
    override suspend fun invoke(): com.mbj.restaurantapp.core.entity.EntityWrapper<List<com.mbj.restaurantapp.core.entity.CategoryEntity>> {
        return dataSource.getCategories()
    }
}
