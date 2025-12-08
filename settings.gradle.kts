pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("gradle/libs.versions.toml"))
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
    ":domain:billing",
    ":features:plan",
    ":features:gate"
)

