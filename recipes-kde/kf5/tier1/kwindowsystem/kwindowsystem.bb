SUMMARY = "Access to the windowing system"
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras libxrender libxfixes libxfixes-native", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "ef6b9e733e320be63a4557da0453b1a8ea81519e01c1737eff69b66401302eb8"

do_configure:append() {
    # remove absolute paths from exported cmake files
    for f in `find ${B} -name '*Targets*.cmake'`; do
        sed -i 's:${RECIPE_SYSROOT}${prefix}:${_IMPORT_PREFIX}:g' $f
    done
}

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}"
