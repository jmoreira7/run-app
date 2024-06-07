plugins {
    `kotlin-dsl`
}

group = "com.jmdev.runapp.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "runapp.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
    }
}