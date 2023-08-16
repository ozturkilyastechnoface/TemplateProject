// Top-level build file where you can add configuration options common to all sub-projects/modules.
import com.android.build.gradle.AppExtension
import com.android.build.gradle.AppPlugin
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.LibraryPlugin
import io.gitlab.arturbosch.detekt.Detekt


buildscript {
    val agp_version by extra("8.1.0")
    dependencies {
        classpath("com.android.tools.build:gradle:$agp_version")
    }
}
plugins {
    id(Plugins.application) version Versions.Plugin.application apply false
    id(Plugins.library) version Versions.Plugin.application apply false
    id(Plugins.kotlin) version Versions.Plugin.kotlin apply false
    id(Plugins.hiltClasspath) version Versions.hilt apply false
    id(Plugins.ksp) version Versions.Plugin.ksp apply false
    id("io.gitlab.arturbosch.detekt") version ("1.23.0")
}

allprojects {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
    tasks.withType<Detekt>().configureEach {
        reports {
            xml.required.set(true)
            html.required.set(true)
            txt.required.set(true)
            sarif.required.set(true)
            md.required.set(true)
        }
    }
}

subprojects {
    project.plugins.applyBaseConfig(project)
}

fun BaseExtension.baseConfig() {
    setCompileSdkVersion(Config.compileSdkVersion)

    defaultConfig.apply {
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
    }
}

fun PluginContainer.applyBaseConfig(project: Project) {
    whenPluginAdded {
        when (this) {
            is AppPlugin -> {
                project.extensions
                    .getByType<AppExtension>()
                    .apply {
                        baseConfig()
                    }
            }

            is LibraryPlugin -> {
                project.extensions
                    .getByType<LibraryExtension>()
                    .apply {
                        baseConfig()
                    }
            }
        }
    }
}
