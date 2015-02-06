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
SRC_URI[md5sum] = "4868641ea354177bca6873e7798398ad"
SRC_URI[sha256sum] = "71d2d5781921829c0489ff4b3e1c0902ab40aa0ebb1e247dd55e59322df35080"

EXTRA_OECMAKE += "-DOXYGEN_FONT_INSTALL_DIR=${datadir}/fonts/truetype/oxygen"

FILES_${PN} += " \
    ${datadir}/fonts \
"

FILES_${PN}-dbg += " \
"
