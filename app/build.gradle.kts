plugins {
    id(Plugins.application)
    id(Plugins.kotlin)
    id(Plugins.hilt)
    id(Plugins.parcelize)
    kotlin(Plugins.kapt)
}

android {
    namespace = Config.applicationId
    compileSdk = Config.compileSdkVersion

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        debug {
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            isMinifyEnabled = false
            isDebuggable = true

        }



        release {
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            isMinifyEnabled = Config.minifyEnabledRelease
            isShrinkResources = true
            isDebuggable = false
        }
    }


    packaging {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    //Project
    implementation(project(Modules.data))
    implementation(project(Modules.ui))
    implementation(project(Modules.core))
    implementation(project(Modules.domain))
    implementation(project(Modules.network))
    implementation(project(Modules.local))
    implementation(project(Modules.utils))

    //Androidx
    implementation(Libs.AndroidX.activityCompose)
    implementation(Libs.AndroidX.lifecycle)
    implementation(Libs.AndroidX.core)
    implementation(Libs.AndroidX.splashScreen)

    //Dagger
    implementation(Libs.Hilt.hilt)
    implementation("androidx.appcompat:appcompat:1.6.1")
    kapt(Libs.Hilt.hiltKapt)
}