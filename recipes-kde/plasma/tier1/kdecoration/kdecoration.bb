SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "38d1fef7cf2589f2d835127bd71aa2b7"
SRC_URI[sha256sum] = "b9e2f64e5ac35aa5a1552696e51cc71da84335df668456797294648d9c3f15a0"
