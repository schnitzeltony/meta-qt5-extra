SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPL-2.0 & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "1587aeab3743cb426318d4639e53b81c6227d114fc96b082b897cde6a2b0c327"
