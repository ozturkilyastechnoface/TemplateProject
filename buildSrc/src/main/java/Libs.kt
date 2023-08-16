object Libs {

    object AndroidX {
        val appCompact = buildString {
            append("androidx.appcompat:appcompat:")
            append(Versions.AndroidX.appCompact)
        }
        val constraint = buildString {
            append("androidx.constraintlayout:constraintlayout:")
            append(Versions.AndroidX.appCompact)
        }

        val composeMateriel = buildString {
            append("androidx.compose.material:material:")
            append(Versions.AndroidX.composeMateriel)
        }
        val composeLifecycle = buildString {
            append("androidx.lifecycle:lifecycle-runtime-compose:")
            append(Versions.AndroidX.appCompact)
        }
        val lifecycle = buildString {
            append("androidx.lifecycle:lifecycle-runtime-ktx:")
            append(Versions.AndroidX.lifecycle)
        }
        val core = buildString {
            append("androidx.core:core-ktx:")
            append(Versions.AndroidX.core)
        }
        val material = buildString {
            append("com.google.android.material:material:")
            append(Versions.AndroidX.material)
        }
        val splashScreen = buildString {
            append("androidx.core:core-splashscreen:")
            append(Versions.AndroidX.splashScreen)
        }
        val pagination = buildString {
            append("androidx.paging:paging-runtime:")
            append(Versions.AndroidX.pagination)
        }
        val datastore = buildString {
            append("androidx.datastore:datastore-preferences:")
            append(Versions.AndroidX.datastore)
        }
        val workManager = buildString {
            append("androidx.work:work-runtime-ktx:")
            append(Versions.AndroidX.workManager)
        }
        val workManagerHilt = buildString {
            append("androidx.hilt:hilt-work:")
            append(Versions.AndroidX.workManagerHilt)
        }
    }


    object Hilt {
        val hilt = buildString {
            append("com.google.dagger:hilt-android:")
            append(Versions.hilt)
        }
        val hiltKapt = buildString {
            append("com.google.dagger:hilt-android-compiler:")
            append(Versions.hilt)
        }
    }

    object Room {
        val room = buildString {
            append("androidx.room:room-runtime:")
            append(Versions.room)
        }
        val roomKtx = buildString {
            append("androidx.room:room-ktx:")
            append(Versions.room)
        }
        val roomCompiler = buildString {
            append("androidx.room:room-compiler:")
            append(Versions.room)
        }
    }

    object Network {
        val retrofit = buildString {
            append("com.squareup.retrofit2:retrofit:")
            append(Versions.Network.retrofit)
        }
        val okhttp = buildString {
            append("com.squareup.okhttp3:okhttp:")
            append(Versions.Network.okhttp3)
        }
        val gsonConverter = buildString {
            append("com.squareup.retrofit2:converter-gson:")
            append(Versions.Network.gsonConverter)
        }
        val loggingInterceptor = buildString {
            append("com.squareup.okhttp3:logging-interceptor:")
            append(Versions.Network.okhttp3)
        }
        val gson = buildString {
            append("com.google.code.gson:gson:")
            append(Versions.Network.gson)
        }

    }

    object Glide {
        val glideLandscapist = buildString {
            append("com.github.skydoves:landscapist-glide:")
            append(Versions.Glide.glideLandscapist)
        }
    }

    object Chucker {
        val chucker = buildString {
            append("com.github.chuckerteam.chucker:library:")
            append(Versions.chucker)
        }
        val chuckerNoOp = buildString {
            append("com.github.chuckerteam.chucker:library-no-op:")
            append(Versions.chucker)
        }
    }

    object Others {
        val inject = buildString {
            append("javax.inject:javax.inject:")
            append(Versions.Others.inject)
        }
    }

    object Test {
        val mockK = buildString {
            append("junit:junit:")
            append(Versions.Test.JUnit)
        }
        val JUnit = buildString {
            append("io.mockk:mockk:")
            append(Versions.Test.mockK)
        }
        val mockitoKotlin = buildString {
            append("org.mockito.kotlin:mockito-kotlin:")
            append(Versions.Test.mockitoKotlin)
        }
        val mockitoCore = buildString {
            append("org.mockito:mockito-core:")
            append(Versions.Test.mockitoCore)
        }
        val mockitoInline = buildString {
            append("org.mockito:mockito-inline:")
            append(Versions.Test.mockitoInline)
        }

        val coroutine = buildString {
            append("org.jetbrains.kotlinx:kotlinx-coroutines-test:")
            append(Versions.Test.coroutine)
        }

    }
}