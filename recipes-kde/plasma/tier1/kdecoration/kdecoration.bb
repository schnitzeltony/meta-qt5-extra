SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "cb64f7350eb4d082087ddc43d8d1ffd8"
SRC_URI[sha256sum] = "79b089269ce2fb830f3c3814b952dde3b64b90f092238ce96b2ae8056429debf"
