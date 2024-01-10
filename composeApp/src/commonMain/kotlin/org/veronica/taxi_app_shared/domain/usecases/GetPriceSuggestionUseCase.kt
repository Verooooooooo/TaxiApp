package org.veronica.taxi_app_shared.domain.usecases

import org.veronica.taxi_app_shared.domain.models.PriceSuggestionRequest

class GetPriceSuggestionUseCase {
    suspend operator fun invoke(request: PriceSuggestionRequest): Double {
        println(
            request
        )

        return 17.7
    }
}