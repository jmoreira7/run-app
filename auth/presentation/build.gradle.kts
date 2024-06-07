plugins {
    alias(libs.plugins.runapp.android.feature.ui)
}

android {
    namespace = "com.jmdev.auth.presentation"
}

dependencies {
    implementation(projects.auth.domain)
    implementation(projects.core.domain)
}