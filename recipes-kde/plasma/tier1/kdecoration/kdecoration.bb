SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "8948e4e4a5dc729e1036507489f1e06f"
SRC_URI[sha256sum] = "a095b5e99f42b1b8b0f6e3280b9f52ca46dcb9386e768ae66fa4bee6e1c1ad40"
