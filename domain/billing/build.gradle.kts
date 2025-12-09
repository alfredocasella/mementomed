plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.mementomed.domain.billing"
    compileSdk = 34
    defaultConfig { minSdk = 24 }
    kotlinOptions { jvmTarget = "17" }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("com.android.billingclient:billing:6.0.1")
    implementation(project(":core:util"))
}
