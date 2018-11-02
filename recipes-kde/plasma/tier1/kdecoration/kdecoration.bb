SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "a34c74a5b7d81d6993187c6b8cdafba1"
SRC_URI[sha256sum] = "956101615de3257769daf8363bca78da0e2ce61687f5851ce9f14732a191a0f1"
