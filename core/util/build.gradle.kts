plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.mementomed.core.util"
    compileSdk = 34
    defaultConfig { minSdk = 24 }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation(libs.findLibrary("kotlinx-coroutines-core").get())
    implementation(libs.findLibrary("kotlinx-serialization-json").get())
}

