plugins {
    alias(libs.plugins.kotlin.jvm)
    application
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(project(":shared"))
    implementation(libs.clikt)
}

application {
    mainClass.set("dev.dorascanner.cli.MainKt")
    applicationName = "dorascan"
}
