SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "5e44ce8c340a2776d0c26c01e052de98"
SRC_URI[sha256sum] = "aa77507dcf357243cca9002764f8c8d1c8404d7e5b7249ad0d0f900f0a47ace4"
