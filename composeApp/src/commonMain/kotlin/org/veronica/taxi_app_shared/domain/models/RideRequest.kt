package org.veronica.taxi_app_shared.domain.models

data class RideRequest(
    private val id: Long,
    private val origin: FullAddress,
    private val destination: FullAddress,
    private val price: Double,
    private val comment: String
)
