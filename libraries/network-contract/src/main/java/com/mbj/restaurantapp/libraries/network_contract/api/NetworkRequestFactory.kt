package com.mbj.restaurantapp.libraries.network_contract.api

import com.mbj.restaurantapp.libraries.network_contract.model.ApiResult
import com.mbj.restaurantapp.libraries.network_contract.model.NetworkRequestInfo
import java.lang.reflect.Type

interface NetworkRequestFactory {

    suspend fun <T> create(
        url: String,
        requestInfo: NetworkRequestInfo = NetworkRequestInfo.Builder().build(),
        type: Type
    ): ApiResult<T>
}
