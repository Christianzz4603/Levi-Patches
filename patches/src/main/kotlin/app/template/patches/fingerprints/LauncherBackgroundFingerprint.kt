package app.template.patches.fingerprints

import app.morphe.patcher.Fingerprint

/**
 * Fingerprints for the official LeviLauncher background controller.
 *
 * Target package: org.levimc.launcher
 * Target version: 1.5.27
 *
 * These fingerprints identify existing methods.
 * They do not modify the methods yet.
 */

internal object LauncherBackgroundApplyEffectsFingerprint : Fingerprint(
    definingClass = "Lorg/levimc/launcher/util/LauncherBackgroundController;",
    name = "applyEffects",
    returnType = "V"
)

internal object LauncherBackgroundCreateAnimatedViewFingerprint : Fingerprint(
    definingClass = "Lorg/levimc/launcher/util/LauncherBackgroundController;",
    name = "createAnimatedView",
    returnType = "V"
)

internal object LauncherBackgroundStartPlaybackFingerprint : Fingerprint(
    definingClass = "Lorg/levimc/launcher/util/LauncherBackgroundController;",
    name = "startPlayback",
    returnType = "V"
)
