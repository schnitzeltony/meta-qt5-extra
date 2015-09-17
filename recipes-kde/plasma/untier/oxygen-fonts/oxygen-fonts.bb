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
SRC_URI[md5sum] = "88522f2478fdff511e02102861dab620"
SRC_URI[sha256sum] = "db6ccaa7ceaf7e93fe24986d3794a74dccf255aff93ea131ad67ecf3317fcb63"

EXTRA_OECMAKE += "-DOXYGEN_FONT_INSTALL_DIR=${datadir}/fonts/truetype/oxygen"

FILES_${PN} += " \
    ${datadir}/fonts \
"

FILES_${PN}-dbg += " \
"
