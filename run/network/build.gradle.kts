plugins {
    alias(libs.plugins.runapp.android.library)
    alias(libs.plugins.runapp.jvm.ktor)
}

android {
    namespace = "com.jmdev.run.network"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
}