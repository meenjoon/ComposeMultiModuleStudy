package kr.co.fastcampus.part4plus.restaurantapp.features.common.entity

data class CategoryEntity(
    val id: Int,
    val neighborhood: String,
    val feedEntities: List<RestaurantFeedItemEntity>
)
