
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.publishing)
    alias(libs.plugins.dokka)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

group = "com.wannaverse"
version = "1.2.1"

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_11
        }
        publishLibraryVariants("release")
        publishLibraryVariantsGroupedByFlavor = true
    }

    iosArm64()
    iosSimulatorArm64()
    jvm()

    sourceSets {
        commonMain.dependencies {
            implementation(jetbrains.bundles.compose)
            implementation(libs.androidx.lifecycle.viewmodel)
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
            implementation(kotlin("test-annotations-common"))
            implementation(libs.assertk)
            implementation(libs.ui.test)
        }
    }
}

android {
    namespace = "com.wannaverse.countryselector"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.test.ktx)
    implementation(libs.compose.ui.test.junit4.android) {
        exclude(group = "androidx.compose.ui", module = "ui-test")
    }
    debugImplementation(libs.compose.ui.test.manifest)
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
    publishToMavenCentral()

    if (!project.hasProperty("skipSigning")) {
        signAllPublications()
    }

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
