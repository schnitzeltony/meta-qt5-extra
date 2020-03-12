SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "150da856a2dab8e28f76011638f23869"
SRC_URI[sha256sum] = "07f3f73162e18752387d186f8f286743c934fe59d1f5e5f9a0e6348e6394de4d"
