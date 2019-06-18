SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "68ee143286cb17b0d5f6c2f278538052"
SRC_URI[sha256sum] = "87f97de50c64cf60b8322c6e883fc8d06659f5089643f4d11487ade84c98d758"
