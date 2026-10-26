package app.template.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object Constants {

    val COMPATIBILITY_LEVI_LAUNCHER = Compatibility(
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
