SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "7a6be92e4efd687996ce8d4e7068842a"
SRC_URI[sha256sum] = "d6d25e6894d941001af035497388aa998599d89df0ca2847c8aa6275b9bf9266"
