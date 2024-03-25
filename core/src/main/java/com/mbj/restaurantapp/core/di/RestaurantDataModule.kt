package com.mbj.restaurantapp.core.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.mbj.restaurantapp.core.network.api.IRestaurantAppNetworkApi
import com.mbj.restaurantapp.core.network.api.RestaurantAppNetworkApi
import com.mbj.restaurantapp.core.repository.IRestaurantDataSource
import com.mbj.restaurantapp.core.repository.RestaurantRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RestaurantDataModule {

    @Singleton
    @Binds
    abstract fun bindRestaurantRepository(restaurantRepository: com.mbj.restaurantapp.core.repository.RestaurantRepository): com.mbj.restaurantapp.core.repository.IRestaurantDataSource

    @Singleton
    @Binds
    abstract fun bindNetwork(networkApi: com.mbj.restaurantapp.core.network.api.RestaurantAppNetworkApi): com.mbj.restaurantapp.core.network.api.IRestaurantAppNetworkApi

}
