androidApplication {
    namespace = "org.example.app"

    dependencies {
        // UI libraries
        implementation("androidx.appcompat:appcompat:1.7.0")
        implementation("com.google.android.material:material:1.12.0")
        implementation("androidx.fragment:fragment-ktx:1.8.2")
        implementation("androidx.annotation:annotation:1.8.2")

        // Remove sample dependency not used anymore
        // implementation("org.apache.commons:commons-text:1.11.0")
        implementation(project(":utilities"))
    }
}
