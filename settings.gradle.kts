pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("gradle/versions.toml"))
        }
    }
}

rootProject.name = "MementoMed"

include(
    ":app",
    ":core:util",
    ":core:ui",
    ":data:db",
    ":data:ads",
    ":data:workers",
    ":domain:billing",
    ":features:plan",
    ":features:gate"
)

