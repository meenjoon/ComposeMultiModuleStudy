package com.mbj.restaurantapp.features.feed.presentation.output


sealed class FeedState {
    object Loading: FeedState()
    class Main(
        val categories: List<com.mbj.restaurantapp.core.entity.CategoryEntity>
    ): FeedState()
    class Failed(
        val reason: String
    ): FeedState()
}
