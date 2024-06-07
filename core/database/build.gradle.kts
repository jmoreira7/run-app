plugins {
    alias(libs.plugins.runapp.android.library)
    alias(libs.plugins.runapp.android.room)
}

android {
    namespace = "com.jmdev.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}