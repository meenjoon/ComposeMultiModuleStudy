package com.mbj.restaurantapp.features.feed.domain.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.mbj.restaurantapp.features.feed.domain.usecase.GetFeedCategoryUseCase
import com.mbj.restaurantapp.features.feed.domain.usecase.IGetFeedCategoryUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class FeedUseCaseModule {

    @Singleton
    @Binds
    abstract fun bindGetRestaurantListUseCase(getRestaurantListUseCase: GetFeedCategoryUseCase): IGetFeedCategoryUseCase
}
