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
import org.veronica.taxi_app_shared.data.repos.SqlRideIntentsRepo
import org.veronica.taxi_app_shared.domain.repos.MapsRepo
import org.veronica.taxi_app_shared.domain.repos.RideIntentsRepo
import org.veronica.taxi_app_shared.domain.usecases.GetPriceSuggestionUseCase
import org.veronica.taxi_app_shared.domain.usecases.GetUserLocationUseCase
import org.veronica.taxi_app_shared.domain.usecases.GetUserRideIntentUseCase
import org.veronica.taxi_app_shared.domain.usecases.RequestARideUseCase
import org.veronica.taxi_app_shared.domain.usecases.ReverseGeocodeLocationUseCase
import org.veronica.taxi_app_shared.domain.usecases.SaveUserRideIntentUseCase
import org.veronica.taxi_app_shared.domain.usecases.UpdateRideIntentDestinationUseCase
import org.veronica.taxi_app_shared.domain.usecases.UpdateRideIntentOriginUseCase
import org.veronica.taxi_app_shared.platform.db.createDatabase
import org.veronica.taxi_app_shared.platform.di.platformModule
import org.veronica.taxi_app_shared.presentation.passenger.viewmodels.DestinationPickerViewModel
import org.veronica.taxi_app_shared.presentation.passenger.viewmodels.OriginPickerViewModel
import org.veronica.taxi_app_shared.presentation.passenger.viewmodels.RequestARideViewModel
import org.veronica.taxi_app_shared.presentation.shared.viewmodels.LocationPickerViewModel

import org.veronica.taxiapp.db.AppDatabase
import org.veronica.taxi_app_shared.presentation.splash.SplashScreenContent
import dev.icerock.moko.mvvm.viewmodel.ViewModel

val appModule = module {
    single { initHttpClient() }
    single<AppDatabase> { createDatabase(get()) }

    // Repositories
    single<MapsRepo> {
        GoogleMapsRepo(
            httpClient = get()
        )
    }
    single<RideIntentsRepo> {
        SqlRideIntentsRepo(
            db = get()
        )
    }


    // UseCases
    single { GetPriceSuggestionUseCase() }
    single { ReverseGeocodeLocationUseCase(get()) }
    single { RequestARideUseCase() }
    single { GetUserRideIntentUseCase(get()) }
    single { SaveUserRideIntentUseCase(get()) }
    single { UpdateRideIntentOriginUseCase(get(), get()) }
    single { UpdateRideIntentDestinationUseCase(get(), get()) }
    single { GetUserLocationUseCase(get()) }


    // ViewModel factories
    single(named("RequestARideViewModelFactory")) {
        viewModelFactory { RequestARideViewModel(get(), get(), get()) }
    }
    single(named("LocationPickerViewModelFactory")) {
        viewModelFactory { LocationPickerViewModel(get()) }
    }
    single(named("OriginPickerViewModelFactory")) {
        viewModelFactory { OriginPickerViewModel(get()) }
    }
    single(named("DestinationPickerViewModelFactory")) {
        viewModelFactory { DestinationPickerViewModel(get()) }
    }
    single(named("SplashViewModelFactory")) {
        viewModelFactory { SplashViewModel(get()) }
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

    @Composable
    fun originPickerViewModel(key: Any): OriginPickerViewModel {
        return getViewModel(
            key = key,
            factory = get(named("OriginPickerViewModelFactory"))
        )
    }

    @Composable
    fun destinationPickerViewModel(key: Any): DestinationPickerViewModel {
        return getViewModel(
            key = key,
            factory = get(named("DestinationPickerViewModelFactory"))
        )
    }

    @Composable
    fun splashViewModel(key: Any): SplashViewModel {
        return getViewModel(
            key = key,
            factory = get(named("SplashViewModelFactory")), get()
        )
    }
}


fun initKoin(appDeclaration: KoinAppDeclaration = {}) {
    startKoin {
        appDeclaration()
        modules(platformModule, appModule)
    }
}

fun initKoin() = initKoin {}

