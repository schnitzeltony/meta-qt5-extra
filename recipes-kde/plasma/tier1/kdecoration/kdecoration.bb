SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "65ad6be44bae48a8b95282f38a172bd5"
SRC_URI[sha256sum] = "204af624e57116ce92e32be0eadb070fb4ac742f082052af7c84706218803957"
