group = "org.levimc.launcher.patches"

patches {
    about {
        name = "LeviLaunchroid Patches"
        description = "Performance optimizations and quality-of-life improvements for LeviLaunchroid."
        source = "https://github.com/Christianzz4603/Levi-Patches"
        author = "Christianzz4603"
        contact = "https://github.com/Christianzz4603"
        website = "https://github.com/Christianzz4603/Levi-Patches"
        license = "GPLv3"
    }
}

// Keep Gson available for generating the patch list,
// without bundling it into the patch bundle.
val patchListGeneratorClasspath =
    configurations.create("patchListGeneratorClasspath")

dependencies {
    compileOnly(libs.gson)
    patchListGeneratorClasspath(libs.gson)
}

tasks {
    register<JavaExec>("generatePatchesList") {
        description = "Build patch with patch list"
        dependsOn(build)

        classpath =
            sourceSets["main"].runtimeClasspath +
                patchListGeneratorClasspath

        mainClass.set("util.PatchListGeneratorKt")
    }

    // Used by the semantic-release plugin.
    publish {
        dependsOn("generatePatchesList")
    }
}
