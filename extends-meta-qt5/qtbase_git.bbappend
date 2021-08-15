FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

PACKAGECONFIG_FONTS = "fontconfig"

# Full (desktop) GL is default in meta-qt5 and qtbase. Some of our recipes
# (AFAICR krita/mixxx) will fail with qt build for GLES.
# Will never understand why a BSP layer changes defaults to make people happy
# not using defaults. Yes it looks like an error but that should have been
# fixed at meta-qt5.
# see https://github.com/Freescale/meta-freescale/pull/379
PACKAGECONFIG_GL_use-mainline-bsp = "${QT5_EXTRA_QTBASE_IMX_MAINLINE_GL} gbm kms"

# If one does not need failing recipes mentioned above and wants gles:
# override QT5_EXTRA_QTBASE_IMX_MAINLINE_GL with 'gles2'
QT5_EXTRA_QTBASE_IMX_MAINLINE_GL ??= ""

PACKAGECONFIG_DISTRO:append = " \
    sm \
    accessibility \
    sql-sqlite \
    cups \
    libinput \
"
