package org.veronica.taxi_app_shared.domain.models

data class PriceSuggestionRequest(
    private val origin: FullAddress,
    private val destination: FullAddress,
)