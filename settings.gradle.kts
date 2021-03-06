rootProject.name = "template"

pluginManagement {
  repositories {
    maven {
      name = "Fabric"
      url = java.net.URI("https://maven.fabricmc.net/")
    }
    maven {
      name = "Cotton"
      url = java.net.URI("https://server.bbkr.space/artifactory/libs-release")
    }
    gradlePluginPortal()
  }
  plugins {
    id("fabric-loom") version System.getProperty("loom_version")!!
    id("com.diffplug.spotless") version System.getProperty("spotless_version")!!
    id("com.modrinth.minotaur") version System.getProperty("minotaur_version")!!
    id("io.github.juuxel.loom-quiltflower") version System.getProperty("quiltflower_version")!!
  }
}
