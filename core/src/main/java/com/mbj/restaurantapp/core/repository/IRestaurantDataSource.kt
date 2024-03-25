package com.mbj.restaurantapp.core.repository

import com.mbj.restaurantapp.core.entity.CategoryEntity
import com.mbj.restaurantapp.core.entity.EntityWrapper
import com.mbj.restaurantapp.core.entity.RestaurantDetailEntity


interface IRestaurantDataSource {
    suspend fun getCategories(): EntityWrapper<List<CategoryEntity>>
    suspend fun getRestaurantDetail(id: Int): RestaurantDetailEntity
}
