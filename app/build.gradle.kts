plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "cool.cmg.sbattery"
    compileSdk = 34

    defaultConfig {
        applicationId = "cool.cmg.sbattery"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
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
    compileOnly(libs.api)
}