SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "1195f11a0f135da965f7c84a0b535ad6"
SRC_URI[sha256sum] = "b8b43860f378e3f182ea77e014bc5282c71eaff8b26e67a58807839fb3e19edd"
