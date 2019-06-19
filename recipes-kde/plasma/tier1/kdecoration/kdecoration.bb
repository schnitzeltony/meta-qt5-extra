SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "abf350cf1eae35a447237dc04ecdae82"
SRC_URI[sha256sum] = "37d8bd4eb28b268536d7eab88746a6bc37a82e99eade9b3e3ee6663a8aa3263c"
