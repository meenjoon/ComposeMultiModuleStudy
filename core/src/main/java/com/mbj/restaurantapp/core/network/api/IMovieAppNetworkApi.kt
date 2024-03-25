package com.mbj.restaurantapp.core.network.api

import com.mbj.restaurantapp.core.network.model.RestaurantResponse
import com.mbj.restaurantapp.libraries.network_contract.model.ApiResult

interface IRestaurantAppNetworkApi {
    suspend fun getRestaurantsList(): ApiResult<List<RestaurantResponse>>
}
