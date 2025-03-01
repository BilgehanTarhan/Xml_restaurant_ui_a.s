plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.restaurant_xml"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.restaurant_xml"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.constraintlayout)
    implementation(libs.material)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    dependencies {
        // AndroidX Kütüphaneleri
        implementation(libs.appcompat)
        implementation(libs.activity)
        implementation(libs.constraintlayout)

        // Material UI Bileşenleri
        implementation(libs.material)

        // Test Bağımlılıkları
        testImplementation(libs.junit)
        androidTestImplementation(libs.ext.junit)
        androidTestImplementation(libs.espresso.core)

        // Navigation Bileşenleri (Güncel Sürüm)
        val navVersion = "2.8.2"
        implementation("androidx.navigation:navigation-fragment-ktx:$navVersion")
        implementation("androidx.navigation:navigation-ui-ktx:$navVersion")
    }




}