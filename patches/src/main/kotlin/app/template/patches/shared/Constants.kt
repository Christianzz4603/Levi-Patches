package app.template.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.SupportedAbi

object Constants {

    val COMPATIBILITY_EXAMPLE = Compatibility(
        name = "LeviLauncher",
        packageName = "org.levimc.launcher",
        apkFileType = ApkFileType.APK,
        appIconColor = 0x6750A4,
        targets = listOf(
            AppTarget(
                version = null,
                isExperimental = true
            )
        )
    )

    val COMPATIBILITY_EXAMPLE_2 = Compatibility(
        name = "LeviLauncher",
        packageName = "org.levimc.launcher",
        apkFileType = ApkFileType.APK,
        appIconColor = 0x6750A4,
        targets = listOf(
            AppTarget(
                version = null,
                isExperimental = true
            )
        )
    )

    val COMPATIBILITY_EXAMPLE_3 = Compatibility(
        name = "LeviLauncher",
        packageName = "org.levimc.launcher",
        apkFileType = ApkFileType.APK,
        appIconColor = 0x6750A4,
        targets = listOf(
            AppTarget(
                version = null,
                isExperimental = true
            )
        )
    )
}
