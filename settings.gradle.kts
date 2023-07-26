pluginManagement {
    repositories {
        google()
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

rootProject.name = "TemplateProject"
include(":app")
include(":data")
include(":core")
include(":domain")
include(":local")
include(":network")
include(":ui")
include(":utils")
