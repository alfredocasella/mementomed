plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.mementomed.features.plan"
    compileSdk = 34
    defaultConfig { minSdk = 24 }
    kotlinOptions { jvmTarget = "17" }
    buildFeatures { compose = true }
    composeOptions { kotlinCompilerExtensionVersion = "1.5.4" }
}

dependencies {
    implementation(project(":core:ui"))
}

