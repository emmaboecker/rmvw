plugins {
    java
    id("fabric-loom") version "1.0.11"
}

group = "net.stckoverflw"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    minecraft("com.mojang:minecraft:1.19.2")
    mappings("net.fabricmc:yarn:1.19.3-pre3+build.3")
    modImplementation("net.fabricmc:fabric-loader:0.14.9")
}