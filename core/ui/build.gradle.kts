plugins {
    id("com.android.library")
    kotlin("android")
    id("app.cash.paparazzi")
}

android {
    namespace = "com.mementomed.core.ui"
    compileSdk = 34
    defaultConfig { minSdk = 24 }
    buildFeatures { compose = true }
    composeOptions { kotlinCompilerExtensionVersion = "1.5.4" }
    kotlinOptions { jvmTarget = "17" }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(platform("androidx.compose:compose-bom:2024.10.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material:material-icons-extended")
    // Accompanist insets removed - use native Compose WindowInsets API instead
    // Example: Modifier.windowInsetsPadding(WindowInsets.safeDrawing)
    
    // Test dependencies
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")
    testImplementation("androidx.compose.ui:ui-test-junit4")
    testImplementation("app.cash.paparazzi:paparazzi:1.3.2")
    testImplementation("androidx.compose.ui:ui-test")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}
