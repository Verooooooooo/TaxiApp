package org.veronica.taxi_app_shared.domain.models

data class RideIntent(
    val id: String,
    val origin: FullAddress?,
    val destination: FullAddress?,
    val price: Double,
    val useSuggestedPrice: Boolean,
    val suggestedPrice: Double,
    val comment: String
) {
    companion object {
        fun new(id: String) = RideIntent(
            id = id,
            origin = null,
            destination = null,
            price = 0.0,
            useSuggestedPrice = false,
            suggestedPrice = 0.0,
            comment = ""
        )
    }

}