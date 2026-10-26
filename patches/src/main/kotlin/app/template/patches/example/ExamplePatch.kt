package app.template.patches.example

import app.morphe.patcher.patch.bytecodePatch
import app.template.patches.shared.Constants.COMPATIBILITY_LEVI_LAUNCHER

@Suppress("unused")
val leviLauncherPatch = bytecodePatch(
    name = "LeviLauncher Patch",
    description = "Patches for LeviLauncher.",
    default = false
) {
    compatibleWith(COMPATIBILITY_LEVI_LAUNCHER)
}
