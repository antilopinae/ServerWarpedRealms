val ktxVersion: String by project
val kotlinxCoroutinesVersion: String by project
val gdxVersion: String by project
val kotlinVersion: String by project
val gdxControllersVersion: String by project

plugins {
    id("com.google.devtools.ksp").version("1.9.22-1.0.16")
}

dependencies {
    implementation(project(":adapters:grpc"))
    implementation(project(":adapters"))

    implementation(project(":annotation"))
    implementation(project(":processor"))

    ksp(project(":processor"))
    kspTest(project(":processor"))

    implementation("com.badlogicgames.gdx-controllers:gdx-controllers-desktop:$gdxControllersVersion")
    implementation("com.badlogicgames.gdx:gdx-backend-lwjgl3:$gdxVersion")
    implementation("com.badlogicgames.gdx:gdx-box2d-platform:$gdxVersion:natives-desktop")
    implementation("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-desktop")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutinesVersion")

    //bad logic
    implementation("com.badlogicgames.gdx:gdx:$gdxVersion")
    implementation("com.badlogicgames.gdx:gdx-backend-headless:$gdxVersion")
    implementation("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-desktop")

    //ktx
    implementation("io.github.libktx:ktx-actors:$ktxVersion")
    implementation("io.github.libktx:ktx-ai:$ktxVersion")
    implementation("io.github.libktx:ktx-app:$ktxVersion")
    implementation("io.github.libktx:ktx-ashley:$ktxVersion")
    implementation("io.github.libktx:ktx-assets:$ktxVersion")
    implementation("io.github.libktx:ktx-collections:$ktxVersion")
    implementation("io.github.libktx:ktx-json:$ktxVersion")
    implementation("io.github.libktx:ktx-log:$ktxVersion")
    implementation("io.github.libktx:ktx-math:$ktxVersion")
    implementation("io.github.libktx:ktx-scene2d:$ktxVersion")
    implementation("io.github.libktx:ktx-tiled:$ktxVersion")
    implementation("io.github.libktx:ktx-box2d:$ktxVersion")
}
