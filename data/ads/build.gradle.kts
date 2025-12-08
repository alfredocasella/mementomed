plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.mementomed.data.ads"
    compileSdk = 34
    defaultConfig { minSdk = 24 }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation(libs.findLibrary("androidx-core-ktx").get())
    // Add Ad SDK dependency placeholder (e.g., Google Mobile Ads) when integrating
}

