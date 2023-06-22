plugins {
    id("java")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "com.tomgregory.GradleTutorial"
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(group = "junit", name = "junit", version = "4.13.2")
}
