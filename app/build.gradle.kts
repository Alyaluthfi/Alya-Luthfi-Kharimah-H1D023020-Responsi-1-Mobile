plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.unsoed.responsi1mobileh1d023020"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.unsoed.responsi1mobileh1d023020"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures{
        viewBinding = true
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
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    // Untuk RecyclerView (Daftar Pemain)
    implementation("androidx.recyclerview:recyclerview:1.3.2")

    // Untuk CardView (Tombol Menu & Item Pemain)
    implementation("androidx.cardview:cardview:1.0.0")

    // Untuk Glide (Memuat gambar, sesuai Pertemuan 5) [cite: 218, 220]
    implementation("com.github.bumptech.glide:glide:4.16.0")
}