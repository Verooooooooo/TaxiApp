package org.veronica.taxi_app_shared.data.repos

import com.google.android.gms.maps.model.LatLng
import org.veronica.taxi_app_shared.domain.models.FullAddress
import org.veronica.taxi_app_shared.domain.models.RideIntent
import org.veronica.taxi_app_shared.domain.repos.RideIntentsRepo
import org.veronica.taxiapp.db.AppDatabase

class SqlRideIntentsRepo(
    private val db: AppDatabase
) : RideIntentsRepo {
    override fun getUserRideIntent(userId: String): RideIntent? {
        val rideIntentEntry = db.rideIntentQueries.getRideIntentFor(userId).executeAsOneOrNull()
        return rideIntentEntry?.let {
            RideIntent(
                id = it.id,
                origin = if (it.originAddress != null && it.originLatitude != null && it.originLongitude != null) {
                    FullAddress(
                        address = it.originAddress,
                        location = LatLng(
                            it.originLatitude,
                            it.originLongitude
                        )
                    )
                } else {
                    null
                },
                destination = if (it.destinationAddress != null && it.destinationLatitude != null && it.destinationLongitude != null) {
                    FullAddress(
                        address = it.destinationAddress,
                        location = LatLng(
                            it.destinationLatitude,
                            it.destinationLongitude
                        )
                    )
                } else {
                    null
                },
                price = it.price,
                useSuggestedPrice = it.useSuggestedPrice,
                suggestedPrice = it.suggestedPrice,
                comment = it.comment
            )
        }
    }

    override fun save(rideIntent: RideIntent) {
        db.rideIntentQueries.save(
            id = rideIntent.id,
            originAddress = rideIntent.origin?.address,
            originLatitude = rideIntent.origin?.location?.latitude,
            originLongitude = rideIntent.origin?.location?.longitude,
            destinationAddress = rideIntent.destination?.address,
            destinationLatitude = rideIntent.destination?.location?.latitude,
            destinationLongitude = rideIntent.destination?.location?.longitude,
            price = rideIntent.price,
            useSuggestedPrice = rideIntent.useSuggestedPrice,
            suggestedPrice = rideIntent.suggestedPrice,
            comment = rideIntent.comment
        )
    }
}