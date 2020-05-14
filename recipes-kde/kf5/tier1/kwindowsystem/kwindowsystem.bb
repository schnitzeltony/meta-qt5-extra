SUMMARY = "Access to the windowing system"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras libxrender libxfixes libxfixes-native", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "afe3c023d1ebd1f2cd1b48ad1bb77046"
SRC_URI[sha256sum] = "9003fded6cb8338521024bdcfccc4d36336f3f9cc9a4e6ba4eaa50bd8064c828"

do_configure_append() {
    # remove absolute paths from exported cmake files
    for f in `find ${B} -name '*Targets*.cmake'`; do
        sed -i 's:${RECIPE_SYSROOT}${prefix}:${_IMPORT_PREFIX}:g' $f
    done
}

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}"
