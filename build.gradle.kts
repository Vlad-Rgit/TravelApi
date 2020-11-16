import org.jetbrains.kotlin.gradle.dsl.Coroutines
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    application
    id("com.github.johnrengelman.shadow") version "6.1.0"
    kotlin("jvm") version "1.4.10"
}


group = "com.travel"
version = "0.0.1"

application {
    mainClassName = "com.travel.ApplicationKt"
}

repositories {
    mavenLocal()
    jcenter()
    maven { url = uri("https://jitpack.io") }
    maven { url = uri("https://kotlin.bintray.com/ktor")  }
}


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version")
    implementation("io.ktor:ktor-server-cio:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-auth:$ktor_version")
    implementation("io.ktor:ktor-auth-jwt:$ktor_version")
    implementation("io.ktor:ktor-jackson:$ktor_version")

    //Kotlin Exposed
    implementation("org.jetbrains.exposed", "exposed-core", "0.24.1")
    implementation("org.jetbrains.exposed", "exposed-dao", "0.24.1")
    implementation("org.jetbrains.exposed", "exposed-jdbc", "0.24.1")

    //PostgreSQL
    implementation("org.postgresql:postgresql:42.2.2")

    //ModelMapper
    implementation("org.modelmapper:modelmapper:2.3.0")


    implementation("com.apurebase:kgraphql:0.16.0")      // <-- Add these two lines
    implementation("com.apurebase:kgraphql-ktor:0.16.0")

    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
}

kotlin.sourceSets["main"].kotlin.srcDirs("src")


sourceSets["main"].resources.srcDirs("resources")


tasks {
    named<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
        archiveBaseName.set("travel")
        archiveClassifier.set("")
        archiveVersion.set("")
    }
}

tasks {
    build {
        dependsOn(shadowJar)
    }
}