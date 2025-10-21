// File: `new_example/android/app/build.gradle.kts`
plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.new_example"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.new_example"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        // Updated to a more standard Java 8 for wider compatibility
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    // Add this block if it's missing, it's often needed for Kotlin
    kotlinOptions {
        jvmTarget = "1.8"
    }
    sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin")
        getByName("main").aidl.srcDirs("src/main/aidl")
        getByName("release").aidl.srcDirs("src/main/aidl")
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
        }
    }

}

// Ensure all Kotlin compile tasks use the same jvmTarget
tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class.java).configureEach {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

flutter {
    source = "../../"
}
