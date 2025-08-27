androidApplication {
    namespace = "org.example.app"

    // Ensure JUnit 4 is available for test discovery
    testing {
        dependencies {
            implementation("junit:junit:4.13.2")
            // keep JUnit 5 setup as well if needed by other modules
            implementation("org.junit.jupiter:junit-jupiter:5.10.2")
            runtimeOnly("org.junit.platform:junit-platform-launcher")
        }
    }

    dependencies {
        implementation("org.apache.commons:commons-text:1.11.0")
        implementation(project(":utilities"))
    }
}
