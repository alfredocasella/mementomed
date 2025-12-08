plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.kotlin.plugin.serialization")
}

android {
    namespace = "com.mementomed.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mementomed.app"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "0.1.0"
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.4"
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    packagingOptions {
        resources.excludes += listOf("META-INF/AL2.0", "META-INF/LGPL2.1")
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(platform(libs.findLibrary("compose-bom").get()))
    implementation(libs.findLibrary("androidx-core-ktx").get())
    implementation(libs.findLibrary("material").get())
    implementation(libs.findLibrary("lifecycle-runtime").get())
    implementation(libs.findLibrary("kotlinx-serialization-json").get())

    // Compose UI
    implementation("androidx.activity:activity-compose:1.8.0")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui-tooling-preview")

    // Module dependencies
    implementation(project(":core:ui"))
    implementation(project(":core:util"))
    implementation(project(":domain:billing"))
    implementation(project(":data:db"))
    implementation(project(":data:ads"))
    implementation(project(":features:plan"))
    implementation(project(":features:gate"))
}

