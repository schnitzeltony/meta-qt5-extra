SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "deca0774e81fd814f4abd4e0e41f4d97"
SRC_URI[sha256sum] = "d1ba783cf18f2ddf948caa1a36ca229903dff10129441484d023da50222f8cfb"
