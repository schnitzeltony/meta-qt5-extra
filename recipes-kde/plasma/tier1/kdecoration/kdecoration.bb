SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "f36b1c0766b29e7b25283cb7fd19ffd0"
SRC_URI[sha256sum] = "1a6bf44f9dce92e6923d3bb0b342790944c078604211caeeaa642556b43be712"
