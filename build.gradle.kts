
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
        maven("https://jitpack.io")
    }
    dependencies {
        classpath(GradleClassPath.GRADLE_BUILD)
        classpath(kotlin("gradle-plugin", Versions.kotlin))
        classpath(GradleClassPath.HILT_GRADLE_PLUGIN)
        classpath(GradleClassPath.SAFE_ARGS)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts.kts files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven("https://jitpack.io")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}