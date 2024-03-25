package com.mbj.restaurantapp.core.mapper

import com.mbj.restaurantapp.core.entity.RestaurantDetailEntity

fun com.mbj.restaurantapp.core.network.model.RestaurantResponse.toDetailEntity(): com.mbj.restaurantapp.core.entity.RestaurantDetailEntity = RestaurantDetailEntity(
    id = this.id,
    latlng = this.latlng.toEntity(),
    cuisineType = this.cuisineType,
    address = this.address,
    operatingHours = this.operatingHours.toEntity(),
    reviews = this.reviews.map { it.toEntity() },
    neighborhood = this.neighborhood,
    name = this.name,
    photograph = this.photograph,
    rating = this.reviews.map { it.rating }.average().toFloat()
)

fun com.mbj.restaurantapp.core.network.model.RestaurantResponse.LatLngResponse.toEntity(): com.mbj.restaurantapp.core.entity.RestaurantDetailEntity.LatLngEntity =
    RestaurantDetailEntity.LatLngEntity(
        lat = this.lat,
        lng = this.lng
    )

fun com.mbj.restaurantapp.core.network.model.RestaurantResponse.OperatingHoursResponse.toEntity(): com.mbj.restaurantapp.core.entity.RestaurantDetailEntity.OperatingHoursEntity =
    RestaurantDetailEntity.OperatingHoursEntity(
        monday = this.monday,
        tuesday = this.tuesday,
        wednesday = this.wednesday,
        thursday = this.thursday,
        friday = this.friday,
        saturday = this.saturday,
        sunday = this.sunday
    )

fun com.mbj.restaurantapp.core.network.model.RestaurantResponse.ReviewResponse.toEntity(): com.mbj.restaurantapp.core.entity.RestaurantDetailEntity.ReviewEntity =
    RestaurantDetailEntity.ReviewEntity(
        name = this.name,
        date = this.date,
        rating = this.rating,
        comments = this.comments
    )

fun List<com.mbj.restaurantapp.core.entity.RestaurantFeedItemEntity>.toCategoryList(): List<com.mbj.restaurantapp.core.entity.CategoryEntity> {
    val feedList = this
    val neighborhoodSet = map { it.neighborhood }.toSet()

    return mutableListOf<com.mbj.restaurantapp.core.entity.CategoryEntity>().also { feedItems ->
        neighborhoodSet.forEachIndexed { index, neighborhoodName ->
            feedList
                .filter { it.neighborhood == neighborhoodName }
                .sortedByDescending { it.rating }
                .let {
                    feedItems.add(
                        com.mbj.restaurantapp.core.entity.CategoryEntity(
                            id = index,
                            neighborhood = neighborhoodName,
                            feedEntities = it
                        )
                    )
                }
        }
    }
}
