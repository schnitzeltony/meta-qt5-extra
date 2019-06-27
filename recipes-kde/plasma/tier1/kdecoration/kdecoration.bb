SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "646b23861818625956ad0fea74839803"
SRC_URI[sha256sum] = "4948c97f714d9cbd43121084583c4db00ef04ccd540ee0c5362c7805d740e245"
