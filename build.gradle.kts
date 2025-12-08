plugins {
    kotlin("jvm") version libs.versions.kotlin.get() apply false
    id("com.android.application") version "8.1.0" apply false
    id("com.android.library") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version libs.versions.kotlin.get() apply false
    id("org.jetbrains.kotlin.plugin.serialization") version libs.versions.kotlin.get() apply false
}

