plugins {
    alias(libs.plugins.runningTrackerApp.jvm.library)
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
}