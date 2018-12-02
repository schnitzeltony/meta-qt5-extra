SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "014d15755600481d8bd2125d82776510"
SRC_URI[sha256sum] = "f3ffc122b52aae490f4efb1ecc131e2d2575a9305dd8df6adead48892cd4d882"
