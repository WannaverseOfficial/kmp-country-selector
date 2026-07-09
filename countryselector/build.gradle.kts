import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.multiplatform.library)
    alias(jetbrains.plugins.compose)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.dokka)
    alias(libs.plugins.publishing)
}

group = "com.wannaverse"
version = "1.2.1"

kotlin {

    jvmToolchain(21)
    android {
        namespace = "com.wannaverse.countryselector"
        compileSdk = libs.versions.android.compileSdk.get().toInt()

        compilerOptions {
            jvmTarget = JvmTarget.JVM_11
        }
        withHostTest {
            isIncludeAndroidResources = true
        }
        androidResources {
            enable = true
        }
    }

    iosArm64()
    iosSimulatorArm64()
    jvm()

    sourceSets {
        getByName("androidHostTest") {
            dependencies {
                implementation(libs.androidx.core.ktx)
                implementation(libs.androidx.test.ktx)
                implementation(libs.compose.ui.test.junit4.android)
                implementation(libs.compose.ui.test.manifest)
            }
        }
        commonMain.dependencies {
            implementation(jetbrains.bundles.compose)
            implementation(libs.androidx.lifecycle.viewmodel)
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
            implementation(kotlin("test-annotations-common"))
            implementation(libs.assertk)
            implementation(jetbrains.ui.test)
        }
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

dokka {
    dokkaPublications.html {
        outputDirectory.set(file("${rootDir}/docs"))
    }
}
