require ${BPN}.inc

DEPENDS += "qttools"

SRC_URI += " \
    file://0001-make-build-of-hunspell-optional.patch \
"

FILES:${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/sonnet \
"

EXTRA_OECMAKE += "-DKF5_HOST_TOOLING=${STAGING_DIR_NATIVE}"

CMAKE_ALIGN_SYSROOT[1] = "KF5Sonnet, -s${_IMPORT_PREFIX}/bin, -s${KDE_PATH_EXTERNAL_HOST_BINS}"

PACKAGECONFIG ??= "hunspell"
PACKAGECONFIG[hunspell] = "-DBUILD_HUNSPELL=ON,-DBUILD_HUNSPELL=OFF, hunspell"

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
