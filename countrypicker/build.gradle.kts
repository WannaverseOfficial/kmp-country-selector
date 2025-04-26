import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.publishing)
}

group = "com.wannacall"
version = "0.0.0"

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
    namespace = "com.wannacall.countrypicker"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
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
            packageName = "com.wannacall.countrypicker"
            packageVersion = version.toString()
        }
    }
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    signAllPublications()

    coordinates(group.toString(), "countrypicker", version.toString())

    pom {
        name = "Country Picker"
        description = "A country picker library"
        inceptionYear = "2025"
        url = "https://github.com/WannaCall/wc-country-picker"
        licenses {
            license {
                name = "GNU General Public License"
                url = "https://www.gnu.org/licenses/gpl-3.0.txt"
                distribution = "https://www.gnu.org/licenses/gpl-3.0.txt"
            }
        }
        developers {
            developer {
                id = "wannacall"
                name = "WannaCall"
                url = "https://github.com/WannaCall"
            }
        }
        scm {
            url = "https://github.com/WannaCall/wc-country-picker"
            connection = "scm:git:git://github.com/WannaCall/wc-country-picker.git"
            developerConnection = "scm:git:ssh://git@github.com/WannaCall/wc-country-picker.git"
        }
    }
}