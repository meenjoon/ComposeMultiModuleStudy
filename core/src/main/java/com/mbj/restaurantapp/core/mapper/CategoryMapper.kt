package com.mbj.restaurantapp.core.mapper

import com.mbj.restaurantapp.core.entity.CategoryEntity
import com.mbj.restaurantapp.core.network.model.RestaurantResponse
import com.mbj.restaurantapp.libraries.storage_contract.IStorage
import com.mbj.restaurantapp.libraries.storage_contract.constants.StorageKeys
import javax.inject.Inject

class CategoryMapper @Inject constructor(
    private val storage: IStorage
): BaseMapper<List<RestaurantResponse>, List<CategoryEntity>>() {
    override fun getSuccess(
        model: List<com.mbj.restaurantapp.core.network.model.RestaurantResponse>?,
        extra: Any?
    ): com.mbj.restaurantapp.core.entity.EntityWrapper.Success<List<com.mbj.restaurantapp.core.entity.CategoryEntity>> {
        return model?.let {
            com.mbj.restaurantapp.core.entity.EntityWrapper.Success(
                entity = mutableListOf<com.mbj.restaurantapp.core.entity.RestaurantDetailEntity>()
                    .apply {
                        addAll(model.map{ item -> item.toDetailEntity() })
                    }
                    .also {
                        storage.save(StorageKeys.RESTAURANT_LIST_KEY, it)
                    }
                    .toCategoryList()
            )
        } ?: com.mbj.restaurantapp.core.entity.EntityWrapper.Success(
                entity = listOf()
            )
    }

    override fun getFailure(error: Throwable): com.mbj.restaurantapp.core.entity.EntityWrapper.Fail<List<com.mbj.restaurantapp.core.entity.CategoryEntity>> {
        return com.mbj.restaurantapp.core.entity.EntityWrapper.Fail(error)
    }
}
