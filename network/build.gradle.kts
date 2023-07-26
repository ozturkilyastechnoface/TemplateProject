plugins {
    id(Plugins.library)
    id(Plugins.kotlin)
    kotlin(Plugins.kapt)
}

android {
    namespace = "${Config.applicationId}.network"

    buildFeatures {
        buildConfig = true
    }
}

dependencies {

    //Androidx
    api(Libs.AndroidX.workManager)
    api(Libs.AndroidX.workManagerHilt)

    //Network
    api(Libs.Network.retrofit)
    api(Libs.Network.okhttp)
    api(Libs.Network.gsonConverter)
    api(Libs.Network.loggingInterceptor)
    api(Libs.Network.gson)

    //Hilt
    implementation(Libs.Hilt.hilt)
    kapt(Libs.Hilt.hiltKapt)

    //Chucker
    debugImplementation(Libs.Chucker.chucker)
    releaseImplementation(Libs.Chucker.chuckerNoOp)
}