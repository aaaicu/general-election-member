import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.time.format.*
import java.time.*

plugins {
    val kotlinVersion = "1.7.22"
    id("org.springframework.boot") version "3.0.6"
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.spring") version kotlinVersion
    kotlin("plugin.jpa") version kotlinVersion
    kotlin("plugin.allopen") version kotlinVersion
    kotlin("plugin.noarg") version kotlinVersion
    kotlin("kapt") version kotlinVersion
}

group = "com.parsrich"
version = generateTimestamp()
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation ("org.springframework.boot:spring-boot-starter-cache")
    implementation ("org.springframework.boot:spring-boot-starter-aop")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    runtimeOnly("com.h2database:h2")
    runtimeOnly("org.postgresql:postgresql")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation ("io.github.microutils:kotlin-logging-jvm:3.0.5")
//    testImplementation("org.springframework.security:spring-security-test")

    // querydsl 추가
    kapt("org.springframework.boot:spring-boot-configuration-processor")
    implementation("com.querydsl:querydsl-jpa:5.0.0:jakarta")
    implementation("com.querydsl:querydsl-core:5.0.0")
    kapt("com.querydsl:querydsl-apt:5.0.0:jakarta")
    kapt("com.querydsl:querydsl-kotlin-codegen:5.0.0")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks {
    named<Jar>("jar") {
        enabled = false
    }
}

fun generateTimestamp(): String {
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HHmmss")
    return LocalDateTime.now().format(formatter)
}
