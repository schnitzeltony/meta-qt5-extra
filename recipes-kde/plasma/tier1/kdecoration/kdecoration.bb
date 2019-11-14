SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "57d33092638b1671546f5aa58f62939a"
SRC_URI[sha256sum] = "9c0bb9f0d8ac8df73adbd68606260503e4fc389888da47d92635f3f2a6a2a0bb"
