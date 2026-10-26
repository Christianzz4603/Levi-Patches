package app.template.patches.example

import app.morphe.patcher.patch.bytecodePatch
import app.template.patches.shared.Constants.COMPATIBILITY_LEVI_LAUNCHER

@Suppress("unused")
val leviLauncherCompatibilityPatch = bytecodePatch(
    name = "LeviLauncher Compatibility",
    description = "Initial compatibility patch for LeviLauncher.",
    use = false
) {
    compatibleWith(COMPATIBILITY_LEVI_LAUNCHER)
}
