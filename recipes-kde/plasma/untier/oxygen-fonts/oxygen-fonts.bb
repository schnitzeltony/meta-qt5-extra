SUMMARY = "OXYGEN"
LICENSE = "GPLv3 & OFL-1.1"
LIC_FILES_CHKSUM = " \
    file://COPYING-GPL+FE.txt;md5=b10e10d276dbedbf992190166973213d \
    file://COPYING-OFL;md5=beca0db6d9408f45563228cba576a6fc \
    file://GPL.txt;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += "fontforge-native"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "7ef184bdfadad09b81bf69006391c37a"
SRC_URI[sha256sum] = "fbde57bfed59e9f5b6b4589f127e56ce1432e6985ad36d410b7977a0090be87e"

EXTRA_OECMAKE += "-DOXYGEN_FONT_INSTALL_DIR=${datadir}/fonts/truetype/oxygen"

FILES_${PN} += " \
    ${datadir}/fonts \
"

FILES_${PN}-dbg += " \
"
