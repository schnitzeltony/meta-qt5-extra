SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "441e2e31a1fc3b74da1cedb70c300f6b"
SRC_URI[sha256sum] = "7d8f0128306d436aeba010e47a3dddbcb9fb9fd05ef9308cbad1934914875cd9"
