plugins {
    alias(libs.plugins.runapp.android.library)
}

android {
    namespace = "com.jmdev.core.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}