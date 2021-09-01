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
SRC_URI[sha256sum] = "b577202eefaad7b95e701c1ce14108fbfe4ae6fd73ce46c369a2a7a329211bef"
