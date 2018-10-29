repositories {
    maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    jcenter()
}

plugins {
    base
    kotlin("jvm") version "1.3.0-rc-190"
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
}
