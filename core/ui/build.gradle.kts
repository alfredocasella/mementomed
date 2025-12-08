plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.mementomed.core.ui"
    compileSdk = 34
    defaultConfig { minSdk = 24 }
    buildFeatures { compose = true }
    composeOptions { kotlinCompilerExtensionVersion = "1.5.4" }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation(platform(libs.findLibrary("compose-bom").get()))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation(libs.findLibrary("accompanist-insets").get())
}

