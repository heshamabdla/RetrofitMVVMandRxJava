plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.retrofitmvvmandrxjava"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.retrofitmvvmandrxjava"
        minSdk = 27
        targetSdk = 33
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
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")



//retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")

    //cardview
    implementation ("androidx.cardview:cardview:1.0.0")

    //recyclerview
    implementation ("androidx.recyclerview:recyclerview-selection:1.1.0")

    implementation ("androidx.recyclerview:recyclerview:1.3.1")

        implementation ("io.reactivex.rxjava3:rxandroid:3.0.2")
        implementation ("io.reactivex.rxjava3:rxjava:3.1.8")

        implementation ("com.github.akarnokd:rxjava3-retrofit-adapter:3.0.0")

}