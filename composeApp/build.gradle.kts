import com.codingfeline.buildkonfig.compiler.FieldSpec.Type.STRING
import org.jetbrains.compose.internal.utils.getLocalProperty

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsCompose)

    alias(libs.plugins.mokoResources)
    alias(libs.plugins.kotlinxSerialization)
    alias(libs.plugins.sqlDelight)
    alias(libs.plugins.buildKonfig)
}

sqldelight {
    databases {
        create("AppDatabase") {
            packageName.set("org.veronica.taxiapp.db")
        }
    }
}

val mapsApiKey = project.getLocalProperty("MAPS_API_KEY") ?: ""

buildkonfig {
    packageName = "org.veronica.taxiapp.buildconfig"
    objectName = "AppConfig"

    defaultConfigs {


        buildConfigField(
            STRING,
            "MAPS_API_KEY",
            mapsApiKey
        )
    }
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "11"
            }
        }
    }
    /*
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
        }
    }
    */
    sourceSets {
        androidMain.get().dependsOn(commonMain.get())

        androidMain.dependencies {
            implementation(libs.compose.ui.tooling.preview)
            implementation(libs.androidx.activity.compose)

            implementation(libs.google.maps.compose)

            implementation(libs.ktor.client.android)

            implementation(libs.koin.android)

            implementation(libs.sqldelight.android.driver)

        }
        commonMain.dependencies {

            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.animation)
            implementation(compose.ui)

            implementation(libs.material3.core)

            api(libs.moko.resources)
            api(libs.moko.resources.compose)

            implementation(libs.moko.mvvm.core)
            implementation(libs.moko.mvvm.compose)

            implementation(libs.coroutines.core)

            implementation(libs.ktor.client.core)
            implementation(libs.ktor.client.content.negotiation)
            implementation(libs.ktor.serialization.kotlinx.json)

            implementation(libs.koin.core)
            implementation(libs.koin.compose)

            implementation(libs.voyager.navigator)
            implementation(libs.voyager.transitions)




            api(libs.moko.permissions.compose)

            api(libs.moko.geo.compose)
        }
    }

    multiplatformResources {
        multiplatformResourcesPackage = "org.veronica.taxi_app.resources"
        multiplatformResourcesClassName = "AppResources"
    }

}

android {
    namespace = "org.veronica.taxi_app"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDirs("src/commonMain/resources")

    defaultConfig {
        applicationId = "org.veronica.taxi_app"
        minSdk = libs.versions.android.minSdk.get().toInt()
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"
        manifestPlaceholders["mapsApiKey"] = mapsApiKey
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    dependencies {
        debugImplementation(libs.compose.ui.tooling)
    }
}