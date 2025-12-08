plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = "com.mementomed.data.db"
    compileSdk = 34
    defaultConfig { minSdk = 24 }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation(libs.findLibrary("room-runtime").get())
    implementation(libs.findLibrary("room-ktx").get())
    kapt(libs.findLibrary("room-compiler").get())
    implementation(libs.findLibrary("kotlinx-coroutines-core").get())
}

