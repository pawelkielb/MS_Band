buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("com.android.tools.build:gradle:4.2.2")
    }
}



allprojects {
    group = "pl.gieted.ms_band"
    version = "0.1-SNAPSHOT"
    
    repositories {
        google()
        mavenCentral()
    }
}
