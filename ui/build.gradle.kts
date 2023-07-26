plugins {
    id(Plugins.kotlin)
    id(Plugins.library)
    id(Plugins.hilt)
    kotlin(Plugins.kapt)
}

android {
    namespace = "${Config.applicationId}.presentation"
}

dependencies {

    implementation(project(Modules.domain))
    implementation(project(Modules.utils))
    implementation(project(Modules.core))

    //Androidx
    implementation(Libs.AndroidX.activityCompose)
    implementation(Libs.AndroidX.lifecycle)
    implementation(Libs.AndroidX.composeLifecycle)
    implementation(Libs.AndroidX.core)
    implementation(Libs.AndroidX.pagination)
    implementation(Libs.AndroidX.composeMateriel)


    //Test
    testImplementation(Libs.Test.mockK)
    testImplementation(Libs.Test.mockitoKotlin)
    testImplementation(Libs.Test.JUnit)
    testImplementation(Libs.Test.mockitoCore)
    testImplementation(Libs.Test.coroutine)
    testImplementation(Libs.Test.mockitoInline)

    implementation(Libs.AndroidX.datastore)

    //Glide
    implementation(Libs.Glide.glideLandscapist)

    //Dagger
    implementation(Libs.Hilt.hilt)
    kapt(Libs.Hilt.hiltKapt)
}