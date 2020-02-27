SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "362564a5e273403dd3c86b484d950872"
SRC_URI[sha256sum] = "4930680158119bbd5357ff59ee4515d77c5e21c6f7914c68b2302f409f7a7595"
