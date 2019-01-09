SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "8cd8c2b5f0ba1e315479e4972821b25f"
SRC_URI[sha256sum] = "361eac4fa240208628ca689a8de614eb9dc79c41283cad24e814a98b41a4b784"
