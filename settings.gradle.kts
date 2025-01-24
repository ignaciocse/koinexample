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

rootProject.name = "KoinInjectionPilot"
include(":legacy")
include(":features:splash")
include(":features:home")
include(":libraries:designsystem")
include(":libraries:chat")
include(":libraries:common")
include(":app:gms")
include(":app:hms")
include(":data:api")
include(":data:datasource")
include(":data:repository")
include(":libraries:support")
include(":libraries:markets:google")
include(":libraries:markets:huawei")
include(":libraries:markets:marketservices")
