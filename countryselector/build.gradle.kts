import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.publishing)
    alias(libs.plugins.dokka)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

group = "com.wannaverse"
version = "1.0.2"

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_11
        }
        publishLibraryVariants("release")
        publishLibraryVariantsGroupedByFlavor = true
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()
    jvm()

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(libs.androidx.lifecycle.viewmodel)
        }
    }
}

android {
    namespace = "com.wannaverse.countryselector"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

compose.desktop {
    application {
        nativeDistributions {
            packageName = "com.wannaverse.countryselector"
            packageVersion = version.toString()
        }
    }
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    signAllPublications()

    coordinates(group.toString(), "countryselector", version.toString())

    pom {
        name = "Country Selector"
        description = "A country selector library"
        inceptionYear = "2025"
        url = "https://github.com/WannaverseOfficial/kmp-country-selector"
        licenses {
            license {
                name = "MIT License"
                url = "https://opensource.org/licenses/MIT"
                distribution = "https://opensource.org/licenses/MIT"
            }
        }
        developers {
            developer {
                id = "Wannaverse"
                name = "wannaverse"
                url = "https://github.com/WannaverseOfficial"
            }
        }
        scm {
            url = "https://github.com/WannaverseOfficial/kmp-country-selector"
            connection = "scm:git:git://github.com/WannaverseOfficial/kmp-country-selector.git"
            developerConnection = "scm:git:ssh://git@github.com/WannaverseOfficial/kmp-country-selector.git"
        }
    }
}

tasks.dokkaHtml {
   outputDirectory.set(file("${rootDir}/docs"))
}