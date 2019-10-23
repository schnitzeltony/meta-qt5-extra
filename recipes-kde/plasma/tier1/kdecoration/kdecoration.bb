SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c0d35ee2afaa24bf167f5ab0081d6485"
SRC_URI[sha256sum] = "4f8f7d851b19e141e91eadb4ddbf2fef2d6496839a929349a1568d618bb0be39"
