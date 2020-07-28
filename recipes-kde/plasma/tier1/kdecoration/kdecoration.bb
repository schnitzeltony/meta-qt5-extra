SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "018aa45f5cf8e43e7a20618928affebe"
SRC_URI[sha256sum] = "e4b2553d3b67e8c31c30a6c0748e2e1435b6b9c5790f17188c669723d356531e"
