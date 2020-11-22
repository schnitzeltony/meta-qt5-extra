SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "ce3ef7bb09405645699939cc3481d1fad67b1c5b758b64adfc4d81e5ffb1c85e"
