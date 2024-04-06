val ktorVersion: String by project
val kotlinxCoroutinesVersion: String by project
val kotlinVersion: String by project
val slf4j_version: String by project

//plugins{
//    id("io.ktor.plugin") version "2.3.8"
//}

group = "server_builder"
version = "0.0.1"

application {
    //development mode
    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

dependencies {
    implementation(project(":adapters"))
    implementation(project(":game_logic"))

    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:${kotlinxCoroutinesVersion}")

    //core
    implementation("io.ktor:ktor-server-core-jvm:$ktorVersion")
    implementation("io.ktor:ktor-server-netty-jvm:$ktorVersion")

    //logger dependency
    implementation("org.slf4j:slf4j-api:${slf4j_version}")
    implementation("org.slf4j:slf4j-simple:${slf4j_version}")

    //config
    implementation("io.ktor:ktor-server-config-yaml:$ktorVersion")

    //test
    testImplementation("io.ktor:ktor-server-tests-jvm:$ktorVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")
}
