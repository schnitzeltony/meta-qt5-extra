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
SRC_URI[md5sum] = "4cb29bfde4cf86946a893c66bb23dd38"
SRC_URI[sha256sum] = "950237428816bb22759699cc1aec7abd39f6f98a75b41a01d915465f4680d076"

EXTRA_OECMAKE += "-DOXYGEN_FONT_INSTALL_DIR=${datadir}/fonts/truetype/oxygen"

FILES_${PN} += " \
    ${datadir}/fonts \
"

FILES_${PN}-dbg += " \
"
