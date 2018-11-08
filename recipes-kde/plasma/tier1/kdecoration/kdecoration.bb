SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "7b13d816864ebafe4325e51ff34cac26"
SRC_URI[sha256sum] = "e8edd41d012b4c5c749007f586f87f203bc6f615f7cf4bab2fad8edf1c752e6a"
