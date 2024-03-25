package kr.co.fastcampus.part4plus.restaurantapp.features.common.network.api

import kr.co.fastcampus.part4plus.restaurantapp.features.common.network.model.RestaurantResponse
import kr.co.fastcampus.part4plus.restaurantapp.libraries.network.model.ApiResult

interface IRestaurantAppNetworkApi {
    suspend fun getRestaurantsList(): ApiResult<List<RestaurantResponse>>
}
