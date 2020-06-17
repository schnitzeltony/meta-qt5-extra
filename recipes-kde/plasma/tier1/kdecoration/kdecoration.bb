SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "f8fc4260bc0b416aa6f32ebf3f6986bc"
SRC_URI[sha256sum] = "c8f810a5de5a3a5188dbc01e407a221dc7c777e0a4065268f504831f26b5177e"
