package com.mbj.restaurantapp.features.feed.domain.usecase

import com.mbj.restaurantapp.core.entity.CategoryEntity
import com.mbj.restaurantapp.core.entity.EntityWrapper

interface IGetFeedCategoryUseCase {
    suspend operator fun invoke(): com.mbj.restaurantapp.core.entity.EntityWrapper<List<com.mbj.restaurantapp.core.entity.CategoryEntity>>
}
