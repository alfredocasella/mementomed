plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.mementomed.domain.billing"
    compileSdk = 34
    defaultConfig { minSdk = 24 }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation(libs.findLibrary("play-billing").get())
}

