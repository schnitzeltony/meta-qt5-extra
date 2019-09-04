SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "bc861c4dd47e28075a9e40a192f97e22"
SRC_URI[sha256sum] = "2b8c7b7cf114d0eff4ec842009cda264d8cf1254ec4bf65868b6d26f263829bb"
