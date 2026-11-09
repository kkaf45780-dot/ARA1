pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ARA"

include(
    ":app",
    ":core:model",
    ":core:common",
    ":core:data",
    ":core:designsystem",
    ":screen-capture",
    ":ocr-engine",
    ":translation-engine",
    ":ai-engine",
    ":floating-assistant",
)
