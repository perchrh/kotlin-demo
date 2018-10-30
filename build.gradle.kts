repositories {
    mavenCentral()
}

plugins {
    base
    kotlin("jvm") version "1.3.0"
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile(kotlin("reflect"))

    testCompile(kotlin("test"))
    testCompile(kotlin("test-junit"))
}
