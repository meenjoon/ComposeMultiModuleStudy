package com.mbj.restaurantapp.core.repository

import com.mbj.restaurantapp.core.entity.CategoryEntity
import com.mbj.restaurantapp.core.entity.EntityWrapper
import com.mbj.restaurantapp.core.entity.RestaurantDetailEntity
import com.mbj.restaurantapp.core.mapper.CategoryMapper
import com.mbj.restaurantapp.core.network.api.IRestaurantAppNetworkApi
import com.mbj.restaurantapp.libraries.storage_contract.IStorage
import com.mbj.restaurantapp.libraries.storage_contract.constants.StorageKeys
import javax.inject.Inject

class RestaurantRepository @Inject constructor(
    private val restaurantNetworkApi: IRestaurantAppNetworkApi,
    private val storage: IStorage,
    private val categoryMapper: CategoryMapper
): IRestaurantDataSource {
    override suspend fun getCategories(): EntityWrapper<List<CategoryEntity>> {
        return categoryMapper.mapFromResult(
            result = restaurantNetworkApi.getRestaurantsList()
        )
    }

    override suspend fun getRestaurantDetail(id: Int): RestaurantDetailEntity {
        return storage
            .get<List<RestaurantDetailEntity>>(StorageKeys.RESTAURANT_LIST_KEY)
            ?.single { it.id == id }
            ?: RestaurantDetailEntity()
    }
}
