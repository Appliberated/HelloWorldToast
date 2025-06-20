plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.thehellomaker.helloworldtoast"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.thehellomaker.helloworldtoast"
        minSdk = 1
        targetSdk = 35
        versionCode = 14
        versionName = "1.4"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
}