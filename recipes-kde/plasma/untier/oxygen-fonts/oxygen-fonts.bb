SUMMARY = "oxygen fonts"
LICENSE = "GPLv3 & OFL-1.1"
LIC_FILES_CHKSUM = " \
    file://COPYING-GPL+FE.txt;md5=b10e10d276dbedbf992190166973213d \
    file://COPYING-OFL;md5=beca0db6d9408f45563228cba576a6fc \
    file://GPL.txt;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma fontcache

DEPENDS += "fontforge-native"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "25bc526b21e9a0472e94a73b5f2d7d83"
SRC_URI[sha256sum] = "74ce20431b825c7903a4a11825432c88a1a2537456314c260fca75fbf5a37db7"

EXTRA_OECMAKE += "-DOXYGEN_FONT_INSTALL_DIR=${datadir}/fonts/truetype/oxygen"

FILES_${PN} += " \
    ${datadir}/fonts \
"

FILES_${PN}-dbg += " \
"
