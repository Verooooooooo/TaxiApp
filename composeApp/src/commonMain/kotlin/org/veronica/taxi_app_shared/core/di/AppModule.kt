package org.veronica.taxi_app_shared.core.di

import androidx.compose.runtime.Composable
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.context.startKoin
import org.koin.core.qualifier.named
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module
import org.veronica.taxi_app_shared.core.http.initHttpClient
import org.veronica.taxi_app_shared.data.repos.GoogleMapsRepo
import org.veronica.taxi_app_shared.domain.repos.MapsRepo
import org.veronica.taxi_app_shared.domain.usecases.GetPriceSuggestionUseCase
import org.veronica.taxi_app_shared.domain.usecases.RequestARideUseCase
import org.veronica.taxi_app_shared.domain.usecases.ReverseGeocodeLocationUseCase
import org.veronica.taxi_app_shared.presentation.passenger.viewmodels.RequestARideViewModel
import org.veronica.taxi_app_shared.presentation.shared.views.LocationPickerViewModel


val appModule = module {
    single { initHttpClient() }

    // Repositories
    single<MapsRepo> {
        GoogleMapsRepo(
            httpClient = get()
        )
    }

    // UseCases
    single { GetPriceSuggestionUseCase() }
    single { ReverseGeocodeLocationUseCase(get()) }
    single { RequestARideUseCase() }


    // ViewModel factories

    single(named("RequestARideViewModelFactory")) {
        viewModelFactory { RequestARideViewModel(get()) }
    }

    single(named("LocationPickerViewModelFactory")) {
        viewModelFactory { LocationPickerViewModel(get()) }
    }
}

object VMFactories : KoinComponent {
    @Composable
    fun locationPickerViewModel(key: Any): LocationPickerViewModel {
        return getViewModel(key = key, factory = get(named("LocationPickerViewModelFactory")))
    }

    @Composable
    fun requestARideViewModel(key: Any): RequestARideViewModel {
        return getViewModel(
            key = key,
            factory = get(named("RequestARideViewModelFactory"))
        )
    }
}


fun initKoin(appDeclaration: KoinAppDeclaration = {}) {
    startKoin {
        appDeclaration()
        modules(appModule)
    }
}

fun initKoin() = initKoin {}