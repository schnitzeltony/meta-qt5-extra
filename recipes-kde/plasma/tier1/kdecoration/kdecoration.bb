SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "be7cccb3859c253740ad20eae56a1457"
SRC_URI[sha256sum] = "22816ea3407ded2aa82e10d2caa88aa9bf86475d6b6eec39d9564d7dc06013d2"
